package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixValueMapper;

// Input 1: [[1, 2, 3],
//           [4, 5, 6],
//           [7, 8, 9]]
// Input 2: 3
// Output: [[3, 3, 3],
//          [3, 3, 3],
//          [3, 3, 3]]
public class MatrixFiller implements MatrixValueMapper {

    @Override
    public byte[][] operate(byte[][] a, byte b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = b;
            }
        }
        return a;
    }

    @Override
    public short[][] operate(short[][] a, short b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = b;
            }
        }
        return a;
    }

    @Override
    public int[][] operate(int[][] a, int b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = b;
            }
        }
        return a;
    }

    @Override
    public long[][] operate(long[][] a, long b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = b;
            }
        }
        return a;
    }

    @Override
    public float[][] operate(float[][] a, float b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = b;
            }
        }
        return a;
    }

    @Override
    public double[][] operate(double[][] a, double b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = b;
            }
        }
        return a;
    }
}
