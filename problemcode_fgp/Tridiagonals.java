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
static double[][] productWithDiagonal(double[] d, double[][] t)
    {
        if (d==null || t==null) 
        {return null;}

        if (t.length != 3) 
        {return null;}

        if (t[0] == null || t[1] == null || t[2] == null) 
        {return null;}

        int n = d.length; 
        
        if (n==0) 
        {return null;}
        
        if (t[0].length != n || t[1].length != n || t[2].length !=n)
        {return null;}
        
        double[][] result = new double[3][n];
        
        for (int i=0; i<n; i++)
        {result[1][i] = d[i]*t[1][i];}
        
        for (int i=0; i<n-1; i++)
        {result[0][i] = d[i]*t[0][i];
         result[2][i] = d[i+1]*t[2][i];}
         
        return result;
    } 
    }
    

