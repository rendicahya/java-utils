package id.ac.ub.filkom.rendicahya.utils.array.interfaces;

public interface ArrayScalarToBooleanFunction {

    boolean operate(byte[] a, byte b);

    boolean operate(short[] a, short b);

    boolean operate(int[] a, int b);

    boolean operate(long[] a, long b);

    boolean operate(float[] a, float b);

    boolean operate(double[] a, double b);
}
