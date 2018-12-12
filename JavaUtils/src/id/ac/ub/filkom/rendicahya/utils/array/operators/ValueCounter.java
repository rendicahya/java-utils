package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayValueToIntReducer;

// Input 1: [1, 5, 3, 6, 7, 5, 4]
// Input 2: 5
// Output: 2
public class ValueCounter implements ArrayValueToIntReducer {

    @Override
    public int reduce(byte[] a, byte b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int reduce(short[] a, short b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int reduce(int[] a, int b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int reduce(long[] a, long b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int reduce(float[] a, float b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int reduce(double[] a, double b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b) {
                count++;
            }
        }
        return count;
    }
}
