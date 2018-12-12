package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringToStringArrayMapper;

// Input: "hello-good_morning everybody"
// Output: 
public class WordSplitter implements StringToStringArrayMapper {

    @Override
    public String[] map(String input) {
        String[] arr = input.split("");
        return arr;
    }
}
