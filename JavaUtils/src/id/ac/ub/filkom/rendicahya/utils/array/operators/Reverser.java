package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayMapper;

// Input: [1, 2, 3, 4]
// Output: [4, 3, 2, 1]
public class Reverser implements ArrayMapper {

    @Override
    public byte[] map(byte[] a) {
        byte []reverse = new byte[a.length];
        for (int i = 0; i < a.length/2; i++)  { // for loop, that checks each array slot
        reverse[i] = a[i];
        a[i] = a[a.length-1-i];  // creates a new array that is in reverse order of the original
        a[a.length-1-i] = reverse[i];
        }
        return reverse; 
    }

    @Override
    public short[] map(short[] a) {
        short []reverse = new short[a.length];
        for (int i = 0; i < a.length/2; i++)  { // for loop, that checks each array slot
        reverse[i] = a[i];
        a[i] = a[a.length-1-i];  // creates a new array that is in reverse order of the original
        a[a.length-1-i] = reverse[i];
        }
        return reverse;
    }

    @Override
    public int[] map(int[] a) {
        int []reverse = new int[a.length];
        for (int i = 0; i < a.length/2; i++)  { // for loop, that checks each array slot
        reverse[i] = a[i];
        a[i] = a[a.length-1-i];  // creates a new array that is in reverse order of the original
        a[a.length-1-i] = reverse[i];
        }
        return reverse;
    }

    @Override
    public long[] map(long[] a) {
        long []reverse = new long[a.length];
        for (int i = 0; i < a.length/2; i++)  { // for loop, that checks each array slot
        reverse[i] = a[i];
        a[i] = a[a.length-1-i];  // creates a new array that is in reverse order of the original
        a[a.length-1-i] = reverse[i];
        }
        return reverse;
    }

    @Override
    public float[] map(float[] a) {
        float []reverse = new float[a.length];
        for (int i = 0; i < a.length/2; i++)  { // for loop, that checks each array slot
        reverse[i] = a[i];
        a[i] = a[a.length-1-i];  // creates a new array that is in reverse order of the original
        a[a.length-1-i] = reverse[i];
        }
        return reverse;
    }

    @Override
    public double[] map(double[] a) {
        double []reverse = new double[a.length];
        for (int i = 0; i < a.length/2; i++)  { // for loop, that checks each array slot
        reverse[i] = a[i];
        a[i] = a[a.length-1-i];  // creates a new array that is in reverse order of the original
        a[a.length-1-i] = reverse[i];
        }
        return reverse;
    }
}
