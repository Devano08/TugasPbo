package perpustakaan;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Petugas petugas = new Petugas(1, "Josh", "J", "k");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Tambah Anggota");
            System.out.println("4. Lihat Anggota");
            System.out.println("5. Pinjam Buku");
            System.out.println("6. Tampilkan Notifikasi");
            System.out.println("7. Kirim Notifikasi");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu (1-8): ");

            int menu = scanner.nextInt();
            scanner.nextLine(); 



            switch (menu) {
                case 1:
                    // Tambah Buku
                    System.out.print("Masukkan judul buku: ");
                    String judulBuku = scanner.nextLine();
                    break;
                case 2:
                    // Hapus Buku
                    System.out.print("Masukkan judul buku yang akan dihapus: ");
                    String judulHapus = scanner.nextLine();
                    break;
                case 3:
                    // Tambah Anggota
                    System.out.print("Masukkan nama anggota: ");
                    String namaAnggota = scanner.nextLine();
                    System.out.print("Masukkan nomor anggota: ");
                    int nomorAnggota = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan alamat anggota: ");
                    String alamatAnggota = scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Informasi Anggota:");
                    petugas.lihatAnggota();
                    break;

                case 5:
                  System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                    String judulPinjam = scanner.nextLine();

                    System.out.println("Pilih anggota untuk melakukan peminjaman:");
                    for (int i = 0; i < petugas.daftarAnggota.size(); i++) {
                        System.out.println((i + 1) + ". " + petugas.daftarAnggota.get(i).getNama());
                        }

                    System.out.print("Pilih nomor anggota: ");
                    int nomorAnggotaPinjam = scanner.nextInt();
                    scanner.nextLine();

                    if (nomorAnggotaPinjam >= 1 && nomorAnggotaPinjam <= petugas.daftarAnggota.size()) {
                        AnggotaPerpustakaan anggota = petugas.daftarAnggota.get(nomorAnggotaPinjam - 1);
                        anggota.pinjamBuku(judulPinjam);
                    } else {
                        System.out.println("Nomor anggota tidak valid.");
                    }
                    break;

                case 6:
                     System.out.println("Pilih anggota untuk menampilkan notifikasi:");
                    for (int i = 0; i < petugas.daftarAnggota.size(); i++) {
                        System.out.println((i + 1) + ". " + petugas.daftarAnggota.get(i).getNama());
                    } 
                   System.out.print("Pilih nomor anggota: ");
                    int nomorAnggotaNotif = scanner.nextInt();
                    scanner.nextLine();

                    if (nomorAnggotaNotif >= 1 && nomorAnggotaNotif <= petugas.daftarAnggota.size()) {
                        AnggotaPerpustakaan anggotaNotif = petugas.daftarAnggota.get(nomorAnggotaNotif - 1);
                        anggotaNotif.tampilkanNotifikasi();
                    } else {
                        System.out.println("Nomor anggota tidak valid.");
                    }
                    break;

                case 7:
                    System.out.print("Masukkan ID Notifikasi: ");
                    int idNotif = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Masukkan Pesan Notifikasi: ");
                    String pesanNotif = scanner.nextLine();

                    System.out.println("Pilih anggota untuk mengirim notifikasi:");
                    for (int i = 0; i < petugas.daftarAnggota.size(); i++) {
                        System.out.println((i + 1) + ". " + petugas.daftarAnggota.get(i).getNama());
                    }
                    System.out.print("Pilih nomor anggota: ");
                    int nomorAnggotaKirimNotif = scanner.nextInt();
                    scanner.nextLine(); 

                    if (nomorAnggotaKirimNotif >= 1 && nomorAnggotaKirimNotif <= petugas.daftarAnggota.size()) {
                        AnggotaPerpustakaan anggotaKirimNotif = petugas.daftarAnggota.get(nomorAnggotaKirimNotif - 1);
                        LocalDate timeStamp = LocalDate.now();
                        petugas.kirimNotifikasi(anggotaKirimNotif, idNotif, anggotaKirimNotif.getNoAnggota(), pesanNotif);
                        System.out.println("Notifikasi berhasil dikirim.");
                    } else {
                        System.out.println("Nomor anggota tidak valid.");
                    }
                    break;

                case 8:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Pilih menu lain.");
                    break;
            }
        }
    }
}
