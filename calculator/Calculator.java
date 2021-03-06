package calculator;

import java.util.Arrays;
import java.lang.Math;


/**
 * Created by Akash Bhave on 1/21/2016.
 */
public class Calculator {
    public static void main(String[] args) {
        GUI.main(args);
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
class advFun {
    // Finds the sine of a number
    public static double sin(double val) {
        double ans = Math.sin(val);
        return ans;
    }// Finds the cosine of a number
    public static double cos(double val) {
        double ans = Math.cos(val);
        return ans;
    }// Finds the tangent of a number
    public static double tan(double val) {
        double ans = Math.tan(val);
        return ans;
    }
    // Finds the cosecant(inverse of sine) of a number
    public static double csc(double val) {
        double ans = 1 / (Math.sin(val));
        return ans;
    }// Finds the secant(inverse of cosine) of a number
    public static double sec(double val) {
        double ans = 1 / (Math.cos(val));
        return ans;
    }// Finds the cotangent(inverse of tangent) of a number
    public static double cot(double val) {
        double ans = 1 / (Math.tan(val));
        return ans;
    }
    // Returns the natural logarithm of a number
    public static double natlog(double val) {
        double ans = Math.log(val);
        return ans;
    }
    // Returns the logarithm of a number
    public static double log10(double val) {
        double ans = Math.log10(val);
        return ans;
    }

}
class statFun {
    // Returns the mean of a data set
    public static double mean(double ... vals) {
        double summation = 0;
        int valCount = 0;
        for(double val : vals) {
            summation += val;
            valCount ++;
        }
        double mean = summation / valCount;
        return mean;
    }// Returns the median of a data set
    public static double median(double ... vals) {
        Arrays.sort(vals);
        double median;
        if (vals.length % 2 == 0) {
            // Finds the two numbers in the middle and finds the average
            median = ((double) vals[vals.length / 2] + (double) vals[vals.length / 2 - 1]) / 2;
            return median;
        } else {
            median = (double) vals[vals.length / 2];
        return median;
        }

    }// Returns the GREATEST mode of the data set
    public static double mode(double ... vals) {
        double maxValue = -1;
        int maxCount = 0;
        for(int i = 0; i < vals.length; i++) {
            // count number of times vals[i] is in array
            int count = 0;
            for(int j = 0; j < vals.length; j++) {
                if(vals[j] == vals[i]) {
                    count++;
                }
            }

            // remember the highest count we have seen
            if(count > maxCount) {
                maxValue = vals[i];
                maxCount = count;
            }
        }
        return maxValue;
    }
    // Returns the range of the data set
    public static double range(double ... vals) {
        Arrays.sort(vals);
        int lastVal = vals.length - 1;
        double range = vals[lastVal] - vals[0];
        return range;
    }
    // Finds the Mean Absolute Deviation of a data set
    public static double mad(double ... vals) {
        // sums all the numbers
        double summation = 0;
        int valCount = 0;
        for(double val : vals) {
            summation += val;
            valCount ++;
        }
        double mean = summation / valCount;
        double madSum = 0;
        // Sums the absolute value of a number minus the mean
        for(double aVal : vals) {
            madSum += Math.abs(aVal - mean);
        }
        double mad = madSum / valCount;
        return mad;
    }
    // Finds the Standard Deviation of a data set
    public static double standev(double ... vals) {
        double summation = 0;
        int valCount = 0;
        for(double val : vals) {
            summation += val;
            valCount ++;
        }
        double mean = summation / valCount;
        double sdSum = 0;
        // Sums the value a number minus the mean squared
        for(double aVal : vals) {
            sdSum += Math.pow((aVal - mean), 2);
        }
        // SD without taking the square root
        double noSqrRoot = sdSum / valCount;
        // Takes the square root
        double standDev = Math.sqrt(noSqrRoot);
        return standDev;
    }
    // Finds the Variance of a data set
    public static double varnce(double ... vals) {
        double summation = 0;
        int valCount = 0;
        for(double val : vals) {
            summation += val;
            valCount ++;
        }
        double mean = summation / valCount;
        double varSum = 0;
        // Sums the value a number minus the mean squared
        for(double aVal : vals) {
            varSum += Math.pow((aVal - mean), 2);
        }
        // SD without taking the square root
        double variance = varSum / valCount;
        return variance;

    }
}
