import javax.swing.*;

public class FormInputTransaksi extends JFrame {

    public FormInputTransaksi(SistemUrugan sistem) {
        setTitle("Input Transaksi");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lNoPol = new JLabel("No Polisi:");
        JTextField tfNoPol = new JTextField();

        JLabel lSupplier = new JLabel("Supplier:");
        JTextField tfSupplier = new JTextField();

        JLabel lP = new JLabel("Panjang:");
        JTextField tfP = new JTextField();

        JLabel lL = new JLabel("Lebar:");
        JTextField tfL = new JTextField();

        JLabel lT = new JLabel("Tinggi:");
        JTextField tfT = new JTextField();

        JLabel lRitase = new JLabel("Ritase:");
        JTextField tfRitase = new JTextField();

        JButton btnSimpan = new JButton("Simpan");

        // POSISI
        lNoPol.setBounds(20, 20, 100, 25);
        tfNoPol.setBounds(130, 20, 200, 25);

        lSupplier.setBounds(20, 55, 100, 25);
        tfSupplier.setBounds(130, 55, 200, 25);

        lP.setBounds(20, 90, 100, 25);
        tfP.setBounds(130, 90, 200, 25);

        lL.setBounds(20, 125, 100, 25);
        tfL.setBounds(130, 125, 200, 25);

        lT.setBounds(20, 160, 100, 25);
        tfT.setBounds(130, 160, 200, 25);

        lRitase.setBounds(20, 195, 100, 25);
        tfRitase.setBounds(130, 195, 200, 25);

        btnSimpan.setBounds(130, 240, 100, 30);

        add(lNoPol); add(tfNoPol);
        add(lSupplier); add(tfSupplier);
        add(lP); add(tfP);
        add(lL); add(tfL);
        add(lT); add(tfT);
        add(lRitase); add(tfRitase);
        add(btnSimpan);

        btnSimpan.addActionListener(e -> {
            try {
                String noPol = tfNoPol.getText();
                String namaSupplier = tfSupplier.getText();
                double p = Double.parseDouble(tfP.getText());
                double l = Double.parseDouble(tfL.getText());
                double t = Double.parseDouble(tfT.getText());
                int ritase = Integer.parseInt(tfRitase.getText());

                // Cari supplier berdasarkan nama
                Supplier supplier = sistem.cariSupplier(namaSupplier);
                
                // Jika supplier tidak ada, tanya apakah ingin buat baru
                if (supplier == null) {
                    int result = JOptionPane.showConfirmDialog(this, 
                        "Supplier \"" + namaSupplier + "\" tidak ditemukan.\nApakah ingin membuat supplier baru?", 
                        "Supplier Baru", 
                        JOptionPane.YES_NO_OPTION);
                    
                    if (result == JOptionPane.YES_OPTION) {
                        // Buat supplier baru
                        supplier = new Supplier(namaSupplier);
                        sistem.tambahSupplier(supplier);
                    } else {
                        return;
                    }
                }

                // Buat dimensi dan truk
                Dimensi dimensi = new Dimensi(p, l, t);
                Truk truk = new Truk(noPol, supplier, dimensi);

                // Buat dan tambah transaksi
                Transaksi transaksi = new Transaksi(truk, ritase, java.time.LocalDate.now().toString());
                sistem.tambahTransaksi(transaksi);

                JOptionPane.showMessageDialog(this, "Transaksi berhasil disimpan!");
                dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Input tidak valid! Periksa kembali.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setVisible(true);
    }
}
