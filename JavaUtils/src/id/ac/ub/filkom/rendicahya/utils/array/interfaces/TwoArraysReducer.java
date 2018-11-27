package id.ac.ub.filkom.rendicahya.utils.array.interfaces;

public interface TwoArraysReducer {

    byte reduce(byte[] a, byte[] b);

    short reduce(short[] a, short[] b);

    int reduce(int[] a, int[] b);

    long reduce(long[] a, long[] b);

    float reduce(float[] a, float[] b);

    double reduce(double[] a, double[] b);
}
