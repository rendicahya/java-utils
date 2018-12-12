package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayReducer;
// Input: [3, 1, 7]
// Output: 1
public class ArrayMinFinder implements ArrayReducer {

    @Override
    public byte reduce(byte[] input) {
        byte min = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }
        return min;
    }

    @Override
    public short reduce(short[] input) {
        short min = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }
        return min;
    }

    @Override
    public int reduce(int[] input) {
        int min = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }
        return min;
    }

    @Override
    public long reduce(long[] input) {
        long min = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }
        return min;    
    }

    @Override
    public float reduce(float[] input) {
        float min = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }
        return min;    
    }

    @Override
    public double reduce(double[] input) {
        double min = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
            }
        }
        return min;
    }
    
}
