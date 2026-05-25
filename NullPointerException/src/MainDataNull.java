public class MainDataNull {
    public static void main(String[] args) {
        System.out.println("Kasus 1: Menangani Data Kosong / Null");
        
        // Simulasi data dari database yang belum diisi
        String username = null; 
        
        try {
            
            System.out.println(username.toUpperCase());
        } catch (NullPointerException e) {
            
            System.out.println("Error: Data pengguna belum diisi (Null) pada database!");
        }
    }
}