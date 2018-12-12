package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringToIntReducer;

// Input: "Rp1.500.250"
// Output: 1500250
public class IntegerParser implements StringToIntReducer {

    @Override
    public int reduce(String input) {
        
        char[] a = new char[input.length()];
        String b = "";
        for (int i = 0; i < a.length; i++) {
            a[i]=input.charAt(i);
        }
        for (int i = 0; i < a.length; i++) {
            if(Character.isDigit(a[i])) {
                b += a[i];
            }
        }
        int c = Integer.parseInt(b);
        System.out.println(c);
        return c;
    }
}
