package id.ac.ub.filkom.rendicahya.utils.array.interfaces;

public interface ArrayTwoValueMapper {

    byte[] operate(byte[] a, int b, int c);

    short[] operate(short[] a, short b, short c);

    int[] operate(int[] a, short b, short c);

    long[] operate(long[] a, long b, long c);

    float[] operate(float[] a, float b, float c);

    double[] operate(double[] a, double b, double c);
}
