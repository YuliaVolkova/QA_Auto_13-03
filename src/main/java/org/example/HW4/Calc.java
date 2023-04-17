package org.example.HW4;

public class Calc {
    public static double sum(int n, double m){
        return n+m;

    }

    public static double min(int n, double m) {
        return n-m;
    }

    public static double multip(int n,  double m) {
        return n*m;
    }

    public static double div(int n, double m) {

            if (m == 0) {
                System.out.println("ERROR / by zero");
                return 0;

            }
            return n/m;
    }

    public static double per(int n, double m) {
        return ((n*100)/m);
    }
}
