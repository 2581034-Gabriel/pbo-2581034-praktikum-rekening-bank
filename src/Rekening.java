import java.util.Locale;

public class Rekening {
    // Field PRIVATE: tidak bisa disentuh langsung dari luar class
    private String nomor;
    private String pemilik;
    private int saldo;

    // Constructor: nama = nama class, tanpa return type
    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    // GETTER: hanya membaca. Sengaja tidak ada setSaldo (saldo read-only)
    public String getNomor() {
        return nomor;
    }

    public String getPemilik() {
        return pemilik;
    }

    public int getSaldo() {
        return saldo;
    }

    // Setor: jumlah <= 0 ditolak
    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        saldo += jumlah;
        return true;
    }

    // Tarik: jumlah <= 0 atau melebihi saldo ditolak
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }
        saldo -= jumlah;
        return true;
    }

    // Cetak satu baris, contoh: 001 | Ani | Rp120.000
    public void cetakInfo() {
        System.out.println(nomor + " | " + pemilik + " | " + formatRupiah(saldo));
    }

    // Helper PRIVATE (dari Bab 08): 120000 -> Rp120.000
    private static String formatRupiah(int jumlah) {
        return "Rp" + String.format(Locale.US, "%,d", jumlah).replace(',', '.');
    }
}