public class Truk {
    private String noPolisi;
    private Supplier supplier;
    private Dimensi dimensi;

    public Truk(String noPolisi, Supplier supplier, Dimensi dimensi) {
        this.noPolisi = noPolisi;
        this.supplier = supplier;
        this.dimensi = dimensi;
    }

    public double getVolume() {
        return dimensi.hitungVolume();
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void tampilkan() {
        System.out.println("No Polisi : " + noPolisi);
        supplier.tampilkan();
        dimensi.tampilkan();
    }

    @Override
    public String toString() {
        return "No Polisi : " + noPolisi + "\n" +
               "Supplier : " + supplier.getNamaSupplier() + "\n" +
               dimensi.toString();
    }
}
