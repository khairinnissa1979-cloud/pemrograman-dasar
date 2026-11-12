
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] hargaTiket = {
            {40000, 60000},
            {20000, 40000}
        };

        System.out.print("Jumlah Pembeli: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] nama = new String[jumlah];
        String[] jurusan = new String[jumlah];
        String[] kelas = new String[jumlah];
        int[] tiket = new int[jumlah];
        int[] harga = new int[jumlah];
        int[] bayar = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Pembeli ke-" + (i + 1));

            System.out.print("Nama: ");
            nama[i] = input.nextLine();

            System.out.print("Jurusan (Bandung/Jakarta): ");
            jurusan[i] = input.nextLine();

            System.out.print("Kelas (Bisnis/Ekonomi): ");
            kelas[i] = input.nextLine();

            System.out.print("Jumlah Tiket: ");
            tiket[i] = input.nextInt();
            input.nextLine();

            int baris = kelas[i].equalsIgnoreCase("Bisnis") ? 0 : 1;
            int kolom = jurusan[i].equalsIgnoreCase("Bandung") ? 0 : 1;

            harga[i] = hargaTiket[baris][kolom];
            bayar[i] = harga[i] * tiket[i];
        }

        System.out.println("\n==============================================================");
        System.out.println("No\tNama\tJurusan\t\tKelas\tTiket\tHarga\tBayar");
        System.out.println("==============================================================");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d\t%s\t%s\t%s\t%d\t%d\t%d%n",
                    i + 1, nama[i], jurusan[i],
                    kelas[i], tiket[i], harga[i], bayar[i]);
        }

        input.close();
    }
}
