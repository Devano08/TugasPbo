package perpustakaan;

import java.util.ArrayList;
import java.util.List;

class AnggotaPerpustakaan {
    String nama;
    int noAnggota;
    String alamat;
    List<String> riwayatPeminjaman;
    List<Notifikasi> notifikasiList;

    public AnggotaPerpustakaan(String nama, int noAnggota, String alamat) {
        this.nama = nama;
        this.noAnggota = noAnggota;
        this.alamat = alamat;
        this.riwayatPeminjaman = new ArrayList<>();
        this.notifikasiList = new ArrayList<>();
    }

    public void tampilkanNotifikasi() {
        if (notifikasiList.isEmpty()) {
            System.out.println("Tidak ada notifikasi untuk anggota " + noAnggota);
        } else {
            System.out.println("Daftar Notifikasi untuk Anggota " + noAnggota + ":");
            for (Notifikasi notifikasi : notifikasiList) {
                System.out.println("ID Notifikasi: " + notifikasi.idNotifikasi +
                                   ", Pesan: " + notifikasi.pesan +
                                   ", Waktu: " + notifikasi.waktuNotifikasi);
            }
        }
    }
    
    public void pinjamBuku(String judulBuku) {
        System.out.println("Anggota " + noAnggota + " meminjam buku dengan judul: " + judulBuku);
    }
    
    public void terimaNotif(Notifikasi notifikasi) {
        notifikasiList.add(notifikasi);
        System.out.println("Anggota " + noAnggota + " menerima notifikasi: " + notifikasi.pesan);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNoAnggota() {
        return noAnggota;
    }

    public void setNoAnggota(int noAnggota) {
        this.noAnggota = noAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public List<String> getRiwayatPeminjaman() {
        return riwayatPeminjaman;
    }

    public void setRiwayatPeminjaman(List<String> riwayatPeminjaman) {
        this.riwayatPeminjaman = riwayatPeminjaman;
    }

    public List<Notifikasi> getNotifikasiList() {
        return notifikasiList;
    }

    public void setNotifikasiList(List<Notifikasi> notifikasiList) {
        this.notifikasiList = notifikasiList;
    }
    
}