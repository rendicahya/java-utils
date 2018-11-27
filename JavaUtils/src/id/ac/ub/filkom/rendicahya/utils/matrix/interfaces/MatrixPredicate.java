package id.ac.ub.filkom.rendicahya.utils.matrix.interfaces;

public interface MatrixPredicate {

    boolean test(byte[][] input);

    boolean test(short[][] input);

    boolean test(int[][] input);

    boolean test(long[][] input);

    boolean test(float[][] input);

    boolean test(double[][] input);
}
