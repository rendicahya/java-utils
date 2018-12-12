package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.ArrayIntToMatrixMapper;

// Input 1: [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Input 2: 3
// Output: [[1, 2, 3],
//          [4, 5, 6],
//          [7, 8, 9]]
public class Chunker implements ArrayIntToMatrixMapper {

    @Override
    public byte[][] operate(byte[] a, int b) {
        int length = a.length/b;
        int in = 0;
        byte[][] after = new byte[b][length];
        for (byte[] output : after){
            for (int j = 0;j<output.length;j++){
                output[j] = a[in];
                in++;
            }
        }
        return after;
    }

    @Override
    public short[][] operate(short[] a, int b) {
        int length = a.length/b;
        int in = 0;
        short[][] after = new short[b][length];
        for (short[] output : after){
            for (int j = 0;j<output.length;j++){
                output[j] = a[in];
                in++;
            }
        }
        return after;
    }

    @Override
    public long[][] operate(long[] a, int b) {
        int length = a.length/b;
        int in = 0;
        long[][] after = new long[b][length];
        for (long[] output : after){
            for (int j = 0;j<output.length;j++){
                output[j] = a[in];
                in++;
            }
        }
        return after;
    }

    @Override
    public float[][] operate(float[] a, int b) {
        int length = a.length/b;
        int in = 0;
        float[][] after = new float[b][length];
        for (float[] output : after){
            for (int j = 0;j<output.length;j++){
                output[j] = a[in];
                in++;
            }
        }
        return after;
    }

    @Override
    public double[][] operate(double[] a, int b) {
        int length = a.length/b;
        int in = 0;
        double[][] after = new double[b][length];
        for (double[] output : after){
            for (int j = 0;j<output.length;j++){
                output[j] = a[in];
                in++;
            }
        }
        return after;
    }

    @Override
    public int[][] operate(int[] a, int b) {
        int length = a.length/b;
        int in = 0;
        int[][] after = new int[b][length];
        for (int[] output : after){
            for (int j = 0;j<output.length;j++){
                output[j] = a[in];
                in++;
            }
        }
        return after;
    }
}
