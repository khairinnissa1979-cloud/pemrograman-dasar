
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] nim = new String[jumlah];
        String[] nama = new String[jumlah];
        double[] uts = new double[jumlah];
        double[] uas = new double[jumlah];
        double[] akhir = new double[jumlah];
        char[] index = new char[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            nim[i] = input.nextLine();

            System.out.print("Nama: ");
            nama[i] = input.nextLine();

            System.out.print("Nilai UTS: ");
            uts[i] = input.nextDouble();

            System.out.print("Nilai UAS: ");
            uas[i] = input.nextDouble();
            input.nextLine();

            akhir[i] = (uts[i] * 0.5) + (uas[i] * 0.5);

            if (akhir[i] >= 80) {
                index[i] = 'A';
            } else if (akhir[i] >= 70) {
                index[i] = 'B';
            } else if (akhir[i] >= 60) {
                index[i] = 'C';
            } else if (akhir[i] >= 50) {
                index[i] = 'D';
            } else {
                index[i] = 'E';
            }
        }

        System.out.println("\n==============================================================");
        System.out.println("No\tNIM\tNama\t\tUTS\tUAS\tAkhir\tIndex");
        System.out.println("==============================================================");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d\t%s\t%s\t\t%.1f\t%.1f\t%.1f\t%c%n",
                    (i + 1), nim[i], nama[i],
                    uts[i], uas[i], akhir[i], index[i]);
        }

        input.close();
    }
}
