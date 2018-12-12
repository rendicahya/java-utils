package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixToDoubleMatrixMapper;

// Input: [[8, 10, 15],
//         [10, 8, 20]
// Output: [0, 0.16, 0.58],
//         [0.16, 0, 1]]
public class MatrixNormalizer implements MatrixToDoubleMatrixMapper {

    @Override
    public double[][] reduce(byte[][] input) {
        double newArray[][] = new double[input.length][input[0].length];
        byte max = 0, min = input[0][0];
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                if (input[i][j] > max) max = input[i][j];
                if (input[i][j] < min) min = input[i][j];
            }
        }
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                double value = (input[i][j] - min) / (double)(max - min);
                newArray[i][j] = Math.floor(value * 100.0) / 100.0;
            }
        }
        return newArray;
    }

    @Override
    public double[][] reduce(short[][] input) {
        double newArray[][] = new double[input.length][input[0].length];
        short max = 0, min = input[0][0];
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                if (input[i][j] > max) max = input[i][j];
                if (input[i][j] < min) min = input[i][j];
            }
        }
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                double value = (input[i][j] - min) / (double)(max - min);
                newArray[i][j] = Math.floor(value * 100.0) / 100.0;
            }
        }
        return newArray;
    }

    @Override
    public double[][] reduce(int[][] input) {
        double newArray[][] = new double[input.length][input[0].length];
        int max = 0, min = input[0][0];
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                if (input[i][j] > max) max = input[i][j];
                if (input[i][j] < min) min = input[i][j];
            }
        }
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                double value = (input[i][j] - min) / (double)(max - min);
                newArray[i][j] = Math.floor(value * 100.0) / 100.0;
            }
        }
        return newArray;
    }

    @Override
    public double[][] reduce(long[][] input) {
        double newArray[][] = new double[input.length][input[0].length];
        long max = 0, min = input[0][0];
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                if (input[i][j] > max) max = input[i][j];
                if (input[i][j] < min) min = input[i][j];
            }
        }
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                double value = (input[i][j] - min) / (double)(max - min);
                newArray[i][j] = Math.floor(value * 100.0) / 100.0;
            }
        }
        return newArray;
    }

    @Override
    public double[][] reduce(float[][] input) {
        double newArray[][] = new double[input.length][input[0].length];
        float max = 0, min = input[0][0];
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                if (input[i][j] > max) max = input[i][j];
                if (input[i][j] < min) min = input[i][j];
            }
        }
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                double value = (input[i][j] - min) / (double)(max - min);
                newArray[i][j] = Math.floor(value * 100.0) / 100.0;
            }
        }
        return newArray;
    }

    @Override
    public double[][] reduce(double[][] input) {
        double newArray[][] = new double[input.length][input[0].length];
        double max = 0, min = input[0][0];
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                if (input[i][j] > max) max = input[i][j];
                if (input[i][j] < min) min = input[i][j];
            }
        }
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                double value = (input[i][j] - min) / (double)(max - min);
                newArray[i][j] = Math.floor(value * 100.0) / 100.0;
            }
        }
        return newArray;
    }

   
}
