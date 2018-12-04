package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.TwoArraysMapper;

/**
<<<<<<< HEAD
 * The {@code Appender} returned concatenated of arrays.
 *
 * <p>
 * Among the facilities provided by the {@code Appender} class are standard
 * input, standard output, and error output streams; access to externally
 * defined properties and environment variables; a means of loading files and
 * libraries; and a utility method for quickly copying a portion of an array.
 * </p>
 * Ex: Input 1: [1, 2, 3] | Input 2: [4, 5, 6] | Output : [1, 2, 3, 4, 5, 6]
 * 
 * @author Andrian Roshandy
 * @since 1.0
 * @see Appender
=======
 * 
 * @author Andrian Roshandy, @nim 145150200111072.
 * 
 *         This operator function works to concatenate two arrays into a single
 *         array. A new array will be created with length are combined from both
 *         arrays. Then do looping during length of new created array. Each
 *         array index filled into new array, first and second array
 *         continously. Next, the result will be return to the caller method.
 * 
 *         Input 1: [1, 2, 3] | Input 2: [4, 5, 6] | Output : [1, 2, 3, 4, 5, 6]
>>>>>>> 92517d09749314ec31acf727cd397d624d6f0ba7
 */
public class Appender implements TwoArraysMapper {

    /**
     * The function is to append two arrays of BYTE.
<<<<<<< HEAD
     * 
=======
     * @param two values of BYTE arrays.
>>>>>>> 92517d09749314ec31acf727cd397d624d6f0ba7
     * @return Concatenated array of BYTE.
     */
    @Override
    public byte[] operate(byte[] a, byte[] b) {
        byte[] arrAppend = new byte[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++)
            arrAppend[i] = i < a.length ? a[i] : b[i - a.length];

        return arrAppend;
    }

    /**
     * The function is to append two arrays of DOUBLE.
<<<<<<< HEAD
     * 
=======
     * @param two values of DOUBLE arrays.
>>>>>>> 92517d09749314ec31acf727cd397d624d6f0ba7
     * @return Concatenated array of DOUBLE.
     */
    @Override
    public double[] operate(double[] a, double[] b) {
        double[] arrAppend = new double[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++)
            arrAppend[i] = i < a.length ? a[i] : b[i - a.length];

        return arrAppend;
    }

    /**
     * The function is to append two arrays of FLOAT.
<<<<<<< HEAD
     * 
=======
     * @param two values of FLOAT arrays.
>>>>>>> 92517d09749314ec31acf727cd397d624d6f0ba7
     * @return Concatenated array of FLOAT.
     */
    @Override
    public float[] operate(float[] a, float[] b) {
        float[] arrAppend = new float[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++)
            arrAppend[i] = i < a.length ? a[i] : b[i - a.length];

        return arrAppend;
    }

    /**
     * The function is to append two arrays of INTEGER.
<<<<<<< HEAD
     * 
=======
     * @param two values of INTEGER arrays.
>>>>>>> 92517d09749314ec31acf727cd397d624d6f0ba7
     * @return Concatenated array of INTEGER.
     */
    @Override
    public int[] operate(int[] a, int[] b) {
        int[] arrAppend = new int[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++)
            arrAppend[i] = i < a.length ? a[i] : b[i - a.length];

        return arrAppend;
    }

    /**
<<<<<<< HEAD
     * Returns appended two arrays of LONG.
     * 
=======
     * The function is to append two arrays of LONG.
     * @param two values of LONG arrays.
>>>>>>> 92517d09749314ec31acf727cd397d624d6f0ba7
     * @return Concatenated array of LONG.
     */
    @Override
    public long[] operate(long[] a, long[] b) {
        long[] arrAppend = new long[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++)
            arrAppend[i] = i < a.length ? a[i] : b[i - a.length];

        return arrAppend;
    }

    /**
     * The function is to append two arrays of SHORT.
<<<<<<< HEAD
     * 
=======
     * @param two values of SHORT arrays.
>>>>>>> 92517d09749314ec31acf727cd397d624d6f0ba7
     * @return Concatenated array of SHORT.
     */
    @Override
    public short[] operate(short[] a, short[] b) {
        short[] arrAppend = new short[a.length + b.length];

        for (int i = 0; i < arrAppend.length; i++)
            arrAppend[i] = i < a.length ? a[i] : b[i - a.length];

        return arrAppend;
    }
}