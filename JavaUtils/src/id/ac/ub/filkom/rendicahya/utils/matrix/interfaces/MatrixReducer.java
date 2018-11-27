package id.ac.ub.filkom.rendicahya.utils.matrix.interfaces;

public interface MatrixReducer {

    byte reduce(byte[][] input);

    short reduce(short[][] input);

    int reduce(int[][] input);

    long reduce(long[][] input);

    float reduce(float[][] input);

    double reduce(double[][] input);
}
