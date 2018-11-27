package id.ac.ub.filkom.rendicahya.utils.matrix.interfaces;

public interface MatrixIntegerMapper {

    byte[][] operate(byte[][] a, int b);

    short[][] operate(short[][] a, int b);

    int[][] operate(int[][] a, int b);

    long[][] operate(long[][] a, int b);

    float[][] operate(float[][] a, int b);

    double[][] operate(double[][] a, int b);
}
