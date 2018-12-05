package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.TwoMatricesMapper;
import java.util.Arrays;
import java.util.Scanner;

// Input 1: [[1, 2, 3],
//           [4, 5, 6]]
// Input 2: [[1, 1, 1],
//           [2, 2, 2]]
// Output: [[2, 3, 4],
//          [6, 7, 8]]
public class MatrixAdder implements TwoMatricesMapper {

    @Override
    public byte[][] operate(byte[][] a, byte[][] b) {
        byte[][] output= new byte[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                output[i][j] = (byte) (a[i][j] + b[i][j]);
            }
        }
        return output;   
    }

    @Override
    public short[][] operate(short[][] a, short[][] b) {
        short[][] output= new short[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                output[i][j] = (short) (a[i][j] + b[i][j]);
            }
        }
        return output;   
    }

    @Override
    public int[][] operate(int[][] a, int[][] b) {
        int[][] output= new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                output[i][j] = (a[i][j] + b[i][j]);
            }
        }
        return output;
    }

    @Override
    public long[][] operate(long[][] a, long[][] b) {
        long[][] output= new long[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                output[i][j] = (a[i][j] + b[i][j]);
            }
        }
        return output;
    }

    @Override
    public float[][] operate(float[][] a, float[][] b) {
        float[][] output= new float[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                output[i][j] = (a[i][j] + b[i][j]);
            }
        }
        return output;
    }

    @Override
    public double[][] operate(double[][] a, double[][] b) {
        double[][] output= new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                output[i][j] = (a[i][j] + b[i][j]);
            }
        }
        return output;
    }
}