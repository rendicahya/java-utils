package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringMapper;

// Input: "  foo bar   "
// Output: "foo bar   "
public class LeftTrim implements StringMapper {
    @Override
    public String map(String input) {
        input = input.trim();
        System.out.print(input);
        return "";
    }
    public static void main(String[] args) {
        String in = "    foo bar";
        LeftTrim leftTrim = new LeftTrim();
        leftTrim.map(in);
    }
}    