package Calculator;

import java.util.Arrays;
import java.lang.Math;

/**
 * Created by Akash Bhave on 1/19/2016.
 */
public class calc1 {
    public static void main(String[] args) {
        System.out.println(basFun.add(34.0192312, -45.23453));
        System.out.println(basFun.subt(34.0192312, -45.23453));
        System.out.println(basFun.mult(34.0192312, -45.23453));
        System.out.println(basFun.divd(34.0192312, -45.23453));
        System.out.println(basFun.mod(34.0192312, -45.23453));
        System.out.println(basFun.abs(-2342.17645));
        System.out.println(basFun.exp(4, 4));
    }
}
class basFun {
    // Adds two numbers
    public static double add(double val1, double val2) {
        double ans = val1 + val2;
        return ans;
    }
    // Subtracts two numbers
    public static double subt(double val1,double val2) {
        double ans = val1 - val2;
        return ans;
    }
    // Multiplies two numbers
    public static double mult(double val1,double val2) {
        double ans = val1 * val2;
        return ans;
    }
    // Divides two numbers
    public static double divd(double val1,double val2) {
        double ans = val1 / val2;
        return ans;
    }
    // Finds the remainder of two numbers
    public static double mod(double val1,double val2) {
        double ans = val1 % val2;
        return ans;
    }
    // Finds the absolute value of a number
    public static double abs(double val) {
        double ans = Math.abs(val);
        return ans;
    }
    // Calculates one number to the nth power
    public static double exp(double base, double power) {
        double ans = Math.pow(base, power);
        return ans;
    }
    // Squares the given number
    public static double sqre(double val) {
        double ans = val * val;
        return ans;
    }
    // Finds the square root of a given number
    public static double sqrt(double val) {
        double ans = Math.sqrt(val);
        return ans;
    }
}