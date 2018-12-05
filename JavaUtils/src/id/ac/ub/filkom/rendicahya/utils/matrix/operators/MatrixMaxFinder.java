package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixReducer;

// Input: [[3, 1, 7],
//         [5, 2, 2],
//         [8, 5, 3]]
// Output: 8
public class MatrixMaxFinder implements MatrixReducer {

    
    public static int max(int[][]input) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i][j] > max) {
                    max = input[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] input = {{3, 1, 7},
        {5, 2, 2},
        {8, 5, 3}};

        System.out.println("Output: "+max(input));
    }

    @Override
    public byte reduce(byte[][] input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public short reduce(short[][] input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int reduce(int[][] input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long reduce(long[][] input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float reduce(float[][] input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double reduce(double[][] input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
