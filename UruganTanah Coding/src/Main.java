//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        new MainGUI();
//        Scanner input = new Scanner(System.in);
//        SistemUrugan sistem = new SistemUrugan();
//
//        int pilih;
//
//        do {
//            System.out.println("\n=== SISTEM URUGAN TANAH ===");
//            System.out.println("1. Input Transaksi");
//            System.out.println("2. Tampilkan Laporan");
//            System.out.println("3. Keluar");
//            System.out.print("Pilih: ");
//            pilih = input.nextInt();
//
//            switch (pilih) {
//
//                case 1:
//                    input.nextLine(); // flush newline
//
//                    // ===== SUPPLIER =====
//                    System.out.print("Nama Supplier: ");
//                    String namaSupplier = input.nextLine();
//
//                    Supplier supplier = sistem.cariSupplier(namaSupplier);
//                    if (supplier == null) {
//                        supplier = new Supplier(namaSupplier);
//                        sistem.tambahSupplier(supplier);
//                        System.out.println("Supplier baru ditambahkan.");
//                    }
//
//                    // ===== TRUK =====
//                    System.out.print("No Polisi: ");
//                    String noPol = input.nextLine();
//
//                    // ===== DIMENSI =====
//                    System.out.print("Panjang (m): ");
//                    double p = input.nextDouble();
//                    System.out.print("Lebar (m): ");
//                    double l = input.nextDouble();
//                    System.out.print("Tinggi (m): ");
//                    double t = input.nextDouble();
//
//                    Dimensi dimensi = new Dimensi(p, l, t);
//                    Truk truk = new Truk(noPol, supplier, dimensi);
//
//                    // ===== TRANSAKSI =====
//                    System.out.print("Ritase: ");
//                    int rit = input.nextInt();
//                    input.nextLine();
//
//                    System.out.print("Tanggal (dd-mm-yyyy): ");
//                    String tanggal = input.nextLine();
//
//                    Transaksi transaksi = new Transaksi(truk, rit, tanggal);
//                    sistem.tambahTransaksi(transaksi);
//
//                    System.out.println(">>> Transaksi berhasil disimpan!");
//                    break;
//
//                case 2:
//                    System.out.println("\n=== LAPORAN TRANSAKSI ===");
//                    sistem.tampilkanSemuaTransaksi();
//                    break;
//
//                case 3:
//                    System.out.println("Keluar dari sistem.");
//                    break;
//
//                default:
//                    System.out.println("Pilihan tidak valid.");
//            }
//
//        } while (pilih != 3);
//    }
//}
