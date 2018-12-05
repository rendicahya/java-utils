package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayScalarMapper;

// Input 1: [1, 2, 3]
// Input 2: 3
// Output: [4, 5, 6]

/**
 * Dibawah ini adalah method scalarAdder, yaitu menambahkan nilai masing-masing index
 * pada suatu array dengan input yang dituliskan
 * @author Kadaite
 */

public class ScalarAdder implements ArrayScalarMapper {

    @Override
    public byte[] operate(byte[] a, byte b) {
        for (int i = 0; i < a.length; i++) {
            a [i] += b;
        }
        return a;
        
}

    @Override
    public short[] operate(short[] a, short b) {
        
        for (int i = 0; i < a.length; i++) {
            a [i] += b;
        }
        return a;
    }

    @Override
    public int[] operate(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            a [i] += b;
        }
        return a;
    }

    @Override
    public long[] operate(long[] a, long b) {
        
        for (int i = 0; i < a.length; i++) {
            a [i] += b;
        }
        return a;
    }

    @Override
    public float[] operate(float[] a, float b) {
        
        for (int i = 0; i < a.length; i++) {
            a [i] += b;
        }
        return a;
    }

    @Override
    public double[] operate(double[] a, double b) {
        
        for (int i = 0; i < a.length; i++) {
            a [i] += b;
        }
        return a;
    }
}
