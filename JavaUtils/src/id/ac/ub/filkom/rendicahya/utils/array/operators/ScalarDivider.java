package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayIntToDoubleArrayMapper;

// Input 1: [1, 2, 3]
// Input 2: 2
// Output: [0.5, 1, 1.5]
public class ScalarDivider implements ArrayIntToDoubleArrayMapper {
    @Override
    public double[] operate(byte[] a, byte b) {
        double []divide = new double [a.length];
        for (int i = 0; i < a.length; i++) {
            divide[i]=a[i];
            divide[i]/=b;  
        }
        return divide;
    }

    @Override
    public double[] operate(short[] a, short b) {
        double[]divide=new double [a.length];
        for (int i = 0; i < a.length; i++) {
            divide [i]=a[i];
            divide [i]/=b;
        }
        return divide;
    }

    @Override
    public double[] operate(int[] a, int b) {
        double[]divide=new double [a.length];
        for (int i = 0; i < a.length; i++) {
            divide [i]=a[i];
            divide [i]/=b;
        }
        return divide;
    }

    @Override
    public double[] operate(long[] a, long b) {
        double []divide = new double [a.length];
        for (int i = 0; i < a.length; i++) {
            divide[i]=a[i];
            divide[i]/=a[i];
        }
        return divide;
    }

    @Override
    public double[] operate(float[] a, float b) {
        double []divide = new double [a.length];
        for (int i = 0; i < a.length; i++) {
            divide[i]=a[i];
            divide[i]/=a[i];
        }
        return divide;
    }

    @Override
    public double[] operate(double[] a, double b) {
        double []divide = new double [a.length];
        for (int i = 0; i < a.length; i++) {
            divide[i]=a[i];
            divide[i]/=a[i];
        }
        return divide;
    }
}
