package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.TwoMatricesPredicate;

// Input 1: [[1, 2, 3],
//         [4, 5, 6]]
// Input 2: [[1, 2, 3],
//          [4, 5, 6]]
// Output: true

// Input 1: [[1, 2, 3],
//         [4, 5, 6]]
// Input 2: [[0, 1, 2],
//          [7, 8, 9]]
// Output: false

/**
 *
 * @author Rangga Adi Satria
 * This Program has a function to check between two matrix, it's equal or not.
 */
public class EqualityChecker implements TwoMatricesPredicate {

    /**
     *
     * @param a is an two dimensional array with byte data type
     * @param b is an two dimensional array with byte data type
     * @return returning value of a boolean data type after being checke
     */
    @Override
    public boolean test(byte[][] a, byte[][] b) {
        boolean cek = true;
        if (a.length == b.length && a[0].length == b[0].length){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] != b[i][j]){
                        cek = false;
                        break;
                    }
                }
            }
        } else cek = false;
        return cek;
    }
    
    /**
     *
     * @param a is an two dimensional array with short data type
     * @param b is an two dimensional array with short data type
     * @return returning value of a boolean data type after being checked
     */
    @Override
    public boolean test(short[][] a, short[][] b) {
        boolean cek = true;
        if (a.length == b.length && a[0].length == b[0].length){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] != b[i][j]){
                        cek = false;
                        break;
                    }
                }
            }
        } else cek = false;
        return cek;
    }
    
    /**
     *
     * @param a is an two dimensional array with integer data type
     * @param b is an two dimensional array with integer data type
     * @return returning value of a boolean data type after being checked
     */
    @Override
    public boolean test(int[][] a, int[][] b) {
        boolean cek = true;
        if (a.length == b.length && a[0].length == b[0].length){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] != b[i][j]){
                        cek = false;
                        break;
                    }
                }
            }
        } else cek = false;
        return cek;
    }
    
    /**
     *
     * @param a is an two dimensional array with long data type
     * @param b is an two dimensional array with long data type
     * @return returning value of a boolean data type after being checked
     */
    @Override
    public boolean test(long[][] a, long[][] b) {
        boolean cek = true;
        if (a.length == b.length && a[0].length == b[0].length){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] != b[i][j]){
                        cek = false;
                        break;
                    }
                }
            }
        } else cek = false;
        return cek;
    }
    
    /**
     *
     * @param a is an two dimensional array with float data type
     * @param b is an two dimensional array with float data type
     * @return returning value of a boolean data type after being checked
     */
    @Override
    public boolean test(float[][] a, float[][] b) {
        boolean cek = true;
        if (a.length == b.length && a[0].length == b[0].length){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] != b[i][j]){
                        cek = false;
                        break;
                    }
                }
            }
        } else cek = false;
        return cek;
    }
    
    /**
     *
     * @param a is an two dimensional array with double data type
     * @param b is an two dimensional array with double data type
     * @return returning value of a boolean data type after being checked
     */
    @Override
    public boolean test(double[][] a, double[][] b) {
        boolean cek = true;
        if (a.length == b.length && a[0].length == b[0].length){
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (a[i][j] != b[i][j]){
                        cek = false;
                        break;
                    }
                }
            }
        } else cek = false;
        return cek;
    }
}