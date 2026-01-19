public class Supplier {
    private String namaSupplier;

    public Supplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void tampilkan() {
        System.out.println("Supplier : " + namaSupplier);
    }
}
