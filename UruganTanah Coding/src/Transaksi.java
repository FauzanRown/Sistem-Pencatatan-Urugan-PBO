public class Transaksi {
    private Truk truk;
    private int ritase;
    private String tanggal;

    public Transaksi(Truk truk, int ritase, String tanggal) {
        this.truk = truk;
        this.ritase = ritase;
        this.tanggal = tanggal;
    }

    public double hitungTotalVolume() {
        return truk.getVolume() * ritase;
    }

    public void tampilkan() {
        System.out.println("Tanggal : " + tanggal);
        truk.tampilkan();
        System.out.println("Ritase  : " + ritase);
        System.out.println("Total Volume : " + hitungTotalVolume() + " m3");
    }

    @Override
    public String toString() {
        return "Tanggal : " + tanggal + "\n" +
               truk.toString() +
               "Ritase  : " + ritase + "\n" +
               "Total Volume : " + hitungTotalVolume() + " m3";
    }
}
