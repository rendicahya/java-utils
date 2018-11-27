package id.ac.ub.filkom.rendicahya.utils.array.interfaces;

public interface ArrayToIntegerOrDoubleReducer {

    int reduce(byte[] input);

    int reduce(short[] input);

    int reduce(int[] input);

    long reduce(long[] input);

    double reduce(float[] input);

    double reduce(double[] input);
}
