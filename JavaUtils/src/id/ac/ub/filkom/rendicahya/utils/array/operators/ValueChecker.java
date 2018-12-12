package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayScalarToBooleanFunction;

// Input: [1, 2, 3, 4]
// Input: 3
// Output: true
public class ValueChecker implements ArrayScalarToBooleanFunction {

    @Override
    public boolean operate(byte[] a, byte b) {
         boolean cek= false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==b){
                cek=true;
            }
            
        }
        return cek;
    }

    @Override
    public boolean operate(short[] a, short b) {
         boolean cek= false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==b){
                cek=true;
            }
            
        }
        return cek;
    }

    @Override
    public boolean operate(int[] a, int b) {
         boolean cek= false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==b){
                cek=true;
            }
            
        }
        return cek;
    }

    @Override
    public boolean operate(long[] a, long b) {
         boolean cek= false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==b){
                cek=true;
            }
            
        }
        return cek;
    }

    @Override
    public boolean operate(float[] a, float b) {
         boolean cek= false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==b){
                cek=true;
            }
            
        }
        return cek;
    }

    @Override
    public boolean operate(double[] a, double b) {
         boolean cek= false;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==b){
                cek=true;
            }
            
        }
        return cek;
    }
}
