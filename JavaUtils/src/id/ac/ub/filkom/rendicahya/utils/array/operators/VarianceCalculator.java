package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayToDoubleReducer;

// Input 1: [1, 4, 8, 2, 5]
// Output: 7.5
public class VarianceCalculator implements ArrayToDoubleReducer {

    @Override
    public double reduce(byte[] input) {
        byte sum = 0, sam = 0, average;
        double hasil;
        for (byte num : input) {
            sum += num;
        }
        average = (byte) (sum / input.length);
        for (int i = 0; i < input.length; i++) {
            input[i] -= average;
            input[i] *= input[i];
        }
        for (byte num : input) {
            sam += num;
        }
        hasil = ((double) sam / (input.length - 1));
        return hasil;
    }

    @Override
    public double reduce(short[] input) {
        short sum = 0, sam = 0, average;
        double hasil;
        for (short num : input) {
            sum += num;
        }
        average = (short) (sum / input.length);
        for (int i = 0; i < input.length; i++) {
            input[i] -= average;
            input[i] *= input[i];
        }
        for (short num : input) {
            sam += num;
        }
        hasil = ((double) sam / (input.length - 1));
        return hasil;
    }

    @Override
    public double reduce(int[] input) {
        int sum = 0, sam = 0, average;
        double hasil;
        for (int num : input) {
            sum += num;
        }
        average =(sum / input.length);
        for (int i = 0; i < input.length; i++) {
            input[i] -= average;
            input[i] *= input[i];
        }
        for (int num : input) {
            sam += num;
        }
        hasil = ((double) sam / (input.length - 1));
        return hasil;
    }

    @Override
    public double reduce(long[] input) {
        long sum = 0, sam = 0, average;
        double hasil;
        for (long num : input) {
            sum += num;
        }
        average = sum / input.length;
        for (int i = 0; i < input.length; i++) {
            input[i] -= average;
            input[i] *= input[i];
        }
        for (long num : input) {
            sam += num;
        }
        hasil = ((double) sam / (input.length - 1));
        return hasil;
    }

    @Override
    public double reduce(float[] input) {
        float sum = 0, sam = 0, average;
        double hasil;
        for (float num : input) {
            sum += num;
        }
        average =(sum / input.length);
        for (int i = 0; i < input.length; i++) {
            input[i] -= average;
            input[i] *= input[i];
        }
        for (float num : input) {
            sam += num;
        }
        hasil = ((float) sam / (input.length - 1));
        return hasil;
    }

    @Override
    public double reduce(double[] input) {
        double sum = 0, sam = 0, average;
        double hasil;
        for (double num : input) {
            sum += num;
        }
        average =(sum / input.length);
        for (int i = 0; i < input.length; i++) {
            input[i] -= average;
            input[i] *= input[i];
        }
        for (double num : input) {
            sam += num;
        }
        hasil = ((double) sam / (input.length - 1));
        return hasil;
    }
}
