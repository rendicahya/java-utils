package id.ac.ub.filkom.rendicahya.utils.array.interfaces;

public interface TwoArraysToDoubleReducer {

    double reduce(byte[] a, byte[] b);

    double reduce(short[] a, short[] b);

    double reduce(int[] a, int[] b);

    double reduce(long[] a, long[] b);

    double reduce(float[] a, float[] b);

    double reduce(double[] a, double[] b);
}
