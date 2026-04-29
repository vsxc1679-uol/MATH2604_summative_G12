import static java.lang.Math.*;
/**
 * Public Class containing <b>solve</b> method
 */
class ODE
{
    /**
     *<h3> a function numerically approximating f(0.5) of ODE:</h3>
     *<p> d2f/dx^2 = cos(x)f(x) + <b>a</b>x^2, 0 ≤ x ≤ 1, f(0)=f(1)=0<br>where <b>a</b> is a <b>float</b> variable and <b>n</b> is the size of calculation</p>
     *<p> higher values of <b>n</b> will provide more accurate results
     *  @param a - <b>float</b> value, x coeffecient
     * @param n - <b>integer > 0 </b> (ideal: 1000~10000), size of matrix
     * @return <b>float</b> approximation of f(0.5)
     */
    public static float solve(float a, int n) {
        double h = (1d/(n+1));
        //creates double variable h (step)
        double[][] M = new double [3][n];
        //creates double type tridiagonal 2d matrix M
        for (int i=1; i<=n; i++) {
            //creates values for the triagonal matrix based on ODE
            M[0][i-1] = -1;
            M[1][i-1] = 2 + (h * h * Math.cos((i*h)));
            //sets diagonal row as values of x in h increments
            M[2][i-1] = -1;
        }
        double [] rhsVec = new double [n];
        //creates and fills right hand side vector using -(h^2)(ax^2)
        for (int i=1; i<=n; i++) {
            rhsVec[i-1] = -1*(h*h) * (a * (i*h) * (i*h));
        }
        double [] outcomeVec = Tridiagonals.linearSolve(M, rhsVec);
        //now that we have equation in form Mx = v, use linearsolve to find x vector (array of doubles)
        //as we need f(0.5), we look for the midpoint of x vector (outcomeVec)
        if (n % 2 == 1) { //testing if n is odd, if so then there is a exact midpoint aka f(0.5)
            double outcome = outcomeVec[((n+1)/2) - 1]; //using n+1/2 - 1 in order to find midpoint index where x = ih = 0.5
            float result = (float) outcome;
            //converting double to float as that is functions intended output
            return result;
        }
        else { //as n is even, there is no exact midpoint thus we use the average of the two middle index
            double outcome = (outcomeVec[((n)/2) - 1] + outcomeVec[(n/2)]) / 2;
            float result = (float) outcome;
            //converting double to float as that is functions intended output
            return result;
        }  
    }
}