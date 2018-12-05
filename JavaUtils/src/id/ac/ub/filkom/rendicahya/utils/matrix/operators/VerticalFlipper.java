package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixMapper;

// Input: [[1, 2, 3],
//         [4, 5, 6],
//         [7, 8, 9]
// Output: [[7, 8, 9],
//          [4, 5, 6],
//          [1, 2, 3]]
// Created by Muhammad Syukran Ni'matullah (185150201111059)
public class VerticalFlipper implements MatrixMapper {

    @Override
    public byte[][] test(byte[][] input) {
       
        int totalX = input.length;
        int totalY = input[0].length;
        for (int y = 0; y < totalY; y++) {
            for (int x = 0; x < totalX / 2; x++) {
                byte tmp = input[totalX - x - 1][y];
                input[totalX - x - 1][y] = input[x][y];
                input[x][y] = tmp;
            }
        }
        return input;
        
    }

    @Override
    public short[][] test(short[][] input) {
        int totalX = input.length;
        int totalY = input[0].length;
        for (int y = 0; y < totalY; y++) {
            for (int x = 0; x < totalX / 2; x++) {
                short tmp = input[totalX - x - 1][y];
                input[totalX - x - 1][y] = input[x][y];
                input[x][y] = tmp;
            }
        }
        return input;
    }

    @Override
    public int[][] test(int[][] input) {
        int totalX = input.length;
        int totalY = input[0].length;
        for (int y = 0; y < totalY; y++) {
            for (int x = 0; x < totalX / 2; x++) {
                int tmp = input[totalX - x - 1][y];
                input[totalX - x - 1][y] = input[x][y];
                input[x][y] = tmp;
            }
        }
        return input;
    }

    @Override
    public long[][] test(long[][] input) {
        int totalX = input.length;
        int totalY = input[0].length;
        for (int y = 0; y < totalY; y++) {
            for (int x = 0; x < totalX / 2; x++) {
                long tmp = input[totalX - x - 1][y];
                input[totalX - x - 1][y] = input[x][y];
                input[x][y] = tmp;
            }
        }
        return input;
    }

    @Override
    public float[][] test(float[][] input) {
        int totalX = input.length;
        int totalY = input[0].length;
        for (int y = 0; y < totalY; y++) {
            for (int x = 0; x < totalX / 2; x++) {
                float tmp = input[totalX - x - 1][y];
                input[totalX - x - 1][y] = input[x][y];
                input[x][y] = tmp;
            }
        }
        return input;
    }

    @Override
    public double[][] test(double[][] input) {
        int totalX = input.length;
        int totalY = input[0].length;
        for (int y = 0; y < totalY; y++) {
            for (int x = 0; x < totalX / 2; x++) {
                double tmp = input[totalX - x - 1][y];
                input[totalX - x - 1][y] = input[x][y];
                input[x][y] = tmp;
            }
        }
        return input;
    }
}