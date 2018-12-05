package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringMapper;

// Input: "Foo Bar"
// Output: "foo Bar"
public class Decapitalizer implements StringMapper {

    @Override
    public String map(String input) {
        char[] pisah = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            pisah[i] = input.charAt(i);
            pisah[0] = Character.toLowerCase(pisah[0]);
        }

        return String.valueOf(pisah);
    }

}
