import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menentukan jumlah array sesuai input (Opsional, lebih dinamis)
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());
        System.out.println("-----------------------------------");

        Dosen13[] arrayOfDosen = new Dosen13[jumlahDosen];

        // Looping FOR untuk input pembuatan array of object (Tugas 1)
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            
            System.out.print("Jenis Kelamin (P/W) : ");
            String jkStr = sc.nextLine();
            // Konversi String ke Boolean. Jika input 'P' atau 'p' maka true (Pria), selain itu false (Wanita)
            Boolean jenisKelamin = jkStr.equalsIgnoreCase("P"); 
            
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("-----------------------------------");

            // Instansiasi object menggunakan constructor
            arrayOfDosen[i] = new Dosen13(kode, nama, jenisKelamin, usia);
        }

        // Looping FOREACH untuk menampilkan data ke layar (Tugas 1)
        System.out.println("\n=== HASIL CETAK DATA DOSEN (FOREACH) ===");
        int counter = 1;
        for (Dosen13 dsn : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + counter);
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            // Menampilkan string sesuai nilai boolean
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita")); 
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("-----------------------------------");
            counter++;
        }

        // --- TESTING METHOD DARI CLASS DataDosen (Tugas 2) ---
        DataDosen13 dd = new DataDosen13();
        
        // Memanggil semua method
        dd.dataSemuaDosen(arrayOfDosen);
        dd.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dd.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dd.infoDosenPalingTua(arrayOfDosen);
        dd.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}
