package id.ac.ub.filkom.rendicahya.utils.array.interfaces;

public interface ArrayValueToIntReducer {

    int reduce(byte[] a, byte b);

    int reduce(short[] a, short b);

    int reduce(int[] a, int b);

    int reduce(long[] a, long b);

    int reduce(float[] a, float b);

    int reduce(double[] a, double b);
}
