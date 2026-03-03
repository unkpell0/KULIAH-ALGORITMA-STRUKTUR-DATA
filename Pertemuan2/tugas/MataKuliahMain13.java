package pertemuan2.tugas;

public class MataKuliahMain13 {
    public static void main(String[] args) {
        // Objek 1: Menggunakan Konstruktor Default 
        MataKuliah13 mk1 = new MataKuliah13();
        mk1.kodeMK = "ALSD_01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        
        // Objek 2: Menggunakan Konstruktor Berparameter 
        MataKuliah13 mk2 = new MataKuliah13("BASDAT_02", "Basis Data", 2, 4);

        System.out.println("--- Informasi Mata Kuliah 1 ---");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(10); // Tes validasi pengurangan jam 

        System.out.println("\n--- Informasi Mata Kuliah 2 ---");
        mk2.tampilInformasi();
        mk2.kurangiJam(2);
        mk2.tampilInformasi();
    }
}
