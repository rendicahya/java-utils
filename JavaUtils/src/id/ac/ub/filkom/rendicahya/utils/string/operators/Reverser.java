package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringMapper;

// Input: "foo bar"
// Output: "rab oof"
public class Reverser implements StringMapper {

    public static void Pembalik(String a) {
        StringBuffer pembalik = new StringBuffer(a);
        System.out.println("Kata Dibalik Menjadi : " + pembalik.reverse());
    }
}
