package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringMapper;

// Input: "  foo bar   "
// Output: "  foo bar"
public class RightTrim implements StringMapper {    
    @Override
    public String map(String input) {
        int i = input.length() - 1;                                                // banyak (huruf - 1) untuk substring
        while (i >= 0 && Character.isWhitespace(input.charAt(i))) {                // pengecekan whitespace dari kanan string
            i--;                                                                   // mengurangi i untuk menghapus whitespace
        }
        return input.substring(0, i + 1);                                          // mengembalikan nilai input dari huruf ke 0 sampai huruf ke i + 1 (dari awal)
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
