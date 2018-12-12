package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixValueMapper;

// Input 1: [[1, 2, 3],
//           [4, 5, 6]]
// Input 2: 2
// Output: [[-1, 0, 1],
//          [2, 3, 4]]
public class ScalarSubtractor implements MatrixValueMapper {

    @Override
    public byte[][] operate(byte[][] a, byte b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]-=b;
            }
        }
        return a;
    }

    @Override
    public short[][] operate(short[][] a, short b) {
      for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]-=b;
            }
        }
        return a;
    }

    @Override
    public int[][] operate(int[][] a, int b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]-=b;
            }
        }
        return a;
    }

    @Override
    public long[][] operate(long[][] a, long b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]-=b;
            }
        }
        return a;
    }

    @Override
    public float[][] operate(float[][] a, float b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]-=b;
            }
        }
        return a;
    }

    @Override
    public double[][] operate(double[][] a, double b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]-=b;
            }
        }
        return a;
    }
}
