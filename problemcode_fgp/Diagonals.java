import static java.lang.Math.*;

class Diagonals
{
    static double[] sum(double[] a, double[] b)
    {
        if (a==null || b==null)
        {return null;}
        
        if (a.length != b.length) 
        {return null;}
        
        double [] result = new double[a.length];
        
        for (int i=0; i<a.length; i++) 
        {result[i] = a[i] + b[i];}
        
        return result;
    }
    static double[] product(double[] a, double[]b)
    {
        if (a==null || b==null)
        {return null;}
        
        if (a.length != b.length) 
        {return null;}
        
        double[]result = new double[a.length];
        
        for (int i=0; i<a.length; i++)
        {result[i] = a[i]*b[i];}
        
        return result;
    }
}
