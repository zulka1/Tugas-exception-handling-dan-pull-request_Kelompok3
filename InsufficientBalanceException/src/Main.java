class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private String namaPemilik;
    private int saldo;

    public BankAccount(String namaPemilik, int saldo) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void tarikSaldo(int jumlah) throws InsufficientBalanceException {
        if (jumlah > saldo) {
            throw new InsufficientBalanceException(
                    "Saldo tidak cukup! Saldo tersedia: Rp" + saldo +
                    ", jumlah penarikan: Rp" + jumlah
            );
        }

        saldo -= jumlah;
        System.out.println("Penarikan berhasil sebesar Rp" + jumlah);
        System.out.println("Sisa saldo: Rp" + saldo);
    }

    public void tampilkanSaldo() {
        System.out.println("Nama pemilik: " + namaPemilik);
        System.out.println("Saldo saat ini: Rp" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount akun = new BankAccount("Yosafat", 200000);

        akun.tampilkanSaldo();

        try {
            akun.tarikSaldo(500000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        System.out.println("Program tetap berjalan setelah exception ditangani.");
    }
}