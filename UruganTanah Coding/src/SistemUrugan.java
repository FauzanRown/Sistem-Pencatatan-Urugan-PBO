import java.util.ArrayList;

public class SistemUrugan {
    private ArrayList<Supplier> listSupplier = new ArrayList<>();
    private ArrayList<Transaksi> listTransaksi = new ArrayList<>();

    public void tambahSupplier(Supplier s) {
        listSupplier.add(s);
    }

    public Supplier cariSupplier(String nama) {
        for (Supplier s : listSupplier) {
            if (s.getNamaSupplier().equalsIgnoreCase(nama)) {
                return s;
            }
        }
        return null;
    }

    public void tambahTransaksi(Transaksi t) {
        listTransaksi.add(t);
    }

    public ArrayList<Transaksi> getListTransaksi() {
        return listTransaksi;
    }

    public void tampilkanSemuaTransaksi() {
        if(listTransaksi.isEmpty()){
            System.out.println("Belum ada transaksi!");
            return;
        }
        for (Transaksi t : listTransaksi) {
            t.tampilkan();
            System.out.println("--------------------------");
        }
    }
}
