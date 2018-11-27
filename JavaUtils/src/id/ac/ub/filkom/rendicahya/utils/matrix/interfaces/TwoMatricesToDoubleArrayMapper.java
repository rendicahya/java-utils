package id.ac.ub.filkom.rendicahya.utils.matrix.interfaces;

public interface TwoMatricesToDoubleArrayMapper {

    double[][] operate(byte[][] a, byte[][] b);

    double[][] operate(short[][] a, short[][] b);

    double[][] operate(int[][] a, int[][] b);

    double[][] operate(long[][] a, long[][] b);

    double[][] operate(float[][] a, float[][] b);

    double[][] operate(double[][] a, double[][] b);
}
