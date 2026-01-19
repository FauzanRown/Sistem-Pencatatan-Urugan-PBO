//import javax.swing.*;
//
//public class FormInputSupplier extends JFrame {
//
//    public FormInputSupplier(SistemUrugan sistem) {
//        setTitle("Input Supplier");
//        setSize(400, 220);
//        setLocationRelativeTo(null);
//        setLayout(null);
//
//        JLabel lNama = new JLabel("Nama Supplier:");
//        JTextField tfNama = new JTextField();
//
//        JButton btnSimpan = new JButton("Tambah");
//        JButton btnSelesai = new JButton("Selesai");
//
//        // POSISI
//        lNama.setBounds(20, 30, 100, 25);
//        tfNama.setBounds(130, 30, 200, 25);
//        btnSimpan.setBounds(80, 80, 100, 30);
//        btnSelesai.setBounds(200, 80, 100, 30);
//
//        add(lNama);
//        add(tfNama);
//        add(btnSimpan);
//        add(btnSelesai);
//
//        btnSimpan.addActionListener(e -> {
//            String nama = tfNama.getText().trim();
//            if (nama.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Nama supplier tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//
//            Supplier supplier = new Supplier(nama);
//            sistem.tambahSupplier(supplier);
//
//            JOptionPane.showMessageDialog(this, "Supplier '" + nama + "' berhasil ditambahkan!");
//            tfNama.setText(""); // Clear field untuk input berikutnya
//            tfNama.requestFocus();
//        });
//
//        btnSelesai.addActionListener(e -> {
//            dispose();
//        });
//
//        setVisible(true);
//    }
//}
