package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixIntMapper;

// Input 1: [[1, 2, 3],
//           [4, 5, 6],
//           [7, 8, 9]]
// Input 2: 2
// Output: [[1, 2],
//          [4, 5],
//          [7, 8]
public class MatrixColumnRemover implements MatrixIntMapper {

    @Override
    public byte[][] operate(byte[][] a, int b) {
        byte[][] newArray = new byte[a.length][a[0].length - 1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j < b - 1) {
                    newArray[i][j] = a[i][j];
                } else if (j == b - 1) {
                    continue;
                } else {
                    newArray[i][j - 1] = a[i][j];
                }
            }
        }
        
        return newArray;
    }

    @Override
    public short[][] operate(short[][] a, int b) {
        short[][] newArray = new short[a.length][a[0].length - 1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j < b - 1) {
                    newArray[i][j] = a[i][j];
                } else if (j == b - 1) {
                    continue;
                } else {
                    newArray[i][j - 1] = a[i][j];
                }
            }
        }
        return newArray;
    }

    @Override
    public int[][] operate(int[][] a, int b) {
        int[][] newArray = new int[a.length][a[0].length - 1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j < b - 1) {
                    newArray[i][j] = a[i][j];
                } else if (j == b - 1) {
                    continue;
                } else {
                    newArray[i][j - 1] = a[i][j];
                }
            }
        }
        return newArray;
    }

    @Override
    public long[][] operate(long[][] a, int b) {
        long[][] newArray = new long[a.length][a[0].length - 1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j < b - 1) {
                    newArray[i][j] = a[i][j];
                } else if (j == b - 1) {
                    continue;
                } else {
                    newArray[i][j - 1] = a[i][j];
                }
            }
        }
        return newArray;
    }

    @Override
    public float[][] operate(float[][] a, int b) {
        float[][] newArray = new float[a.length][a[0].length - 1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j < b - 1) {
                    newArray[i][j] = a[i][j];
                } else if (j == b - 1) {
                    continue;
                } else {
                    newArray[i][j - 1] = a[i][j];
                }
            }
        }
        return newArray;
    }

    @Override
    public double[][] operate(double[][] a, int b) {
        double[][] newArray = new double[a.length][a[0].length - 1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j < b - 1) {
                    newArray[i][j] = a[i][j];
                } else if (j == b - 1) {
                    continue;
                } else {
                    newArray[i][j - 1] = a[i][j];
                }
            }
        }
        return newArray;
    }
}
