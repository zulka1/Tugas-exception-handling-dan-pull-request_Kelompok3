import java.util.Scanner;

public class ParsingData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int umur = 0;
        boolean isInputValid = false;

        System.out.println("--- Sistem Pendaftaran ---");

        // Input dari pengguna
        while (!isInputValid) {
            System.out.print("Masukkan umur kamu (angka saja, misal: 20): ");
            String inputUser = scanner.nextLine();

            try {
                // Mencoba mengubah teks menjadi angka
                umur = Integer.parseInt(inputUser);
                
                // Jika baris di atas berhasil, baris di bawah akan dieksekusi
                isInputValid = true; 
                System.out.println("Sip! Umur kamu berhasil dicatat: " + umur + " tahun.");

            } catch (NumberFormatException e) {
                // Menangkap error jika user memasukkan huruf
                System.out.println("Oops! Format salah. Tolong masukkan pakai angka ya, bukan huruf atau teks tambahan.\n");
            }
        }
        
        scanner.close();
    }
}