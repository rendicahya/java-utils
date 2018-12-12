package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayToDoubleReducer;

// Input: [2, 3, 4, 5]
// Output: 3.5
/**
     *
     *Method ini dapat digunakan dalam operasi untuk mencari rata rata pada
     *suatu array yang diinput oleh pengguna
     */

public class AverageCalculator implements ArrayToDoubleReducer {

    /**
     *
     * @param input array tipe byte
     * @return hasil bagi variabel hasil dengan panjang array
     */
    @Override
    public double reduce(byte[] input) {
        double hasil = 0;
        for (int i = 0; i < input.length; i++) {
            hasil += input[i];

        }
        return hasil / input.length;
    }

    /**
     *
     * @param input array tipe short
     * @return hasil bagi variabel hasil dengan panjang array
     */
    @Override
    public double reduce(short[] input) {
        double hasil = 0;
        for (int i = 0; i < input.length; i++) {
            hasil += input[i];

        }
        return hasil / input.length;
    }

    /**
     *
         * @param input array tipe int
     * @return hasil bagi variabel hasil dengan panjang array
     */
    @Override
    public double reduce(int[] input) {
        double hasil = 0;
        for (int i = 0; i < input.length; i++) {
            hasil += input[i];

        }
        return hasil / input.length;
    }

    /**
     *
         * @param input array tipe long
     * @return hasil bagi variabel hasil dengan panjang array
     */
    @Override
    public double reduce(long[] input) {
        double hasil = 0;
        for (int i = 0; i < input.length; i++) {
            hasil += input[i];

        }
        return hasil / input.length;
    }

    /**
     *
      * @param input array tipe float
     * @return hasil bagi variabel hasil dengan panjang array
     */
    @Override
    public double reduce(float[] input) {
        double hasil = 0;
        for (int i = 0; i < input.length; i++) {
            hasil += input[i];

        }
        return hasil / input.length;
    }

    /**
     *
         * @param input array tipe double
     * @return hasil bagi variabel hasil dengan panjang array
     */
    @Override
    public double reduce(double[] input) {
        double hasil = 0;
        for (int i = 0; i < input.length; i++) {
            hasil += input[i];

        }
        return hasil / input.length;
    }
}
