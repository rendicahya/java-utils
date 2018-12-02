package id.ac.ub.filkom.rendicahya.utils.array.operators;
/**
 * Program ini digunakan untuk menghapus salah satu nilai pada suatu array
 * input yang dibutuhkan untuk melakukan ini adalah, user menentukan nialai mana
 * yang akan dihilangkan pada array yang telah ditentukan
 */
import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayScalarMapper;

// Input: [1, 2, 3, 4]
// Remove: 2
// Output: [1, 3, 4]
public class ValueRemover implements ArrayScalarMapper {

    @Override
    public byte[] operate(byte[] a, byte b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                byte[] copy = new byte[a.length - 1];
                System.arraycopy(a, 0, copy, 0, i);
                System.arraycopy(a, i + 1, copy, i, a.length - i - 1);
                return copy;
            }
        }
        return a;
    }

    @Override
    public short[] operate(short[] a, short b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                short[] copy = new short[a.length - 1];
                System.arraycopy(a, 0, copy, 0, i);
                System.arraycopy(a, i + 1, copy, i, a.length - i - 1);
                return copy;
            }
        }
        return a;
    }

    @Override
    public int[] operate(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                int[] copy = new int[a.length - 1];
                System.arraycopy(a, 0, copy, 0, i);
                System.arraycopy(a, i + 1, copy, i, a.length - i - 1);
                return copy;
            }
        }
        return a;
    }

    @Override
    public long[] operate(long[] a, long b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                long[] copy = new long[a.length - 1];
                System.arraycopy(a, 0, copy, 0, i);
                System.arraycopy(a, i + 1, copy, i, a.length - i - 1);
                return copy;
            }
        }
        return a;
    }

    @Override
    public float[] operate(float[] a, float b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                float[] copy = new float[a.length - 1];
                System.arraycopy(a, 0, copy, 0, i);
                System.arraycopy(a, i + 1, copy, i, a.length - i - 1);
                return copy;
            }
        }
        return a;
    }

    @Override
    public double[] operate(double[] a, double b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                double[] copy = new double[a.length - 1];
                System.arraycopy(a, 0, copy, 0, i);
                System.arraycopy(a, i + 1, copy, i, a.length - i - 1);
                return copy;
            }
        }
        return a;
    }
}
