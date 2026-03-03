package pertemuan2.tugas;

public class DosenMain13 {
    public static void main(String[] args) {
        // Objek 1 
        Dosen13 dsn1 = new Dosen13();
        dsn1.idDosen = "DSN01";
        dsn1.nama = "Dr. Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Artificial Intelligence";

        // Objek 2 
        Dosen13 dsn2 = new Dosen13("DSN02", "Siti Aminah, M.T.", false, 2020, "Web Development");

        System.out.println("--- Data Dosen 1 ---");
        dsn1.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2026) + " tahun"); 

        System.out.println("\n--- Data Dosen 2 ---");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Mobile Development");
        dsn2.tampilInformasi();
    }
}
