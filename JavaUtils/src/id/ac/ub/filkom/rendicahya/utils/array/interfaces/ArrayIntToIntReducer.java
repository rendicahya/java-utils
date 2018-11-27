package id.ac.ub.filkom.rendicahya.utils.array.interfaces;

public interface ArrayIntToIntReducer {

    int reduce(byte[] a, int b);

    int reduce(short[] a, int b);

    int reduce(int[] a, int b);

    int reduce(long[] a, int b);

    int reduce(float[] a, int b);

    int reduce(double[] a, int b);
}
