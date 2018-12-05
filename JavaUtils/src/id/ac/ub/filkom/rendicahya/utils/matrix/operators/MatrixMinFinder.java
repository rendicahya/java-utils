package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixReducer;

// Input: [[3, 1, 7],
//         [5, 2, 2],
//         [8, 5, 3]]
// Output: 1
public class MatrixMinFinder implements MatrixReducer {

    
    @Override
    public byte reduce(byte[][] input) {
        byte tempMin = Byte.MAX_VALUE;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (tempMin > input[i][j]) {
                    tempMin = input[i][j];
                }
            }
        }
        return tempMin;
    }

    @Override
    public short reduce(short[][] input) {
        short tempMin = Short.MAX_VALUE;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (tempMin > input[i][j]) {
                    tempMin = input[i][j];
                }
            }
        }
        return tempMin;
    }

    @Override
    public int reduce(int[][] input) {
        int tempMin = Integer.MAX_VALUE;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (tempMin > input[i][j]) {
                    tempMin = input[i][j];
                }
            }
        }
        return tempMin;
    }

    @Override
    public long reduce(long[][] input) {
        long tempMin = Long.MAX_VALUE;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (tempMin > input[i][j]) {
                    tempMin = input[i][j];
                }
            }
        }
        return tempMin;
    }

    @Override
    public float reduce(float[][] input) {
        float tempMin = Float .MAX_VALUE;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (tempMin > input[i][j]) {
                    tempMin = input[i][j];
                }
            }
        }
        return tempMin;
    }

    @Override
    public double reduce(double[][] input) {
        double tempMin = Double .MAX_VALUE;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (tempMin > input[i][j]) {
                    tempMin = input[i][j];
                }
            }
        }
        return tempMin;
    }
}
