package id.ac.ub.filkom.rendicahya.utils.matrix.operators;

import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.MatrixReducer;

// Input: [[3, 1, 7],
//         [5, 2, 2],
//         [8, 5, 3]]
// Output: 8
public class MatrixMaxFinder implements MatrixReducer {
    int [][]input ={{3, 1, 7},
                 {5, 2, 2},
                 {8, 5, 3}};
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < input.length; i++) {
        for (int j = 0; j < input.length; j++) {
            if (in[i][j]>max) {
                max=in[i][j];
            }
        }
    }
    System.out.println("Output : "+max);

}
