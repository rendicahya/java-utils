package id.ac.ub.filkom.rendicahya.utils.array.operators;
import java.util.Arrays;
import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayToDoubleReducer;

// Input: [7, 1, 5, 3, 8]
// Output: 5 

/*
*
* This program used for finding median in an array
* This program may give wrong value if the data type is not double or float
*
*/
public class MedianFinder implements ArrayToDoubleReducer {

    @Override
    public double reduce(byte[] input) {
                Arrays.sort(input);
        float median;
        if (input.length % 2 == 0) {
            median = ((float) input[input.length / 2] + (float) input[input.length / 2 - 1]) / 2;
        } else {
            median = (float) input[input.length / 2];
        }
        return median;
    }

    @Override
    public double reduce(short[] input) {
        Arrays.sort(input);
        short median;
        if (input.length % 2 == 0) {
            median = (short) (( input[input.length / 2] +  input[input.length / 2 - 1]) / 2);
        } else {
            median =  input[input.length / 2];
        }
        return median;    
    }

    @Override
    public double reduce(int[] input) {
                Arrays.sort(input);
        int median;
        if (input.length % 2 == 0) {
            median = ( input[input.length / 2] +  input[input.length / 2 - 1]) / 2;
        } else {
            median =  input[input.length / 2];
        }
        return median;
    }

    @Override
    public double reduce(long[] input) {
                Arrays.sort(input);
        long median;
        if (input.length % 2 == 0) {
            median = ( input[input.length / 2] +  input[input.length / 2 - 1]) / 2;
        } else {
            median =  input[input.length / 2];
        }
        return median;
    }

    @Override
    public double reduce(float[] input) {
        Arrays.sort(input);
        float median;
        if (input.length % 2 == 0) {
            median = ((float) input[input.length / 2] + (float) input[input.length / 2 - 1]) / 2;
        } else {
            median = (float) input[input.length / 2];
        }
        return median;
    }

    @Override
    public double reduce(double[] input) {
        Arrays.sort(input);
        double median;
        if (input.length % 2 == 0) {
            median = ((double) input[input.length / 2] + (double) input[input.length / 2 - 1]) / 2;
        } else {
            median = (double) input[input.length / 2];
        }
        return median;
    }
}
