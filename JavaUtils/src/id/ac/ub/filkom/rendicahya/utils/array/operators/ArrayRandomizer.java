package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayTwoValueMapper;

// Input 1: [0, 0, 0, 0, 0, 0]
// Input 2: 0
// Input 3: 10
// Output: [4, 7, 1, 9, 5, 7]
public class ArrayRandomizer implements ArrayTwoValueMapper {
  
  @Override
    public byte[] operate(byte[] a, int b, int c) {
        byte[] d = new byte[a.length];
        for (int i = 0; i < d.length; i++) {
            d[i] = (byte) ((Math.random() * (c - b + 1)) + b);
        }
        return d;
    }

    @Override
    public short[] operate(short[] a, short b, short c) {
        short[] d = new short[a.length];
        for (int i = 0; i < d.length; i++) {
            d[i] = (short) ((Math.random() * (c - b + 1)) + b);
        }
        return d;
    }

    @Override
    public int[] operate(int[] a, short b, short c) {
        int[] d = new int[a.length];
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) ((Math.random() * (c - b + 1)) + b);
        }
        return d;
    }

    @Override
    public long[] operate(long[] a, long b, long c) {
        long[] d = new long[a.length];
        for (int i = 0; i < d.length; i++) {
            d[i] = (long) ((Math.random() * (c - b + 1)) + b);
        }
        return d;
    }

    @Override
    public float[] operate(float[] a, float b, float c) {
        float[] d = new float[a.length];
        for (int i = 0; i < d.length; i++) {
            d[i] = (float) ((Math.random() * (c - b + 1)) + b);
        }
        return d;
    }

    @Override
    public double[] operate(double[] a, double b, double c) {
        double[] d = new double[a.length];
        for (int i = 0; i < d.length; i++) {
            d[i] = (double) ((Math.random() * (c - b + 1)) + b);
        }
        return d;
    }
  
}
