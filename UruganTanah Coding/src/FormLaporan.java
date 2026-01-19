import javax.swing.*;

public class FormLaporan extends JFrame {

    public FormLaporan(SistemUrugan sistem) {
        setTitle("Laporan Transaksi");
        setSize(500, 400);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();
        area.setEditable(false);

        if (sistem.getListTransaksi().isEmpty()) {
            area.setText("Belum ada transaksi!");
        } else {
            for (Transaksi t : sistem.getListTransaksi()) {
                area.append(t.toString());
                area.append("\n---------------------\n");
            }
        }

        add(new JScrollPane(area));
        setVisible(true);
    }
}
