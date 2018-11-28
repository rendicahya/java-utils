package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.TwoArraysMapper;

// Input 1: [1, 2, 3]
// Input 2: [4, 5, 6]
// Output: [1, 2, 3, 4, 5, 6]
public class Appender implements TwoArraysMapper {
    @Override
    public byte[] operate(byte[] a, byte[] b) {
        byte arrAppend = new byte[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }

    @Override
    public double[] operate(double[] a, double[] b) {
        double arrAppend = new double[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }

    @Override
    public float[] operate(float[] a, float[] b) {
        float arrAppend = new float[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }

    @Override
    public int[] operate(int[] a, int[] b) {
        int arrAppend = new int[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }

    @Override
    public long[] operate(long[] a, long[] b) {
        long arrAppend = new long[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }

    @Override
    public short[] operate(short[] a, short[] b) {
        short arrAppend = new short[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }
}