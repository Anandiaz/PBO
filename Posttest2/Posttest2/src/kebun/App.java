package kebun;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static ArrayList<Hewan> ListHewan = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        char pilih;
        int Umur,idx;
        String Jenis, Nama, Habitat;
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
                    System.out.println("Silahkan Masukkan Data Hewan yang ingin ditambahkan");
                    System.out.print("Masukkan Jenis Hewan = ");
                    Jenis = scanner.nextLine();
                    System.out.print("Masukkan Nama Hewan = ");
                    Nama = scanner.nextLine();
                    System.out.print("Masukkan Habitat Hewan = ");
                    Habitat = scanner.nextLine();
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

                    HewanBaru = new Hewan(Jenis, Nama, Habitat, Umur);
                    ListHewan.add(HewanBaru);
                    System.out.println("Data Hewan Berhasil ditambahkan");
                    break;

                // Menu Ubah
                case '2':
                    System.out.println("Pilih Data Hewan yang ingin diubah = ");
                    while (true) {
                        try {
                            idx = scanner.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Input Harus Angka");
                            scanner.nextLine();
                        }
                    }
                    scanner.nextLine();
                    System.out.println("Silahkan Masukkan Data Hewan yang baru");
                    System.out.print("Masukkan Jenis Hewan = ");
                    Jenis = scanner.nextLine();
                    System.out.print("Masukkan Nama Hewan = ");
                    Nama = scanner.nextLine();
                    System.out.print("Masukkan Habitat Hewan = ");
                    Habitat = scanner.nextLine();
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

                    HewanBaru = new Hewan(Jenis, Nama, Habitat, Umur);
                    HewanBaru.setJenis(Jenis);
                    HewanBaru.setNama(Nama);
                    HewanBaru.setHabitat(Habitat);
                    HewanBaru.setUmur(Umur);
                    ListHewan.set(idx, HewanBaru);
                    System.out.println("Data Hewan Berhasil ditambahkan");
                    break;

                // Menu Hapus
                case '3':
                    System.out.println("Pilih Data Hewan yang ingin dihapus = ");
                    while (true) {
                        try {
                            idx = scanner.nextInt();
                            break;
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
                        System.out.println("Jenis = "+ ListHewan.get(i).getJenis());
                        System.out.println("Nama = "+ ListHewan.get(i).getNama());
                        System.out.println("Habitat = "+ ListHewan.get(i).getHabitat());
                        System.out.println("Umur = "+ ListHewan.get(i).getUmur());
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
