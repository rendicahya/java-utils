package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayToIntOrDoubleReducer;

/**
 * 
 * @author Muhammad Farhan Abdur Rosyid, @nim 185150201111047
 * This operator function works to get the amount of data in an array.
 * Based on what kind of data type(byte, short, int, long, float, double).
 * Declare the variable of Summer, than just operate this function by using the variable.
 * Ex :
 * Input: [1, 2, 3, 4]
 * Output: 10
 */
public class Summer implements ArrayToIntOrDoubleReducer {

    /**
     * This function is about to get the sum of byte Array. 
     * @param input byte Arrays
     * @return int
     */
    @Override
    public int reduce(byte[] input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        return sum;
    }

    /**
     * This function is about to get the sum of short Array.
     * @param input short Arrays
     * @return int
     */
    @Override
    public int reduce(short[] input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        return sum;
    }

    /**
     * This function is about to get the sum of int Array.
     * @param input int Arrays
     * @return int
     */
    @Override
    public int reduce(int[] input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        return sum;
    }

    /**
     * This function is about to get the sum of long Array.
     * @param input long Arrays
     * @return long
     */
    @Override
    public long reduce(long[] input) {
        long sum = 0;
        for (long i : input) {
            sum += i;
        }
        return sum;
    }

    /**
     * This function is about to get the sum of float Array.
     * @param input float Arrays
     * @return double
     */
    @Override
    public double reduce(float[] input) {
        double sum = 0;
        for (double i : input) {
            sum += i;
        }
        return sum;
    }

    /**
     * This function is about to get the sum of double Array.
     * @param input double Arrays
     * @return double
     */
    @Override
    public double reduce(double[] input) {
        double sum = 0;
        for (double i : input) {
            sum += i;
        }
        return sum;
    }
}
