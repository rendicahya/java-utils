package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.TwoArraysScalarMapper;

// Input 1: [1, 2, 3]
// Input 2: [7, 8, 9]
// Input 3: 2
// Output: [1, 2, 7, 8, 9, 3]
public class ArrayInserter implements TwoArraysScalarMapper {

    public byte[] operate(byte[] a, byte[] b, int c) {
        byte result[] = new byte[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, c, b.length);
        return result;
    }

    @Override
    public short[] operate(short[] a, short[] b, int c) {
        short result[] = new short[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, c, b.length);
        return result;
    }

    @Override
    public int[] operate(int[] a, int[] b, int c) {
        int result[] = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, c, b.length);
        return result;
    }

    @Override
    public long[] operate(long[] a, long[] b, int c) {
        long result[] = new long[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, c, b.length);
        return result;
    }

    @Override
    public float[] operate(float[] a, float[] b, int c) {
        float result[] = new float[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, c, b.length);
        return result;
    }

    @Override
    public double[] operate(double[] a, double[] b, int c) {
        double result[] = new double[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, c, b.length);
        return result;
    }
}
