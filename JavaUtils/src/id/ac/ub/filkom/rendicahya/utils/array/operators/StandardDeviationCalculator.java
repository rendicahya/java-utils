package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayToDoubleReducer;

// Input 1: [1, 4, 8, 2, 5]
// Output: 2.7386127875258
public class StandardDeviationCalculator implements ArrayToDoubleReducer {

    @Override
    public double reduce(byte[] input) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = input.length;

        for(double num : input) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: input) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

    @Override
    public double reduce(short[] input) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = input.length;

        for(double num : input) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: input) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

    @Override
    public double reduce(int[] input) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = input.length;

        for(double num : input) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: input) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

    @Override
    public double reduce(long[] input) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = input.length;

        for(double num : input) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: input) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

    @Override
    public double reduce(float[] input) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = input.length;

        for(double num : input) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: input) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

    @Override
    public double reduce(double[] input) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = input.length;

        for(double num : input) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: input) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
}
