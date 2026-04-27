import static java.lang.Math.*;

class Tridiagonals
{
static double[][] exampleMatrix(int n) 
    {
        if (n<=0) 
        {return null;}
        
        double [][] result = new double[3][n];
        
        for (int i=0;i<n; i++)
        {result[1][i] = -(i+1)*(i+1);}
        
        for (int i=0;i<n-1; i++)
        {result[0][i] = 1;
        result[2][i] = i+2;}
        return result;
        }
        //double m[][] = new double [1][1]; //dummy code: write your own
        //return m; //dummy code: write your own
    }

