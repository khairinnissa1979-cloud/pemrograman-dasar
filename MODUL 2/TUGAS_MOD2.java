import javax.swing.JOptionPane;

public class TUGAS_MOD2 {
    public static void main(String[] args) {

        String nama;
        double mp1, mp2, mp3, mp4, mp5, mp6;
        double uts, uas, nilaiAkhir;

        nama = JOptionPane.showInputDialog("Nama Mahasiswa:");

        mp1 = Double.parseDouble(JOptionPane.showInputDialog("Nilai MP 1:"));
        mp2 = Double.parseDouble(JOptionPane.showInputDialog("Nilai MP 2:"));
        mp3 = Double.parseDouble(JOptionPane.showInputDialog("Nilai MP 3:"));
        mp4 = Double.parseDouble(JOptionPane.showInputDialog("Nilai MP 4:"));
        mp5 = Double.parseDouble(JOptionPane.showInputDialog("Nilai MP 5:"));
        mp6 = Double.parseDouble(JOptionPane.showInputDialog("Nilai MP 6:"));

        uts = Double.parseDouble(JOptionPane.showInputDialog("Nilai UTS:"));
        uas = Double.parseDouble(JOptionPane.showInputDialog("Nilai UAS:"));

        nilaiAkhir = (mp1 + mp2 + mp3 + mp4 + mp5 + mp6
                    + (2 * uts) + (2 * uas)) / 10;

        JOptionPane.showMessageDialog(null,
            "Nama Mahasiswa: " + nama
            + "\nNilai Akhir: " + nilaiAkhir,
            "Hasil Perhitungan",
            JOptionPane.INFORMATION_MESSAGE);
    }
}