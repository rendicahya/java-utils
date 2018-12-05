package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringMapper;

// Input: "  foo bar   "
// Output: "  foo bar"
public class RightTrim implements StringMapper {    
    @Override
    public String map(String input) {
        int i = input.length() - 1;
        while (i >= 0 && Character.isWhitespace(input.charAt(i))) {
            i--;
        }
        return input.substring(0, i + 1);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
