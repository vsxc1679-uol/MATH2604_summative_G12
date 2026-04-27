import static java.lang.Math.*;

class Tridiagonals
{
static double[][] exampleMatrix(int n) 
    {
        double m[][] = new double [1][1]; //dummy code: write your own
        return m; //dummy code: write your own
    }

public static boolean isValidTridiagonal (double[][] a) {
    if (a == null) {
        return false;
    }
    if (a.length != 3) {
        return false;
    }
    if (a[0] == null || a[1] == null || a[2] == null) {
    return false;
    }
    if (a[1].length < 1 || a[2].length != a[1].length || a[0].length != a[1].length) {
        return false;
    }
    else {
        return true;
    }
    }
}