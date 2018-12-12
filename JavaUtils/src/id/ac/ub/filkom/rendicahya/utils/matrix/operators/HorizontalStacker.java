package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.TwoMatricesMapper;

// Input 1: [[1, 2, 3],
//         [4, 5, 6]]
// Input 2: [[2, 3, 4],
//          [5, 6, 7]]
// Output: [[1, 2, 3, 2, 3, 4],
//         [4, 5, 6, 5, 6, 7]]
public class HorizontalStacker implements TwoMatricesMapper {

    @Override
    public byte[][] operate(byte[][] a, byte[][] b) {
        byte[][] c = new byte[2][a[0].length + b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[0][j] = a[0][j];
                } else {
                    c[0][j + a[i].length] = b[0][j];
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[1][j] = a[1][j];
                } else {
                    c[1][j + a[i].length] = b[1][j];
                }
            }
        }
        return c;
    }

    @Override
    public short[][] operate(short[][] a, short[][] b) {
        short[][] c = new short[2][a[0].length + b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[0][j] = a[0][j];
                } else {
                    c[0][j + a[i].length] = b[0][j];
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[1][j] = a[1][j];
                } else {
                    c[1][j + a[i].length] = b[1][j];
                }
            }
        }
        return c;
    }

    @Override
    public int[][] operate(int[][] a, int[][] b) {
        int[][] c = new int[2][a[0].length + b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[0][j] = a[0][j];
                } else {
                    c[0][j + a[i].length] = b[0][j];
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[1][j] = a[1][j];
                } else {
                    c[1][j + a[i].length] = b[1][j];
                }
            }
        }
        return c;
    }

    @Override
    public long[][] operate(long[][] a, long[][] b) {
        long[][] c = new long[2][a[0].length + b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[0][j] = a[0][j];
                } else {
                    c[0][j + a[i].length] = b[0][j];
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[1][j] = a[1][j];
                } else {
                    c[1][j + a[i].length] = b[1][j];
                }
            }
        }
        return c;
    }

    @Override
    public float[][] operate(float[][] a, float[][] b) {
        float[][] c = new float[2][a[0].length + b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[0][j] = a[0][j];
                } else {
                    c[0][j + a[i].length] = b[0][j];
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[1][j] = a[1][j];
                } else {
                    c[1][j + a[i].length] = b[1][j];
                }
            }
        }
        return c;
    }

    @Override
    public double[][] operate(double[][] a, double[][] b) {
        double[][] c = new double[2][a[0].length + b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[0][j] = a[0][j];
                } else {
                    c[0][j + a[i].length] = b[0][j];
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == 0) {
                    c[1][j] = a[1][j];
                } else {
                    c[1][j + a[i].length] = b[1][j];
                }
            }
        }
        return c;
    }
}
