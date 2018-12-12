package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringCharToIntReducer;

// Input 1: "Hello"
// Input 2: 'l'
// Output: 2
public class CharCounter implements StringCharToIntReducer {

    @Override
    public int reduce(String input, char c) {
        input = "Hello";
        c = 'l';
        int reduce = 0;

        for (int z = 0; z < 10; z++) {
            if (input.charAt(z) == c) {
                reduce++;
            }
        }
        System.out.println(reduce);
        return reduce;

    }
}
