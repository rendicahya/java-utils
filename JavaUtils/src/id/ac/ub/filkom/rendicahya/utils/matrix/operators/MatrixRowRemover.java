package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixIntMapper;

// Input 1: [[1, 2, 3],
//           [4, 5, 6],
//           [7, 8, 9]]
// Input 2: 2
// Output: [[1, 2, 3],
//          [4, 5, 6]]
public class MatrixRowRemover implements MatrixIntMapper {
    @Override
    public byte[][] operate(byte[][] a, int b) {
        byte [][]array1=new byte[a.length-1][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i<b && b<a.length){
                array1[i][j]=a[i][j];}
                else if(i>b){
                    array1[i-1][j]=a[i][j];
                }
            }
        }
        return array1;
    }

    @Override
    public short[][] operate(short[][] a, int b) {
        short [][]array1=new short[a.length-1][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i<b && b<a.length){
                array1[i][j]=a[i][j];}
                else if(i>b){
                    array1[i-1][j]=a[i][j];
                }
            }
        }
        return array1;
    }

    @Override
    public int[][] operate(int[][] a, int b) {
         int [][]array1=new int[a.length-1][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i<b && b<a.length){
                array1[i][j]=a[i][j];}
                else if(i>b){
                    array1[i-1][j]=a[i][j];
                }
            }
        }
        return array1;
    }

    @Override
    public long[][] operate(long[][] a, int b) {
         long [][]array1=new long[a.length-1][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i<b && b<a.length){
                array1[i][j]=a[i][j];}
                else if(i>b){
                    array1[i-1][j]=a[i][j];
                }
            }
        }
        return array1;
    }

    @Override
    public float[][] operate(float[][] a, int b) {
         float [][]array1=new float[a.length-1][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i<b && b<a.length){
                array1[i][j]=a[i][j];}
                else if(i>b){
                    array1[i-1][j]=a[i][j];
                }
            }
        }
        return array1;
    }

    @Override
    public double[][] operate(double[][] a, int b) {
         double [][]array1=new double[a.length-1][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i<b && b<a.length){
                array1[i][j]=a[i][j];}
                else if(i>b){
                    array1[i-1][j]=a[i][j];
                }
            }
        }
        return array1;
    }
}
