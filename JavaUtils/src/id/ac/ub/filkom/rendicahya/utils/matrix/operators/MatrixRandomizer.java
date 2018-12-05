package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixTwoValueMapper;

// Input 1: [[0, 0, 0],
//           [0, 0, 0],
//           [0, 0, 0]]
// Input 2: 0
// Input 3: 10
// Output: [[4, 7, 1],
//          [9, 5, 7],
//          [1, 4, 3]]
public class MatrixRandomizer implements MatrixTwoValueMapper {

    @Override
    public byte[][] operate(byte[][] a, byte b, byte c) {
        for (byte[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                a1[j] = (byte) (Math.random() * (c - b));
            }
        }
        return a;
    }

    @Override
    public short[][] operate(short[][] a, short b, short c) {
        for (short[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                a1[j] = (short) (Math.random() * (c - b));
            }
        }
        return a;
    }

    @Override
    public int[][] operate(int[][] a, int b, int c) {
        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                a1[j] = (int) (Math.random() * (c - b));
            }
        }
        return a;
    }

    @Override
    public long[][] operate(long[][] a, long b, long c) {
        for (long[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                a1[j] = (long) (Math.random() * (c - b));
            }
        }
        return a;
    }

    @Override
    public float[][] operate(float[][] a, float b, float c) {
        for (float[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                a1[j] = (float) (Math.random() * (c - b));
            }
        }
        return a;
    }

    @Override
    public double[][] operate(double[][] a, double b, double c) {
        for (double[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                a1[j] = (Math.random() * (c - b));
            }
        }
        return a;
    }
}
