package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.OneTwoThreeIntMapper;

// Input: 10
// Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

// Input: 1, 11
// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

// Input: 0, 30, 5
// Output: [0, 5, 10, 15, 20, 25]

// Input: 0, -10
// Output: [0, -1, -2, -3, -4, -5, -6, -7, -8, -9]

// Input: 0, -10, 2
// Output: [0, -2, -4, -6, -8, -9]
public class Ranger implements OneTwoThreeIntMapper {

    @Override
    public int[] operate(int a) {
        int[] output = new int[a];
        int temp=0;
        for (int i = 0; i < output.length; i++) {
            output[i] = temp++;
        }
        return output;
    }

    @Override
    public int[] operate(int a, int b) {
        int[] output = new int[Math.abs(b - a)];
        if (b - a > 0) {
            for (int i = 0; i < output.length; i++) {
                output[i] = a++;
            }
        } else {
            for (int i = 0; i < output.length; i++) {
                output[i] = a--;
            }
        }
        return output;
    }

    @Override
    public int[] operate(int a, int b, int c) {
        int []output = new int[Math.abs(b-a)/c];
        int temp = a;
        output[0]=a;
        if (b - a > 0) {
            for (int i = 1; i < output.length; i++) {
                temp += c; 
                output[i] = temp;
            }
        } else {
            for (int i = 1; i < output.length; i++) {
                temp += c;
                output[i] = temp;
            }
        }
        return output;
    }
}
