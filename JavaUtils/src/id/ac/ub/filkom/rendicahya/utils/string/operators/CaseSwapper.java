package id.ac.ub.filkom.rendicahya.utils.string.operators;

import id.ac.ub.filkom.rendicahya.utils.string.interfaces.StringMapper;
import java.util.Scanner;
// Input: "fOO Bar"
// Output: "Foo bAR"

public class CaseSwapper implements StringMapper {

    public static void main(String[] args) {
        Scanner baru = new Scanner(System.in);
        System.out.print("Masukkan kata : ");
        String kata = baru.nextLine();
        char[] ab = kata.toCharArray();
        for (int i = 0; i < ab.length; i++) {
            char huruf = ab[i];
            if (Character.isUpperCase(huruf)) {
                ab[i]=Character.toLowerCase(huruf);
            }
            else if(Character.isLowerCase(huruf)){
                ab[i]=Character.toUpperCase(huruf);
            }

        }
        System.out.println(ab);
        
    }

    @Override
    public String map(String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
