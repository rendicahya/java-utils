package id.ac.ub.filkom.rendicahya.utils.array.operators;

import id.ac.ub.filkom.rendicahya.utils.array.interfaces.DoubleArrayTwoDoubleMapper;

// Input 1: [0, 0.16, 0.58, 1]
// Input 2: 8
// Input 3: 20
// Output: [8, 10, 15, 20]
public class ArrayDenormalizer implements DoubleArrayTwoDoubleMapper {
  public double[] map(double[] input, double a, double b) {
        double[] y=new double[input.length];
        for(int i=0;i<input.length;i++){
            y[i]=a+(input[i]*(b-a));
        }
        return y;
    }
}


