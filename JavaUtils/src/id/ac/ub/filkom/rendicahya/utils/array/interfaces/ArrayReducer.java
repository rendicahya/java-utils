package id.ac.ub.filkom.rendicahya.utils.array.interfaces;

public interface ArrayReducer {

    byte reduce(byte[] input);

    short reduce(short[] input);

    int reduce(int[] input);

    long reduce(long[] input);

    float reduce(float[] input);

    double reduce(double[] input);
}
