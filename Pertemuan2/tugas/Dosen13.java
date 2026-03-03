package pertemuan2.tugas;

public class Dosen13 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    // Konstruktor Default 
    public Dosen13() {
    }

    // Konstruktor Berparameter 
    public Dosen13(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif")); 
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("---------------------------");
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status; 
        System.out.println("Status aktif " + nama + " telah diubah menjadi: " + (status ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung; 
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang; 
        System.out.println("Bidang keahlian " + nama + " telah diubah menjadi: " + bidang);
    }
}
