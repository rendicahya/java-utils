package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayIntMapper;

// Input 1: [1, 2, 3]
// Input 2: 3
// Output: [1, 2, 3, 1, 2, 3, 1, 2, 3]
/**
 * This program is to repeat an array
 * 
 */
public class Repeater implements ArrayIntMapper {

/**
 * Repeat an array with byte
 * @param a
 * @param b
 * @return 
 */    
    @Override
    public byte[] operate(byte[] a, int b) {
        byte[] output = new byte[a.length * b];
        for (int i = 0; i < output.length; i++) {
            output[i] = a[i % a.length];
        }
        return output;
    }

    
    /**
     * Repeat an array with short
     * @param a
     * @param b
     * @return 
     */
    @Override
    public short[] operate(short[] a, int b) {
        short[] output = new short[a.length * b];
        for (int i = 0; i < output.length; i++) {
            output[i] = a[i % a.length];
        }
        return output;
    }

    
    /**
     * Repeat an array with integer
     * @param a
     * @param b
     * @return 
     */
    @Override
    public int[] operate(int[] a, int b) {

        int[] output = new int[a.length * b];
        for (int i = 0; i < output.length; i++) {
            output[i] = a[i % a.length];
        }
        return output;
    }

    
    /**
     * Repeat an array with long
     * @param a
     * @param b
     * @return 
     */
    @Override
    public long[] operate(long[] a, int b) {
        long[] output = new long[a.length * b];
        for (int i = 0; i < output.length; i++) {
            output[i] = a[i % a.length];
        }
        return output;
    }

    /**
     * Repeat an array with float
     * @param a
     * @param b
     * @return 
     */
    @Override
    public float[] operate(float[] a, int b) {
        float[] output = new float[a.length * b];
        for (int i = 0; i < output.length; i++) {
            output[i] = a[i % a.length];
        }
        return output;
    }

    
    /**
     * Repeat an array with double
     * @param a
     * @param b
     * @return 
     */
    @Override
    public double[] operate(double[] a, int b) {
        double[] output = new double[a.length * b];
        for (int i = 0; i < output.length; i++) {
            output[i] = a[i % a.length];
        }
        return output;
    }

}
