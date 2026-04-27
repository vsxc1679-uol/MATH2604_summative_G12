import static java.lang.Math.*;

class Tridiagonals
{
static double[][] exampleMatrix(int n) 
    {
        if (n<=0) 
        {return null;}
        // if n=0 or less it is not a valid matrix, hence null is returned
        double [][] result = new double[3][n];
        //Creating storage for the new matrix.
        //[3][n] accounts for the main, upper and lower diagonal, where each has
        //length n
        for (int i=0;i<n; i++)
        //loops from 0 to n-1
        {result[1][i] = -(i+1)*(i+1);}
        //fills main diagonal (e.g. i=0 -> -(1*1) = -1
        for (int i=0;i<n-1; i++)
        //loops from 0 to n-2 since upper and lower diagonals are shorter by 1
        {result[0][i] = 1;
        //fills upper diagonals with 1
        result[2][i] = i+2;}
        //fills lower diagonal (e.g. i=0 -> 2)
        return result;
        }
        
static double[][] productWithDiagonal(double[] d, double[][] t)
// d -> diagonal matrix
// t -> tridiagonal matrix
    {
        if (d==null || t==null) 
        {return null;}
        // if inputs dont exists, return null
        if (t.length != 3) 
        {return null;}
        // a valid tridiagonal matrix should have 3 rows
        if (t[0] == null || t[1] == null || t[2] == null) 
        {return null;}
        //checks to see whether the main, upper or lower values are missing
        int n = d.length; 
        //assigning the size of the matrix to a variable
        if (n==0) 
        {return null;}
        // if n=0,  it is not a valid matrix, hence null is returned
        if (t[0].length != n || t[1].length != n || t[2].length !=n)
        {return null;}
        // ensures that the matrix and tridiagonal matrix are the same size
        double[][] result = new double[3][n];
        //creates an empty array for the result
        for (int i=0; i<n; i++)
        {result[1][i] = d[i]*t[1][i];}
        //multiplying each tridiagonal main entry with the diagonals
        for (int i=0; i<n-1; i++)
        {result[0][i] = d[i]*t[0][i];
         result[2][i] = d[i+1]*t[2][i];}
        //multiplying the upper with d[i] and lower diagonals with d[i+1]
        //diagonal matrix essentially acts as a row scaler
        return result;
    } 
    
public static boolean isValidTridiagonal (double[][] a) {
    if (a == null) {
        return false; // checks if input exists
    }
    if (a.length != 3) {
        return false; // checks for compatible length
    }
    if (a[0] == null || a[1] == null || a[2] == null) {
    return false; // checks for empty rows
    }
    if (a[1].length < 1 || a[2].length != a[1].length || a[0].length != a[1].length) {
        return false; // checks for uniform lengths
    }
    else {
        return true;
    }
    }
}

