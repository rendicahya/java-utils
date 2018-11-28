package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixPredicate;

// Input: [[1, 2, 3],
//         [4, 5, 6]]
// Output: true

// Input: [[1, 2, 3]]
// Output: true

// Input: [[1, 2, 3],
//         [4, 5, 6, 7]]
// Output: false
public class IsMatrixChecker implements MatrixPredicate {

    @Override
    public boolean test(byte[][] input) {
        boolean cek = true;
        for (int i = 1; i < input.length; i++) {
            if (input[i].length != input[0].length){
                cek = false;
                break;
            } 
        }
        return cek;
    }

    @Override
    public boolean test(short[][] input) {
        boolean cek = true;
        for (int i = 1; i < input.length; i++) {
            if (input[i].length != input[0].length){
                cek = false;
                break;
            } 
        }
        return cek;
    }

    @Override
    public boolean test(int[][] input) {
        boolean cek = true;
        for (int i = 1; i < input.length; i++) {
            if (input[i].length != input[0].length){
                cek = false;
                break;
            } 
        }
        return cek;
    }

    @Override
    public boolean test(long[][] input) {
        boolean cek = true;
        for (int i = 1; i < input.length; i++) {
            if (input[i].length != input[0].length){
                cek = false;
                break;
            } 
        }
        return cek;
    }

    @Override
    public boolean test(float[][] input) {
        boolean cek = true;
        for (int i = 1; i < input.length; i++) {
            if (input[i].length != input[0].length){
                cek = false;
                break;
            } 
        }
        return cek;
    }

    @Override
    public boolean test(double[][] input) {
        boolean cek = true;
        for (int i = 1; i < input.length; i++) {
            if (input[i].length != input[0].length){
                cek = false;
                break;
            } 
        }
        return cek;
    }
   
}
