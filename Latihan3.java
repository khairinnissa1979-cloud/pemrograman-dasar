
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kodeBarang = {"A01", "B02", "C02"};
        String[] namaBarang = {"Hardisk", "Monitor", "Mouse"};
        int[] hargaBarang = {700000, 800000, 50000};

        System.out.print("Jumlah Transaksi: ");
        int jumlah = input.nextInt();
        input.nextLine();

        String[] pembeli = new String[jumlah];
        String[] kode = new String[jumlah];
        String[] barang = new String[jumlah];
        int[] banyak = new int[jumlah];
        int[] harga = new int[jumlah];
        int[] bayar = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nTransaksi ke-" + (i + 1));

            System.out.print("Nama Pembeli: ");
            pembeli[i] = input.nextLine();

            System.out.print("Kode Barang: ");
            kode[i] = input.nextLine();

            System.out.print("Jumlah Barang: ");
            banyak[i] = input.nextInt();
            input.nextLine();

            int posisi = -1;

            for (int j = 0; j < kodeBarang.length; j++) {
                if (kode[i].equalsIgnoreCase(kodeBarang[j])) {
                    posisi = j;
                    break;
                }
            }

            if (posisi != -1) {
                barang[i] = namaBarang[posisi];
                harga[i] = hargaBarang[posisi];
                bayar[i] = harga[i] * banyak[i];
            } else {
                barang[i] = "Tidak ditemukan";
                harga[i] = 0;
                bayar[i] = 0;
                System.out.println("Kode barang tidak tersedia!");
            }
        }

        System.out.println("\n==============================================================");
        System.out.println("No\tPembeli\tKode\tBarang\t\tJumlah\tHarga\tBayar");
        System.out.println("==============================================================");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d\t%s\t%s\t%s\t%d\t%d\t%d%n",
                    i + 1, pembeli[i], kode[i],
                    barang[i], banyak[i], harga[i], bayar[i]);
        }

        input.close();
    }
}
