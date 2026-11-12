import java.util.Scanner;

public class TUGAS_MOD3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        long totalGaji;

        System.out.print("Jumlah Karyawan : ");
        jumlah = Integer.parseInt(input.nextLine());

        String[][] karyawan = new String[jumlah][3];
        long[][] gaji = new long[jumlah][2];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Karyawan ke-" + (i + 1));

            System.out.print("Nama : ");
            karyawan[i][0] = input.nextLine().toUpperCase();

            System.out.print("Jabatan : ");
            karyawan[i][1] = input.nextLine().toUpperCase();

            System.out.print("Gaji Pokok : ");
            gaji[i][0] = Long.parseLong(input.nextLine());

            System.out.print("Tunjangan : ");
            gaji[i][1] = Long.parseLong(input.nextLine());
        }

        System.out.println("\n========== DATA GAJI KARYAWAN ==========");
        System.out.printf("%-5s %-15s %-15s %-18s %-18s%n",
                "NO", "NAMA", "JABATAN", "GAPOK", "TUNJANGAN");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d %-15s %-15s %,18d %,18d%n",
                    (i + 1),
                    karyawan[i][0],
                    karyawan[i][1],
                    gaji[i][0],
                    gaji[i][1]);
        }

        System.out.println("\n========== TOTAL GAJI ==========");

        for (int i = 0; i < jumlah; i++) {
            totalGaji = gaji[i][0] + gaji[i][1];

            System.out.printf("%s : Rp %,d%n",
                    karyawan[i][0], totalGaji);
        }

        input.close();
    }
}
