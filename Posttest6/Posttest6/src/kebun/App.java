package kebun;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class App {
    final static ArrayList<Hewan> ListHewan = new ArrayList<Hewan>();
    public static void main(String[] args) throws Exception {
        char pilih, kelompok;
        int Umur,idx;
        double bobot;
        String makanan, Nama, ras;
        Hewan HewanBaru;
        Scanner scanner = new Scanner(System.in);
        // 'loop' dibawah sebelum while adalah label
        loop:while (true) {
            System.out.println("Selamat datang di aplikasi pendataan hewan di kebun QWERTY");
            System.out.println("1. Tambah Data");
            System.out.println("2. Ubah Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan: ");
            pilih = scanner.next().charAt(0);
            scanner.nextLine();


            switch (pilih) {
                // Menu Tambah
                case '1':
                    System.out.println("Pilih Kelompok Hewan");
                    System.out.println("1. Kucing");
                    System.out.println("2. Beruang");

                    // 'kelompok' dibawah ini adalah label
                    kelompok:while (true) {
                        kelompok = scanner.next().charAt(0);
                        scanner.nextLine();
                        switch (kelompok) {
                            case '1':
                                break kelompok;
                            case '2':
                                break kelompok;
                        
                            default:
                                System.out.println("input antara 1 dan 2");
                                break;
                        }
                    }
                    System.out.println("Silahkan Masukkan Data Hewan yang ingin ditambahkan");
                    System.out.print("Masukkan Nama Hewan = ");
                    Nama = scanner.nextLine();
                    System.out.print("Masukkan makanan Hewan = ");
                    makanan = scanner.nextLine();
                    System.out.print("Masukkan Umur Hewan = ");
                    
                    // error handling angka
                    while (true) {
                        try {
                            Umur = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Input Harus Angka");
                            scanner.nextLine();
                        }
                    }
                    
                    scanner.nextLine();
                    
                    if(kelompok == '1'){
                        System.out.print("Masukkan ras Kucing = ");
                        ras = scanner.nextLine();
                        HewanBaru = new Kucing(Nama, makanan, Umur, ras);
                        ListHewan.add(HewanBaru);
                    }
                    if(kelompok == '2'){
                        System.out.print("Masukkan bobot beruang = ");
                        bobot = scanner.nextDouble();
                        HewanBaru = new Beruang(Nama, makanan, Umur, bobot);
                        ListHewan.add(HewanBaru);
                    }
                    System.out.println("Data Hewan Berhasil ditambahkan");
                    break;

                // Menu Ubah
                case '2':
                    System.out.println("Pilih Kelompok Hewan");
                    System.out.println("1. Kucing");
                    System.out.println("2. Beruang");

                    // 'kelompok' dibawah ini adalah label
                    kelompok:while (true) {
                        kelompok = scanner.next().charAt(0);
                        scanner.nextLine();
                        switch (kelompok) {
                            case '1':
                                break kelompok;
                            case '2':
                                break kelompok;
                        
                            default:
                                System.out.println("input antara 1 dan 2");
                                break;
                        }
                    }

                    System.out.println("Pilih Data Hewan yang ingin diubah = ");
                    while (true) {
                        try {
                            idx = scanner.nextInt();
                            if(ListHewan.size()<=0 || idx == -1){
                                System.out.println("Data masih kosong");
                                idx = -1;
                                break;
                            }
                            if(kelompok == '1' && idx < ListHewan.size() &&ListHewan.get(idx) instanceof Kucing){
                                break;
                            }
                            else if (kelompok == '2' && idx < ListHewan.size() && ListHewan.get(idx) instanceof Beruang) {
                                break;
                            }
                            else{
                                throw new InputMismatchException();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Input Harus Angka dan ada didalam index");
                            System.out.println("Jika ingin kembali ketik -1");
                            scanner.nextLine();
                        }
                    }
                    if(idx == -1){
                        continue;
                    }
                    scanner.nextLine();
                    System.out.println("Silahkan Masukkan Data Hewan yang baru");
                    System.out.print("Masukkan Nama Hewan = ");
                    Nama = scanner.nextLine();
                    System.out.print("Masukkan makanan Hewan = ");
                    makanan = scanner.nextLine();
                    System.out.print("Masukkan Umur Hewan = ");
                    while (true) {
                        try {
                            Umur = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Input Harus Angka");
                            scanner.nextLine();
                        }
                    }
                    scanner.nextLine();
                    
                    if(kelompok == '1'){
                        System.out.print("Masukkan ras Kucing = ");
                        ras = scanner.nextLine();
                        HewanBaru = new Kucing(Nama, makanan, Umur, ras);
                        
                        if(ListHewan.get(idx) instanceof Kucing){
                            Kucing kucing = (Kucing) ListHewan.get(idx);
                            kucing.setNama(Nama);
                            kucing.setMakanan(makanan);
                            kucing.setUmur(Umur);
                            kucing.setRas(ras);
                            ListHewan.set(idx,kucing);
                        }
                    }
                    if(kelompok == '2'){
                        System.out.print("Masukkan bobot beruang = ");
                        bobot = scanner.nextDouble();
                        HewanBaru = new Beruang(Nama, makanan, Umur, bobot);
                        if(ListHewan.get(idx) instanceof Beruang){
                            Beruang beruang= (Beruang) ListHewan.get(idx);
                            beruang.setNama(Nama);
                            beruang.setMakanan(makanan);
                            beruang.setUmur(Umur);
                            beruang.setbobot(bobot);
                            ListHewan.set(idx, beruang);
                        }
                    }
                    System.out.println("Data Hewan Berhasil ditambahkan");
                    break;

                // Menu Hapus
                case '3':
                    System.out.println("Pilih Data Hewan yang ingin dihapus = ");
                    while (true) {
                        try {
                            idx = scanner.nextInt();
                            if(ListHewan.size()<=0){
                                System.out.println("Data masih kosong");
                                idx = -1;
                                break;
                            }
                            else if (idx < ListHewan.size()) {
                                break;
                            }
                            else{
                                throw new InputMismatchException();
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Input Harus Angka");
                            scanner.nextLine();
                        }
                    }
                    ListHewan.remove(idx);
                    break;

                // Menu Lihat
                case '4':
                    System.out.println("-".repeat(10));
                    for(int i = 0; i<ListHewan.size();i++){
                        System.out.println("Data ke-"+(i+1));
                        if (ListHewan.get(i) instanceof Kucing) {
                            Kucing kucing = (Kucing) ListHewan.get(i);
                            kucing.biodata(kucing.getRas());
                        }
                        if (ListHewan.get(i) instanceof Beruang) {
                            Beruang beruang = (Beruang) ListHewan.get(i);
                            beruang.biodata(beruang.getbobot());
                        }
                        System.out.println("-".repeat(10));
                    }
                    break;

                // Keluar
                case '5':
                    System.out.println("Keluar");
                    break loop;
            
                default:
                    System.out.println("Minimal input yg benar");
                    break;
            }
        }
        scanner.close();
    }
}
