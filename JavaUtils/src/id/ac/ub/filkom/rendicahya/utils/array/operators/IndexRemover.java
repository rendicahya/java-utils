package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayIntMapper;

// Input 1: [1, 2, 3, 4]
// Input 2: 1
// Output: [1, 3, 4]

/**
 *
 * @author Rimba Diza
 * Fitur ini digunakan untuk menghilangkan satu index di dalam suatu array
 */
public class IndexRemover implements ArrayIntMapper {

    /**
     *
     * @param a array dengan tipe data byte
     * @param b suatu nilai dengan tipe data integer
     * @return sebuah array dengan tipe data byte
     */
    @Override
    public byte[] operate(byte[] a, int b) {
    byte[] output = new byte[a.length - 1];
        for (int i = 0; i < output.length; i++) {
            if (i >= b) {
                output[i] = a[i + 1];
            } else {
                output[i] = a[i];
            }
        }
        return output;
    }

    /**
     *
     * @param a array dengan tipe data short
     * @param b suatu nilai dengan tipe data integer
     * @return sebuah array dengan tipe data short
     */
    @Override
    public short[] operate(short[] a, int b) {
    short[] output = new short[a.length - 1];
        for (int i = 0; i < output.length; i++) {
            if (i >= b) {
                output[i] = a[i + 1];
            } else {
                output[i] = a[i];
            }
        }
        return output;
    }

    /**
     *
     * @param a array dengan tipe data integer
     * @param b suatu nilai dengan tipe data integer
     * @return sebuah array dengan tipe data integer
     */
    @Override
    public int[] operate(int[] a, int b) {
    int[] output = new int[a.length - 1];
        for (int i = 0; i < output.length; i++) {
            if (i >= b) {
                output[i] = a[i + 1];
            } else {
                output[i] = a[i];
            }
        }
        return output;
    }

    /**
     *
     * @param a array dengan tipe data long
     * @param b suatu nilai dengan tipe data integer
     * @return sebuah array dengan tipe data long
     */
    @Override
    public long[] operate(long[] a, int b) {
    long[] output = new long[a.length - 1];
        for (int i = 0; i < output.length; i++) {
            if (i >= b) {
                output[i] = a[i + 1];
            } else {
                output[i] = a[i];
            }
        }
        return output;
    }

    /**
     *
     * @param a array dengan tipe data float
     * @param b suatu nilai dengan tipe data integer
     * @return sebuah array dengan tipe data float
     */
    @Override
    public float[] operate(float[] a, int b) {
    float[] output = new float[a.length - 1];
        for (int i = 0; i < output.length; i++) {
            if (i >= b) {
                output[i] = a[i + 1];
            } else {
                output[i] = a[i];
            }
        }
        return output;
    }

    /**
     *
     * @param a array dengan tipe data double
     * @param b suatu nilai dengan tipe data integer
     * @return sebuah array dengan tipe data double
     */
    @Override
    public double[] operate(double[] a, int b) {
    double[] output = new double[a.length - 1];
        for (int i = 0; i < output.length; i++) {
            if (i >= b) {
                output[i] = a[i + 1];
            } else {
                output[i] = a[i];
            }
        }
        return output;
    }
}
