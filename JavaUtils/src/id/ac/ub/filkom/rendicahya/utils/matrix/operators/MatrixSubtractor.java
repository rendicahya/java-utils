package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.TwoMatricesMapper;

// Input 1: [[1, 2, 3],
//           [4, 5, 6]]
// Input 2: [[1, 1, 1],
//           [2, 2, 2]]
// Output: [[0, 1, 2],
//          [2, 3, 4]]
public class MatrixSubtractor implements TwoMatricesMapper {

    @Override
    public byte[][] operate(byte[][] a, byte[][] b) {
         byte [][] e = new byte [a.length][a[0].length]; 
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                byte c = a[i][j];
                byte d= b[i][j];
                c-=d;
                e[i][j]=c;
                
            }
            
        }
           return e;
    }

    @Override
    public short[][] operate(short[][] a, short[][] b) {
     short [][] e = new short [a.length][a[0].length]; 
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                short c = a[i][j];
               short d= b[i][j];
                c-=d;
                e[i][j]=c;
                
            }
            
        }
           return e;
    }

    @Override
    public int[][] operate(int[][] a, int[][] b) {
     int [][] e = new int [a.length][a[0].length]; 
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                int c = a[i][j];
                int d= b[i][j];
                c-=d;
                e[i][j]=c;
                
            }
            
        }
           return e;
    }

    @Override
    public long[][] operate(long[][] a, long[][] b) {
         long [][] e = new long [a.length][a[0].length]; 
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                long c = a[i][j];
              long d= b[i][j];
                c-=d;
                e[i][j]=c;
                
            }
            
        }
           return e;
    }
    @Override
    public float[][] operate(float[][] a, float[][] b) {
          float [][] e = new float [a.length][a[0].length]; 
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                float c = a[i][j];
                float d= b[i][j];
                c-=d;
                e[i][j]=c;
                
            }
            
        }
           return e;
    }

    @Override
    public double[][] operate(double[][] a, double[][] b) {
         double [][] e = new double [a.length][a[0].length]; 
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                double c = a[i][j];
               double d= b[i][j];
                c-=d;
                e[i][j]=c;
                
            }
            
        }
           return e;
    }
}
