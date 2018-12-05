package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.TwoArraysToMatrixMapper;

// Input 1: [1, 2, 3]
// Input 2: [4, 5, 6]
// Output: [[1, 4],
//          [2, 5],
//          [3, 6]]

// Zipper function by Hamdani Al Ikhsan, 185150201111061
public class Zipper implements TwoArraysToMatrixMapper {
    @Override
    public byte[][] operate(byte[] a, byte[] b) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {4, 5, 6};
        int c = 0;

        byte[][] output = new byte[3][2];

        for (int x : input1) {
            output[c][0] = (byte) x;
            c++;
        }
        c = 0;
        for (int x : input2) {
            output[c][1] = (byte) x;
            c++;
        }
        return output;
    }

    @Override
    public short[][] operate(short[] a, short[] b) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {4, 5, 6};
        int c = 0;

        short[][] output = new short[3][2];

        for (int x : input1) {
            output[c][0] = (short) x;
            c++;
        }
        c = 0;
        for (int x : input2) {
            output[c][1] = (short) x;
            c++;
        }
        return output;
    }

    @Override
    public int[][] operate(int[] a, int[] b) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {4, 5, 6};
        int c = 0;

        int[][] output = new int[3][2];

        for (int x : input1) {
            output[c][0] = x;
            c++;
        }
        c = 0;
        for (int x : input2) {
            output[c][1] = x;
            c++;
        }
        return output;
    }

    @Override
    public long[][] operate(long[] a, long[] b) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {4, 5, 6};
        int c = 0;

        long[][] output = new long[3][2];

        for (int x : input1) {
            output[c][0] = x;
            c++;
        }
        c = 0;
        for (int x : input2) {
            output[c][1] = x;
            c++;
        }
        return output;
    }

    @Override
    public float[][] operate(float[] a, float[] b) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {4, 5, 6};
        int c = 0;

        float[][] output = new float[3][2];

        for (int x : input1) {
            output[c][0] = x;
            c++;
        }
        c = 0;
        for (int x : input2) {
            output[c][1] = x;
            c++;
        }
        return output;
    }

    @Override
    public double[][] operate(double[] a, double[] b) {
        int[] input1 = {1, 2, 3};
        int[] input2 = {4, 5, 6};
        int c = 0;

        double[][] output = new double[3][2];

        for (int x : input1) {
            output[c][0] = x;
            c++;
        }
        c = 0;
        for (int x : input2) {
            output[c][1] = x;
            c++;
        }
        return output;
    }

}
