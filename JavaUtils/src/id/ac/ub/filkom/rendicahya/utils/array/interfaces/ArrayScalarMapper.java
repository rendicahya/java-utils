package id.ac.ub.filkom.rendicahya.utils.array.interfaces;

public interface ArrayScalarMapper {

    byte[] operate(byte[] a, byte b);

    short[] operate(short[] a, short b);

    int[] operate(int[] a, int b);

    long[] operate(long[] a, long b);

    float[] operate(float[] a, float b);

    double[] operate(double[] a, double b);
}
