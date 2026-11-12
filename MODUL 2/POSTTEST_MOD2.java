import java.util.Scanner;

public class POSTTEST_MOD2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim, prodi, fakultas, universitas;

        System.out.println("=== IDENTITAS MAHASISWA ===");

        System.out.print("Nama Lengkap : ");
        nama = input.nextLine();

        System.out.print("NIM : ");
        nim = input.nextLine();

        System.out.print("Program Studi : ");
        prodi = input.nextLine();

        System.out.print("Fakultas : ");
        fakultas = input.nextLine();

        System.out.print("Universitas : ");
        universitas = input.nextLine();

        System.out.println("\n=== HASIL IDENTITAS ===");
        System.out.println("Nama Lengkap : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Universitas : " + universitas);

        input.close();
    }
}