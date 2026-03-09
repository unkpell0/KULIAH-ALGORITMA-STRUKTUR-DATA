import java.util.Scanner;
public class MatakuliahDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam;

        System.out.print("Masukkan jumlah matakuliah yang ingin didata: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine());

        Matakuliah13[] arrayOfMatakuliah = new Matakuliah13[jumlahMatkul];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------");

            arrayOfMatakuliah[i] = new Matakuliah13(kode, nama, sks, jumlahJam);

            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n=== DATA SELURUH MATAKULIAH ===");

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
