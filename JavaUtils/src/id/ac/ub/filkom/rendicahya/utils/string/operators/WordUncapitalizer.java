package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringMapper;
import java.util.Scanner;

// Input: "Foo Bar"
// Output: "foo bar"

// Input: "foo Bar"
// Output: "foo bar"
public class WordUncapitalizer implements StringMapper {
 
    public static String worduncapitalizer (String input) {
        String output = input.toLowerCase().trim();
        return output;
    }

    @Override
    public String map(String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan huruf");
        String masuk = in.nextLine();
        System.out.println(worduncapitalizer(masuk));
    }
}
   