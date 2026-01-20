public class Dimensi {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Dimensi(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public void tampilkan() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("Tinggi  : " + tinggi);
        System.out.println("Volume  : " + hitungVolume() + " m3");
    }

    @Override
    public String toString() {
        return "Panjang : " + panjang + "\n" +
               "Lebar   : " + lebar + "\n" +
               "Tinggi  : " + tinggi + "\n" +
               "Volume  : " + hitungVolume() + " m3\n";
    }
}
