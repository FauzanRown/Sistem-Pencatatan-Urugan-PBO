import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MainGUI extends JFrame {

    private SistemUrugan sistem;

    public MainGUI() {
        sistem = new SistemUrugan(); // penyimpan transaksi

        setTitle("URUGAN.CO");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));

        JLabel judul = new JLabel("MENU UTAMA", SwingConstants.CENTER);
        judul.setFont(new Font("Arial", Font.BOLD, 18));

        JButton btnInput = new JButton("1. Input Transaksi");
        JButton btnLaporan = new JButton("2. Tampil Laporan");
        JButton btnKeluar = new JButton("3. Keluar");

        add(judul);
        add(btnInput);
        add(btnLaporan);
        add(btnKeluar);

        // ACTION
        btnInput.addActionListener(e -> new FormInputTransaksi(sistem));
        btnLaporan.addActionListener(e -> new FormLaporan(sistem));
        btnKeluar.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainGUI();
    }
}
