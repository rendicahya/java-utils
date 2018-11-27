package id.ac.ub.filkom.rendicahya.utils.matrix.interfaces;

public interface MatrixTwoValueMapper {

    byte[][] operate(byte[][] a, byte b, byte c);

    short[][] operate(short[][] a, short b, short c);

    int[][] operate(int[][] a, int b, int c);

    long[][] operate(long[][] a, long b, long c);

    float[][] operate(float[][] a, float b, float c);

    double[][] operate(double[][] a, double b, double c);
}
