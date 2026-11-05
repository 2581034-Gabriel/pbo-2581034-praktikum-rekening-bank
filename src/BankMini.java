public class BankMini {
    public static void main(String[] args) {
        Rekening rekening = new Rekening("001", "Ani", 100000);

        System.out.println("============ BANK MINI ============");
        System.out.println("Rekening " + rekening.getNomor() + " a.n. " + rekening.getPemilik());
        rekening.cetakInfo();
    }
}