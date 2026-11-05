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
}