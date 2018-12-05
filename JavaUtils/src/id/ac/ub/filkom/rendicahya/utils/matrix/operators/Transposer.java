package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixMapper;
import java.util.Scanner;

// Input: [[1, 2, 3],
//         [4, 5, 6]]
// Output: [[1, 4],
//          [2, 5],
//          [3, 6]]
public class Transposer implements MatrixMapper {

    @Override
    public byte[][] test(byte[][] input) {
        byte[][] a = new byte[input[0].length][input.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input[j][i];
            }
        }
        return a;
    }

    @Override
    public short[][] test(short[][] input) {
        short[][] a = new short[input[0].length][input.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input[j][i];
            }
        }
        return a;
    }

    @Override
    public int[][] test(int[][] input) {
        int[][] a = new int[input[0].length][input.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input[j][i];
            }
        }
        return a;
    }

    @Override
    public long[][] test(long[][] input) {
        long[][] a = new long[input[0].length][input.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input[j][i];
            }
        }
        return a;
    }

    @Override
    public float[][] test(float[][] input) {
        float[][] a = new float[input[0].length][input.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input[j][i];
            }
        }
        return a;
    }

    @Override
    public double[][] test(double[][] input) {
        double[][] a = new double[input[0].length][input.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input[j][i];
            }
        }
        return a;
    }
}
