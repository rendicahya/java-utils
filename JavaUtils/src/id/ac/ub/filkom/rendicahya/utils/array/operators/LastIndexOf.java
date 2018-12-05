package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayIntToIntReducer;

// Input 1: [6, 3, 5, 8, 9, 2, 5, 8, 4]
// Input 2: 5
// Output: 6
public class LastIndexOf implements ArrayIntToIntReducer {

    @Override
    public int reduce(byte[] a, int b) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b)
                c = i;
        }
        return c;
    }

    @Override
    public int reduce(short[] a, int b) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b)
                c = i;
        }
        return c;
    }

    @Override
    public int reduce(int[] a, int b) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b)
                c = i;
        }
        return c;
    }

    @Override
    public int reduce(long[] a, int b) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b)
                c = i;
        }
        return c;
    }

    @Override
    public int reduce(float[] a, int b) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b)
                c = i;
        }
        return c;
    }

    @Override
    public int reduce(double[] a, int b) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==b)
                c = i;
        }
        return c;
    }
}
