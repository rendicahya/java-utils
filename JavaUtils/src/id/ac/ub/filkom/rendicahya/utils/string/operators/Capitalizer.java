package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringBooleanMapper;
import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringMapper;

// Input: "foo bar"
// Output: "Foo bar"

// Input: "foo Bar"
// Outpu: "Foo Bar"

// Input: "foo Bar", true
// Output: "Foo bar"
public class Capitalizer implements StringMapper, StringBooleanMapper {

    @Override
    public String map(String input) {
        char[] array = input.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        input = "";
        for (int i = 0; i < array.length; i++) {
            input += array[i];
        }
        return input;
    }

    @Override
    public String map(String input, boolean mode) {
        if (mode) {
            char[] array = input.toCharArray();
            array[0] = Character.toUpperCase(array[0]);
            for (int i = 1; i < array.length; i++) {
                array[i] = Character.toLowerCase(array[i]);
            }
            input = "";
            for (int i = 0; i < array.length; i++) {
                input += array[i];
            }
        }
        return input;
    }
}
