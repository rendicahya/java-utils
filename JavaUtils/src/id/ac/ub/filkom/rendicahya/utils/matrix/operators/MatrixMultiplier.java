package id.ac.ub.filkom.rendicahya.utils.matrix.operators;
import java.util.Scanner;
import id.ac.ub.filkom.rendicahya.utils.matrix.interfaces.TwoMatricesMapper;

// Input 1: [[1, 2, 3],
//           [4, 5, 6]]
// Input 2: [[1, 1],
//           [2, 2],
//           [3, 3]]
// Output: [[14, 14],
//          [32, 32]
public class MatrixMultiplier implements TwoMatricesMapper {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kolomA, barisA, kolomB, barisB;
        do {
            System.out.print("Masukkan Baris Matriks A : ");
            barisA = input.nextInt();
            System.out.print("Masukkan Kolom Matriks A : ");
            kolomA = input.nextInt();

            System.out.print("Masukkan Baris Matriks B : ");
            barisB = input.nextInt();
            System.out.print("Masukkan Kolom Matriks B : ");
            kolomB = input.nextInt();
        } while (kolomA != barisB);

        int[][] matriksA = new int[barisA][kolomA];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.printf("Masukkan MatriksA baris %d kolom %d : ", (i + 1), (j + 1));
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print(matriksA[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matriksB = new int[barisB][kolomB];
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.printf("Masukkan MatriksB baris %d kolom %d : ", (i + 1), (j + 1));
                matriksB[i][j] = input.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print(matriksB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriks Hasil");
        int[][] hasil = new int[barisA][kolomB];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                int x = 0;
                for (int k = 0; k < barisB; k++) {
                    x += matriksA[i][k] * matriksB[k][j];
                }
                hasil[i][j] = x;
            }
        }
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public byte[][] operate(byte[][] a, byte[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public short[][] operate(short[][] a, short[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[][] operate(int[][] a, int[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long[][] operate(long[][] a, long[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float[][] operate(float[][] a, float[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[][] operate(double[][] a, double[][] b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



