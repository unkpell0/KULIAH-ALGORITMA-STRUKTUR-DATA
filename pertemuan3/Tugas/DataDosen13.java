public class DataDosen13 {
    
    // a. Menampilkan data semua dosen
    public void dataSemuaDosen(Dosen13[] arrayOfDosen) {
        System.out.println("\n=== DATA SEMUA DOSEN ===");
        int i = 1;
        for (Dosen13 dsn : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + i);
            System.out.println("Kode          : " + dsn.kode);
            System.out.println("Nama          : " + dsn.nama);
            System.out.println("Jenis Kelamin : " + (dsn.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + dsn.usia);
            System.out.println("-----------------------------------");
            i++;
        }
    }

    // b. Menampilkan jumlah dosen per jenis kelamin
    public void jumlahDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen13 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\n=== JUMLAH DOSEN PER JENIS KELAMIN ===");
        System.out.println("Pria   : " + pria);
        System.out.println("Wanita : " + wanita);
    }

    // c. Menampilkan rata-rata usia dosen per jenis kelamin
    public void rerataUsiaDosenPerJenisKelamin(Dosen13[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen13 dsn : arrayOfDosen) {
            if (dsn.jenisKelamin) {
                totalUsiaPria += dsn.usia;
                countPria++;
            } else {
                totalUsiaWanita += dsn.usia;
                countWanita++;
            }
        }

        System.out.println("\n=== RATA-RATA USIA DOSEN PER JENIS KELAMIN ===");
        if (countPria > 0) {
            System.out.println("Rata-rata usia Dosen Pria   : " + ((double) totalUsiaPria / countPria));
        } else {
            System.out.println("Rata-rata usia Dosen Pria   : Tidak ada data");
        }

        if (countWanita > 0) {
            System.out.println("Rata-rata usia Dosen Wanita : " + ((double) totalUsiaWanita / countWanita));
        } else {
            System.out.println("Rata-rata usia Dosen Wanita : Tidak ada data");
        }
    }

    // d. Menampilkan info dosen paling tua
    public void infoDosenPalingTua(Dosen13[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen13 tertua = arrayOfDosen[0];
        for (Dosen13 dsn : arrayOfDosen) {
            if (dsn.usia > tertua.usia) {
                tertua = dsn;
            }
        }
        System.out.println("\n=== INFO DOSEN PALING TUA ===");
        System.out.println("Kode          : " + tertua.kode);
        System.out.println("Nama          : " + tertua.nama);
        System.out.println("Jenis Kelamin : " + (tertua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + tertua.usia);
    }

    // e. Menampilkan info dosen paling muda
    public void infoDosenPalingMuda(Dosen13[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) return;
        Dosen13 termuda = arrayOfDosen[0];
        for (Dosen13 dsn : arrayOfDosen) {
            if (dsn.usia < termuda.usia) {
                termuda = dsn;
            }
        }
        System.out.println("\n=== INFO DOSEN PALING MUDA ===");
        System.out.println("Kode          : " + termuda.kode);
        System.out.println("Nama          : " + termuda.nama);
        System.out.println("Jenis Kelamin : " + (termuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + termuda.usia);
    }
}