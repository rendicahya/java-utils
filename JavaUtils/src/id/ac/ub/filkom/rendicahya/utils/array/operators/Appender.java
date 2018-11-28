package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.TwoArraysMapper;

// Input 1: [1, 2, 3]
// Input 2: [4, 5, 6]
// Output: [1, 2, 3, 4, 5, 6]
public class Appender implements TwoArraysMapper {

    /**
     * Concatenate two arrays of BYTE. A new array will be created with length are
     * combined from both arrays. Then do looping during length of new created
     * array. Each array index filled into new array, first and second array
     * continously. Next, the result will be return to the caller method.
     * 
     * @return Concatenated array of BYTE.
     */
    @Override
    public byte[] operate(byte[] a, byte[] b) {
        var arrAppend = new byte[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }

    /**
     * Concatenate two arrays of DOUBLE. A new array will be created with length are
     * combined from both arrays. Then do looping during length of new created
     * array. Each array index filled into new array, first and second array
     * continously. Next, the result will be return to the caller method.
     * 
     * @return Concatenated array of DOUBLE.
     */
    @Override
    public double[] operate(double[] a, double[] b) {
        var arrAppend = new double[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }

    /**
     * Concatenate two arrays of FLOAT. A new array will be created with length are
     * combined from both arrays. Then do looping during length of new created
     * array. Each array index filled into new array, first and second array
     * continously. Next, the result will be return to the caller method.
     * 
     * @return Concatenated array of FLOAT.
     */
    @Override
    public float[] operate(float[] a, float[] b) {
        var arrAppend = new float[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }

    /**
     * Concatenate two arrays of INTEGER. A new array will be created with length
     * are combined from both arrays. Then do looping during length of new created
     * array. Each array index filled into new array, first and second array
     * continously. Next, the result will be return to the caller method.
     * 
     * @return Concatenated array of INTEGER.
     */
    @Override
    public int[] operate(int[] a, int[] b) {
        var arrAppend = new int[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }

    /**
     * Concatenate two arrays of LONG. A new array will be created with length are
     * combined from both arrays. Then do looping during length of new created
     * array. Each array index filled into new array, first and second array
     * continously. Next, the result will be return to the caller method.
     * 
     * @return Concatenated array of LONG.
     */
    @Override
    public long[] operate(long[] a, long[] b) {
        var arrAppend = new long[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }

    /**
     * Concatenate two arrays of SHORT. A new array will be created with length are
     * combined from both arrays. Then do looping during length of new created
     * array. Each array index filled into new array, first and second array
     * continously. Next, the result will be return to the caller method.
     * 
     * @return Concatenated array of SHORT.
     */
    @Override
    public short[] operate(short[] a, short[] b) {
        var arrAppend = new short[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++) {
            if (i < a.length)
                arrAppend[i] = a[i];
            else
                arrAppend[i] = b[i - a.length];
        }

        return arrAppend;
    }
}