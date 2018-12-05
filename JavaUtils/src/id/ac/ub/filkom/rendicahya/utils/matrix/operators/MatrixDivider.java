package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.TwoMatricesToDoubleArrayMapper;
import java.util.*;
// Input 1: [[1, 2, 3],
//           [4, 5, 6]]
// Input 2: [[2, 2, 2],
//           [2, 2, 2]]
// Output: [[0.5, 1, 1.5],
//          [2, 2.5, 3]]

public class MatrixDivider implements TwoMatricesToDoubleArrayMapper {

    Scanner masukan = new Scanner(System.in);
    int arraysatu[][] = {{1, 2, 3}, {4, 5, 6}};
    int arraydua[][] = {{2, 2, 2}, {2, 2, 2}};
    double[][] result = new double[arraysatu.length][arraysatu[0].length];

    public void output(int x[][]) {
        {
            for (int i = 0; i < arraysatu.length; i++) {
                for (int k = 0; k < arraysatu[0].length; k++) {
                    result[i][k] += (double) arraysatu[i][k] / arraydua[i][k];
                }
            }
            for (int i = 0; i < arraysatu.length; i++) {
                for (int k = 0; k < arraysatu[0].length; k++) {
                    System.out.print(result[i][k] + "\t");
                }
                System.out.println();
            }
        }
    }

    @Override
    public double[][] operate(byte[][] a, byte[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[][] operate(short[][] a, short[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[][] operate(int[][] a, int[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[][] operate(long[][] a, long[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[][] operate(float[][] a, float[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[][] operate(double[][] a, double[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
