package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.TwoMatricesMapper;

// Input 1: [[1, 2, 3],
//           [4, 5, 6]]
// Input 2: [[2, 3, 4],
//           [5, 6, 7]]
// Output: [[1, 2, 3],
//          [4, 5, 6],
//          [2, 3, 4],
//          [5, 6, 7]
public class VerticalStacker implements TwoMatricesMapper {


    @Override
    public byte[][] operate(byte[][] a, byte[][] b) {
        byte c[][] = new byte[4][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j];
                c[i + 2][j] = b[i][j];
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-4s", c[i][j]);
            }
            System.out.println(" ");
        }
        return c;
    } 
    

    @Override
    public short[][] operate(short[][] a, short[][] b) {
       short c[][] = new short[4][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j];
                c[i + 2][j] = b[i][j];
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-4s", c[i][j]);
            }
            System.out.println(" ");
        }
        return c;
    } 
    

    @Override
    public int[][] operate(int[][] a, int[][] b) {

        int c[][] = new int[4][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j];
                c[i + 2][j] = b[i][j];
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-4s", c[i][j]);
            }
            System.out.println(" ");
        }
        return c;
    } 


    @Override
    public long[][] operate(long[][] a, long[][] b) {
         long c[][] = new long[4][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j];
                c[i + 2][j] = b[i][j];
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-4s", c[i][j]);
            }
            System.out.println(" ");
        }
        return c;


}

    @Override
public float[][] operate(float[][] a, float[][] b) {
         float c[][] = new float[4][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j];
                c[i + 2][j] = b[i][j];
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-4s", c[i][j]);
            }
            System.out.println(" ");
        }
        return c;


}

    @Override
public double[][] operate(double[][] a, double[][] b) {
      double c[][] = new double[4][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j];
                c[i + 2][j] = b[i][j];
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-4s", c[i][j]);
            }
            System.out.println(" ");
        }
        return c;
    }
}
