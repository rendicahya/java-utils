package id.ac.ub.filkom.rendicahya.utils.matrix.interfaces;

public interface TwoMatricesToIntOrDoubleArrayMapper {

    int[][] operate(byte[][] a, byte[][] b);

    int[][] operate(short[][] a, short[][] b);

    int[][] operate(int[][] a, int[][] b);

    long[][] operate(long[][] a, long[][] b);

    double[][] operate(float[][] a, float[][] b);

    double[][] operate(double[][] a, double[][] b);
}
