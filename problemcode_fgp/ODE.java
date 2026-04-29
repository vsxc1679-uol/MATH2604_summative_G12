import static java.lang.Math.*;

class ODE
{
    public static float solve(float a, int n) {
        double h = (1d/(n+1));
        double[][] M = new double [3][n];
        for (int i=1; i<=n; i++) {
            M[0][i-1] = -1;
            M[1][i-1] = 2 + (h * h * Math.cos((i*h)));
            M[2][i-1] = -1;
        }
        double [] rhsVec = new double [n];
        for (int i=1; i<=n; i++) {
            rhsVec[i-1] = -1*(h*h) * (a * (i*h) * (i*h));
        }
        double [] outcomeVec = Tridiagonals.linearSolve(M, rhsVec);
        if (n % 2 == 1) { //testing if n is odd, if so then there is a exact midpoint aka f(0.5)
            double outcome = outcomeVec[((n+1)/2) - 1]; //using n+1/2 - 1 in order to find midpoint index (hence the - 1) where ih = 0.5
            float result = (float) outcome;
            return result;
        }
        else { //as n is even, there is no exact midpoint thus we use the average of the two middle index
            double outcome = (outcomeVec[((n)/2) - 1] + outcomeVec[(n/2)]) / 2;
            float result = (float) outcome;
            return result;
        }  
    }
}

