package id.ac.ub.filkom.rendicahya.utils.matrix.interfaces;

public interface MatrixArrayIntMapper {

    byte[][] map(byte[][] a, byte[] b, int c);

    short[][] map(short[][] a, short[] b, int c);

    int[][] map(int[][] a, int[] b, int c);

    long[][] map(long[][] a, long[] b, int c);

    float[][] map(float[][] a, float[] b, int c);

    double[][] map(double[][] a, double[] b, int c);
}
