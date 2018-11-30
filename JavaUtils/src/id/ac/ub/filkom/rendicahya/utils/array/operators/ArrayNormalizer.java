package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.ArrayToDoubleArrayMapper;
import java.util.Scanner;

// Input: [8, 10, 15, 20]
// Output: [0, 0.16, 0.58, 1]
public class ArrayNormalizer implements ArrayToDoubleArrayMapper {

    @Override
    public double[] reduce(byte[] input) {
        var masukkan = new Scanner(System.in);

        int lenght = masukkan.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        byte[] inputNum = new byte[lenght];
        double[] outputNum = new double[lenght];
        for (int i = 0; i < inputNum.length; i++) {
            System.out.print("Masukkan Nilai index ke " + (i + 1) + " : ");
            inputNum[i] = masukkan.nextByte();
        }
        for (int i = 0; i < inputNum.length; i++) {
            if (min > inputNum[i]) {
                min = inputNum[i];
            }
            if (max < inputNum[i]) {
                max = inputNum[i];
            }
        }
        for (int i = 1; i < inputNum.length; i++) {
            double temp;
            temp = (double) (inputNum[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }

    @Override
    public double[] reduce(short[] input) {
        var masukkan = new Scanner(System.in);

        int lenght = masukkan.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        short[] inputNum = new short[lenght];
        double[] outputNum = new double[lenght];
        for (int i = 0; i < inputNum.length; i++) {
            System.out.print("Masukkan Nilai index ke " + (i + 1) + " : ");
            inputNum[i] = masukkan.nextShort();
        }
        for (int i = 0; i < inputNum.length; i++) {
            if (min > inputNum[i]) {
                min = inputNum[i];
            }
            if (max < inputNum[i]) {
                max = inputNum[i];
            }
        }
        for (int i = 1; i < inputNum.length; i++) {
            double temp;
            temp = (double) (inputNum[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }

    @Override
    public double[] reduce(int[] input) {
        var masukkan = new Scanner(System.in);

        int lenght = masukkan.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] inputNum = new int[lenght];
        double[] outputNum = new double[lenght];
        for (int i = 0; i < inputNum.length; i++) {
            System.out.print("Masukkan Nilai index ke " + (i + 1) + " : ");
            inputNum[i] = masukkan.nextInt();
        }
        for (int i = 0; i < inputNum.length; i++) {
            if (min > inputNum[i]) {
                min = inputNum[i];
            }
            if (max < inputNum[i]) {
                max = inputNum[i];
            }
        }
        for (int i = 1; i < inputNum.length; i++) {
            double temp;
            temp = (double) (inputNum[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }

    @Override
    public double[] reduce(long[] input) {
        var masukkan = new Scanner(System.in);

        int lenght = masukkan.nextInt();
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long[] inputNum = new long[lenght];
        double[] outputNum = new double[lenght];
        for (int i = 0; i < inputNum.length; i++) {
            System.out.print("Masukkan Nilai index ke " + (i + 1) + " : ");
            inputNum[i] = masukkan.nextLong();
        }
        for (int i = 0; i < inputNum.length; i++) {
            if (min > inputNum[i]) {
                min = inputNum[i];
            }
            if (max < inputNum[i]) {
                max = inputNum[i];
            }
        }
        for (int i = 1; i < inputNum.length; i++) {
            double temp;
            temp = (double) (inputNum[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }

    @Override
    public double[] reduce(float[] input) {
        var masukkan = new Scanner(System.in);

        int lenght = masukkan.nextInt();
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;
        float[] inputNum = new float[lenght];
        double[] outputNum = new double[lenght];
        for (int i = 0; i < inputNum.length; i++) {
            System.out.print("Masukkan Nilai index ke " + (i + 1) + " : ");
            inputNum[i] = masukkan.nextFloat();
        }
        for (int i = 0; i < inputNum.length; i++) {
            if (min > inputNum[i]) {
                min = inputNum[i];
            }
            if (max < inputNum[i]) {
                max = inputNum[i];
            }
        }
        for (int i = 1; i < inputNum.length; i++) {
            double temp;
            temp = (double) (inputNum[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }

    @Override
    public double[] reduce(double[] input) {
        var masukkan = new Scanner(System.in);

        int lenght = masukkan.nextInt();
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double[] inputNum = new double[lenght];
        double[] outputNum = new double[lenght];
        for (int i = 0; i < inputNum.length; i++) {
            System.out.print("Masukkan Nilai index ke " + (i + 1) + " : ");
            inputNum[i] = masukkan.nextDouble();
        }
        for (int i = 0; i < inputNum.length; i++) {
            if (min > inputNum[i]) {
                min = inputNum[i];
            }
            if (max < inputNum[i]) {
                max = inputNum[i];
            }
        }
        for (int i = 1; i < inputNum.length; i++) {
            double temp;
            temp = (double) (inputNum[i] - min) / (max - min);
            outputNum[i] = Double.parseDouble(String.format("%.2f", temp));
        }
        return outputNum;
    }
}
