import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] peringkat = {
            "Andi Pratama",     
            "Bella Safira",     
            "Chandra Wijaya",    
            "Dewi Kusuma",      
            "Eka Nugroho"       
        };
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("=== Sistem Pencarian Peringkat Mahasiswa ===");
        System.out.println("Data tersedia: Peringkat 1 sampai " + peringkat.length);
        System.out.print("Masukkan peringkat yang dicari: ");
 
        int inputPeringkat = scanner.nextInt();
 
        try {
            int index = inputPeringkat - 1;
            String namaMahasiswa = peringkat[index];
 
            System.out.println("Peringkat ke-" + inputPeringkat + ": " + namaMahasiswa);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("[ERROR] Peringkat ke-" + inputPeringkat + " tidak ditemukan.");
            System.out.println("Data hanya tersedia untuk peringkat 1 sampai " + peringkat.length + ".");
        } 
        finally {
            System.out.println("Pencarian selesai.");
            scanner.close();
        }
    }
}
