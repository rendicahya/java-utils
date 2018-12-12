package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayMapper;
import java.util.Arrays;

// Input: [1, 3, 1, 4, 3, 2, 4]
// Output: [1, 3, 4, 2]
public class UniqueElementsFinder implements ArrayMapper {

    @Override
    public byte[] map(byte[] a) {
        byte[] unique  = new byte [a.length];
        for (int i=0; i<a.length; i++){
            boolean isUnique=false;
            for (int j=0; j<i; j++){
                if (a[i]==a[j]){
                    isUnique=true;
                }
                if (!isUnique){
                unique[i]=a[i];
                }
            }    
        }
        return unique;
    }

    @Override
    public short[] map(short[] a) {
        short []unique = new short [a.length];
        for (int i=0; i<a.length; i++){
            boolean isUnique=false;
            for (int j=0; j<i; j++){
                if (a[i]==a[j]){
                    isUnique=true;
                }
                if (!isUnique){
                unique[i]=a[i];
                }
            }    
        }
        return unique; 
    }

    @Override
    public int[] map(int[] a) {
        int [] unique = new int [a.length];
        for (int i=0; i<a.length; i++){
            boolean isUnique=false;
            for (int j=0; j<i; j++){
                if (a[i]==a[j]){
                    isUnique=true;
                }
                if (!isUnique){
                unique[i]=a[i];
                }
            }    
        }
        return unique;
    }

    @Override
    public long[] map(long[] a) {
        long [] unique = new long [a.length];
        for (int i=0; i<a.length; i++){
            boolean isUnique=false;
            for (int j=0; j<i; j++){
                if (a[i]==a[j]){
                    isUnique=true;
                }
                if (!isUnique){
                unique[i]=a[i];
                }
            }    
        }
        return unique;
    }

    @Override
    public float[] map(float[] a) {
        float [] unique = new float [a.length];
        for (int i=0; i<a.length; i++){
            boolean isUnique=false;
            for (int j=0; j<i; j++){
                if (a[i]==a[j]){
                    isUnique=true;
                }
                if (!isUnique){
                unique[i]=a[i];
                }
            }    
        }
        return unique;
    }

    @Override
    public double[] map(double[] a) {
        double [] unique = new double[a.length];
        for (int i=0; i<a.length; i++){
            boolean isUnique=false;
            for (int j=0; j<i; j++){
                if (a[i]==a[j]){
                    isUnique=true;
                }
                if (!isUnique){
                unique[i]=a[i];
                }
            }    
        }
        return unique;
    }
        
    }


