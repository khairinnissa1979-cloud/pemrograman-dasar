import java.util.Scanner;

public class POST_TEST_MOD3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        double total = 0;

        System.out.print("Jumlah Mahasiswa : ");
        jumlah = Integer.parseInt(input.nextLine());

        String[][] mahasiswa = new String[jumlah][2];
        double[][] nilai = new double[jumlah][4];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM : ");
            mahasiswa[i][0] = input.nextLine();

            System.out.print("Nama : ");
            mahasiswa[i][1] = input.nextLine();

            System.out.print("Nilai Tugas : ");
            nilai[i][0] = Double.parseDouble(input.nextLine());

            System.out.print("Nilai UTS : ");
            nilai[i][1] = Double.parseDouble(input.nextLine());

            System.out.print("Nilai UAS : ");
            nilai[i][2] = Double.parseDouble(input.nextLine());

            nilai[i][3] = (nilai[i][0] * 60
                         + nilai[i][1] * 20
                         + nilai[i][2] * 20) / 100;

            total += nilai[i][3];
        }

        System.out.println("\n===== DATA NILAI MAHASISWA =====");
        System.out.printf("%-5s %-15s %-20s %-10s %-10s %-10s %-10s%n",
                "No", "NIM", "NAMA", "TUGAS", "UTS", "UAS", "AKHIR");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-5d %-15s %-20s %-10.2f %-10.2f %-10.2f %-10.2f%n",
                    (i + 1),
                    mahasiswa[i][0],
                    mahasiswa[i][1],
                    nilai[i][0],
                    nilai[i][1],
                    nilai[i][2],
                    nilai[i][3]);
        }

        double rataRata = total / jumlah;

        System.out.printf("\nRata-rata Nilai Akhir : %.2f%n", rataRata);

        input.close();
    }
}
