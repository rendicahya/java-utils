package id.ac.ub.filkom.rendicahya.utils.array.interfaces;

public interface ArrayToDoubleArrayMapper {

    double[] reduce(byte[] input);

    double[] reduce(short[] input);

    double[] reduce(int[] input);

    double[] reduce(long[] input);

    double[] reduce(float[] input);

    double[] reduce(double[] input);
}
