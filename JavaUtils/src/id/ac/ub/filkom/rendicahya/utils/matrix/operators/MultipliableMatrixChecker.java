package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.TwoMatricesPredicate;

// Input 1: [[1, 2, 3],
//           [4, 5, 6]]
// Input 2: [[1, 1],
//           [2, 2],
//           [3, 3]]
// Output: true
// Input 1: [[1, 2, 3],
//           [4, 5, 6]]
// Input 2: [[1, 1],
//           [2, 2]]
// Output: false
public class MultipliableMatrixChecker implements TwoMatricesPredicate {

    @Override
    public boolean test(byte[][] a, byte[][] b) {
        boolean check;
        if (a[0].length == b.length) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    @Override
    public boolean test(short[][] a, short[][] b) {
        boolean check;
        if (a[0].length == b.length) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    @Override
    public boolean test(int[][] a, int[][] b) {
        boolean check;
        if (a[0].length == b.length) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    @Override
    public boolean test(long[][] a, long[][] b) {
        boolean check;
        if (a[0].length == b.length) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    @Override
    public boolean test(float[][] a, float[][] b) {
        boolean check;
        if (a[0].length == b.length) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    @Override
    public boolean test(double[][] a, double[][] b) {
        boolean check;
        if (a[0].length == b.length) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

}
