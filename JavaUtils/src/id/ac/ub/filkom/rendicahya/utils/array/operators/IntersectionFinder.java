package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.TwoArraysMapper;

// Input: [1, 2, 3, 4]
// Input: [1, 4, 7, 10]
// Output: [1, 4]
public class IntersectionFinder implements TwoArraysMapper {

    @Override
    public byte[] operate(byte[] a, byte[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                    break;
                }
            }
        }
        byte[] c = new byte[count];
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[count2] = a[i];
                    count2++;
                    break;
                }
            }

        }
        return c;
    }

    @Override
    public short[] operate(short[] a, short[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                    break;
                }
            }
        }
        short[] c = new short[count];
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[count2] = a[i];
                    count2++;
                    break;
                }
            }

        }
        return c;
    }

    @Override
    public int[] operate(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                    break;
                }
            }
        }
        int[] c = new int[count];
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[count2] = a[i];
                    count2++;
                    break;
                }
            }

        }
        return c;
    }

    @Override
    public long[] operate(long[] a, long[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                    break;
                }
            }
        }
        long[] c = new long[count];
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[count2] = a[i];
                    count2++;
                    break;
                }
            }

        }
        return c;
    }

    @Override
    public float[] operate(float[] a, float[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                    break;
                }
            }
        }
        float[] c = new float[count];
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[count2] = a[i];
                    count2++;
                    break;
                }
            }

        }
        return c;
    }

    @Override
    public double[] operate(double[] a, double[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                    break;
                }
            }
        }
        double[] c = new double[count];
        int count2 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[count2] = a[i];
                    count2++;
                    break;
                }
            }

        }
        return c;
    }
}
