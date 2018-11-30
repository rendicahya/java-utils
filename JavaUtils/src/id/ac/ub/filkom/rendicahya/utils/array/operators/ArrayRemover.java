package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.TwoArraysMapper;

// Input 1: [2, 0, 5, 1, 0, 3]
// Input 2: [0, 1]
// Output: [2, 5, 3]
/**
 * 
 * @author Ivan Lianto
 * This operator function works to remove the same array between input 1 and input 2
 * Based on kind of data type such as byte, short, int, long, float, and double
 * Ex :
 * Input 1 : [2, 0, 5, 1, 0, 3]
 * Input 2 : [0, 1]
 * Output : [2, 5, 3]
 */
public class ArrayRemover implements TwoArraysMapper {

    /**
     * This function is about to remove the same array between byte [] a and byte [] b
     * @param a
     * @param b
     * The data type of a and b are byte
     * @return byte
     */
    @Override
    public byte[] operate(byte[] a, byte[] b) {
        String c = "";
        for (int i = 0; i < a.length; i++) {
            byte count=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) count++;
            }
            if (count == 0){
                int save =(int) a[i];
                c += String.valueOf(save);
            }
        }
        char [] f = c.toCharArray();
        byte [] g = new byte[f.length];
        for (int i = 0; i < g.length; i++) {
            g[i] =  (byte) (f[i] - 48);
        }
        return g;
    }

    /**
     * This function is about to remove the same array between short [] a and short [] b
     * @param a
     * @param b
     * The data type of a and b are short
     * @return short
     */
    @Override
    public short[] operate(short[] a, short[] b) {
        String c = "";
        for (int i = 0; i < a.length; i++) {
            short count=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) count++;
            }
            if (count == 0){
                int save =(int) a[i];
                c += String.valueOf(save);
            }
        }
        char [] f = c.toCharArray();
        short [] g = new short[f.length];
        for (int i = 0; i < g.length; i++) {
            g[i] =  (short) (f[i] - 48);
        }
        return g;
    }

    /**
     * This function is about to remove the same array between int [] a and int [] b
     * @param a
     * @param b
     * The data type of a and b are integer
     * @return int
     */
    @Override
    public int[] operate(int[] a, int[] b) {
        String c = "";
        for (int i = 0; i < a.length; i++) {
            int count=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) count++;
            }
            if (count == 0){
                int save =(int) a[i];
                c += String.valueOf(save);
            }
        }
        char [] f = c.toCharArray();
        int [] g = new int[f.length];
        for (int i = 0; i < g.length; i++) {
            g[i] =  (int) (f[i] - 48);
        }
        return g;
    }

    /**
     * This function is about to remove the same array between long [] a and long [] b
     * @param a
     * @param b
     * The data type of a and b are long
     * @return long
     */
    @Override
    public long[] operate(long[] a, long[] b) {
        String c = "";
        for (int i = 0; i < a.length; i++) {
            long count=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) count++;
            }
            if (count == 0){
                int save =(int) a[i];
                c += String.valueOf(save);
            }
        }
        char [] f = c.toCharArray();
        long [] g = new long[f.length];
        for (int i = 0; i < g.length; i++) {
            g[i] =  (long) (f[i] - 48);
        }
        return g;
    }

    /**
     * This function is about to remove the same array between float [] a and float [] b
     * @param a
     * @param b
     * The data type of a and b are float
     * @return 
     */
    @Override
    public float[] operate(float[] a, float[] b) {
        String c = "";
        for (int i = 0; i < a.length; i++) {
            float count=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) count++;
            }
            if (count == 0){
                int save =(int) a[i];
                c += String.valueOf(save);
            }
        }
        char [] f = c.toCharArray();
        float [] g = new float[f.length];
        for (int i = 0; i < g.length; i++) {
            g[i] =  (float) (f[i] - 48);
        }
        return g;
   
    }

    /**
     * This function is about to remove the same array between double [] a and double [] b
     * @param a
     * @param b
     * The data type of a and b are float
     * @return double
     */
    @Override
    public double[] operate(double[] a, double[] b) {
        String c = "";
        for (int i = 0; i < a.length; i++) {
            double count=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) count++;
            }
            if (count == 0){
                int save =(int) a[i];
                c += String.valueOf(save);
            }
        }
        char [] f = c.toCharArray();
        double [] g = new double[f.length];
        for (int i = 0; i < g.length; i++) {
            g[i] =  (double) (f[i] - 48);
        }
        return g;
    }
}
