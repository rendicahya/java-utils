package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayReducer;


// Input: [3, 1, 7]
// Output: 7

/**
 * 
 * @author this method functions to find biggest value of arrays
 */
public class ArrayMaxFinder implements ArrayReducer {

    @Override
    public byte reduce(byte[] input) {
        byte max = 0;
        for (int i = 0; i < input.length; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max;
    }

    @Override
    public short reduce(short[] input) {
        short max = 0;
        for (int i = 0; i < input.length; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max;
    }

    @Override
    public int reduce(int[] input) {
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max;
    }

    @Override
    public long reduce(long[] input) {
        long max = 0;
        for (int i = 0; i < input.length; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max;
    }

    @Override
    public float reduce(float[] input) {
        float max = 0;
        for (int i = 0; i < input.length; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max;
    }

    @Override
    public double reduce(double[] input) {
        double max = 0;
        for (int i = 0; i < input.length; i++) {
            if (max < input[i]) {
                max = input[i];
            }
        }
        return max;
    }
}
