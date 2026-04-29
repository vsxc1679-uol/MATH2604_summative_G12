import static java.lang.Math.*;
class Diagonals
{
    public static double[] exampleMatrix(){
        return new double[]{10, 8, 5, -10, 7};
    }
    
    //Sum function for diagonals
    static double[] sum(double[] a, double[] b)
    //function takes two sets doubles (e.g. {1,2,3} and classifies them as a & b)
    {
        if (a==null || b==null)
        {return null;}
        // if a or/and b is null, the function returns null
        if (a.length != b.length) 
        {return null;}
        // if the length of a does not equal the length of b, the function 
        //returns null again. The given matricies must be the same size
        double [] result = new double[a.length];
        //This creates an empty array to store the answer
        for (int i=0; i<a.length; i++) 
        {result[i] = a[i] + b[i];}
        //Loops through every diagonal entry for both a and b and adds a's ith entry 
        //with b's ith entry.
        return result;
    }
    
    static double[] product(double[] a, double[]b)
    {
        if (a==null || b==null)
        {return null;}
        // if a or/and b is null, the function returns null
        if (a.length != b.length) 
        {return null;}
        // if the length of a does not equal the length of b, the function 
        //returns null again. The given matricies must be the same size
        double[]result = new double[a.length];
        //This creates an empty array to store the answer
        for (int i=0; i<a.length; i++)
        {result[i] = a[i]*b[i];}
        //Loops through every diagonal entry for both a and b and multiplies a's 
        //ith entry with b's ith entry.
        return result;
    }
    /**
    * <h3>a function that <b>inverses a diagonal matrix </b></h3>
    * 
    * <p>input array should be invertible (no zeros)</p>
    * <p>in case of null input function will return null, same for 0's in list </p
    * @param a - an array of double types, your diagonal matrix
    * @return the inverted diagonal matrix as an array of double types
    */
    static double[] inverse(double[] a) {
        if (a==null) {
            //failsafe for null
            return null;
        }
        if (a.length==0) {
            //checking if list is length 0, if yes return same list
            return a;
        }
        for (int i = 0; i < a.length; i++) {//looping over all elements of a
            if (a[i] == 0) { 
                //check 0's to avoid /0 error
                return null;
            }
            a[i] = (1d/a[i]);
            //replaces values in array with inverted versions 'd' to ensure no integer error
        }
        return a;
    }
        
}