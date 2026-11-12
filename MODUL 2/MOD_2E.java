import javax.swing.JOptionPane;
public class MOD_2E {
    public static void main(String[] args) {
        String panjang, lebar;
        int luas;

        panjang = JOptionPane.showInputDialog("Masukan Nilai Panjang");
        int pj = Integer.parseInt(panjang);
        lebar = JOptionPane.showInputDialog("Masukan Nilai Lebar");
        int lb = Integer.parseInt(lebar);

        luas = pj * lb;
        JOptionPane.showMessageDialog(null, "Luas Persegi Panjang = " + luas);
    }
}