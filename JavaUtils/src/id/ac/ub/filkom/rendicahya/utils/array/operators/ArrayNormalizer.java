package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayToDoubleArrayMapper;

/**
 * Array Normalizer is used to change an array in any value to array of double.
 * The output is array of double that the value is vary from 0 to 1 only. 
 * Inputting value to array is one by one.
 * E.g :
 * Input : 4 
 * 8
 * 10
 * 15
 * 20
 * Output : {0,0.16,0.58,1}
 * @author Akbar
 */
public class ArrayNormalizer implements ArrayToDoubleArrayMapper {

    @Override
    public double[] reduce(byte[] input) {
        byte min = Byte.MAX_VALUE;
        byte max = Byte.MIN_VALUE;
        double[] outputNum = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            if (min > input[i]) {
                min = input[i];
            }
            if (max < input[i]) {
                max = input[i];
            }
        }
        for (int i = 1; i < input.length; i++) {
            double temp;
            temp = (double) (input[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }

    @Override
    public double[] reduce(short[] input) {
        short min = Short.MAX_VALUE;
        short max = Short.MIN_VALUE;
        double[] outputNum = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            if (min > input[i]) {
                min = input[i];
            }
            if (max < input[i]) {
                max = input[i];
            }
        }
        for (int i = 1; i < input.length; i++) {
            double temp;
            temp = (double) (input[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }

    @Override
    public double[] reduce(int[] input) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double[] outputNum = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            if (min > input[i]) {
                min = input[i];
            }
            if (max < input[i]) {
                max = input[i];
            }
        }
        for (int i = 1; i < input.length; i++) {
            double temp;
            temp = (double) (input[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }

    @Override
    public double[] reduce(long[] input) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        double[] outputNum = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            if (min > input[i]) {
                min = input[i];
            }
            if (max < input[i]) {
                max = input[i];
            }
        }
        for (int i = 1; i < input.length; i++) {
            double temp;
            temp = (double) (input[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }

    @Override
    public double[] reduce(float[] input) {
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;
        double[] outputNum = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            if (min > input[i]) {
                min = input[i];
            }
            if (max < input[i]) {
                max = input[i];
            }
        }
        for (int i = 1; i < input.length; i++) {
            double temp;
            temp = (double) (input[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }

    @Override
    public double[] reduce(double[] input) {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double[] outputNum = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            if (min > input[i]) {
                min = input[i];
            }
            if (max < input[i]) {
                max = input[i];
            }
        }
        for (int i = 1; i < input.length; i++) {
            double temp;
            temp = (double) (input[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }
}
