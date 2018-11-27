package id.ac.ub.filkom.rendicahya.utils.matrix.interfaces;

public interface TwoMatricesPredicate {

    boolean test(byte[][] a, byte[][] b);

    boolean test(short[][] a, short[][] b);

    boolean test(int[][] a, int[][] b);

    boolean test(long[][] a, long[][] b);

    boolean test(float[][] a, float[][] b);

    boolean test(double[][] a, double[][] b);
}
