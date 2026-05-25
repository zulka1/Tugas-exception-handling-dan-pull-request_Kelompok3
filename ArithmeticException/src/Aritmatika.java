import java.util.Scanner;

public class Aritmatika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pembilang;
        int penyebut;

        try {
            System.out.print("Masukkan pembilang : ");
            pembilang = input.nextInt();
            System.out.print("Masukkan penyebut : ");
            penyebut = input.nextInt();
            int hasil = pembilang / penyebut;
            System.out.println("Hasil pembagian : " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error= penyebut tidak boleh 0");
        } input.close();
    }
}