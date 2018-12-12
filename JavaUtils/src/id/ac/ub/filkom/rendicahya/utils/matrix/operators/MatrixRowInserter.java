package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixArrayIntMapper;

// Input 1: [[1, 2, 3],
//           [4, 5, 6],
//           [7, 8, 9]]
// Input 2: [0, 0, 0]
// Input 3: 2
// Output: [[1, 2, 3],
//          [4, 5, 6],
//          [0, 0, 0],
//          [7, 8, 9]]
public class MatrixRowInserter implements MatrixArrayIntMapper {

    @Override
    public byte[][] map(byte[][] a, byte[] b, int c) {
        byte[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        byte[][] matrixTemp = new byte[3][3];
        byte[][] matrixPlus = new byte[3][3];
        int d[] = {1, 0, 0};
        for (int j = c; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrixTemp[j][i] = a[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[i + 1][j] = matrixTemp[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[c][j] = (byte) d[j];
                matrixPlus[c + 1][j] = matrixTemp[c][j];
            }
        }
        return a;
    }

    @Override
    public short[][] map(short[][] a, short[] b, int c) {
        short[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        short[][] matrixTemp = new short[3][3];
        short[][] matrixPlus = new short[3][3];
        int d[] = {1, 0, 0};
        for (int j = c; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrixTemp[j][i] = a[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[i + 1][j] = matrixTemp[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[c][j] = (short) d[j];
                matrixPlus[c + 1][j] = matrixTemp[c][j];
            }
        }
        return a;
    }

    @Override
    public int[][] map(int[][] a, int[] b, int c) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrixTemp = new int[3][3];
        int[][] matrixPlus = new int[3][3];
        int d[] = {1, 0, 0};
        for (int j = c; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrixTemp[j][i] = a[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[i + 1][j] = matrixTemp[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[c][j] = d[j];
                matrixPlus[c + 1][j] = matrixTemp[c][j];
            }
        }
        return a;
    }

    @Override
    public long[][] map(long[][] a, long[] b, int c) {
        long[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        long[][] matrixTemp = new long[3][3];
        long[][] matrixPlus = new long[3][3];
        int d[] = {1, 0, 0};
        for (int j = c; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrixTemp[j][i] = a[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[i + 1][j] = matrixTemp[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[c][j] = d[j];
                matrixPlus[c + 1][j] = matrixTemp[c][j];
            }
        }
        return a;
    }

    @Override
    public float[][] map(float[][] a, float[] b, int c) {
        float[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        float[][] matrixTemp = new float[3][3];
        float[][] matrixPlus = new float[3][3];
        int d[] = {1, 0, 0};
        for (int j = c; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrixTemp[j][i] = a[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[i + 1][j] = matrixTemp[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[c][j] = d[j];
                matrixPlus[c + 1][j] = matrixTemp[c][j];
            }
        }
        return a;
    }

    @Override
    public double[][] map(double[][] a, double[] b, int c) {
        double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] matrixTemp = new double[3][3];
        double[][] matrixPlus = new double[3][3];
        int d[] = {1, 0, 0};
        for (int j = c; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrixTemp[j][i] = a[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[i + 1][j] = matrixTemp[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixPlus[c][j] = d[j];
                matrixPlus[c + 1][j] = matrixTemp[c][j];
            }
        }
        return a;
    }
}
