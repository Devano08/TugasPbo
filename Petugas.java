package perpustakaan;

import java.time.LocalDateTime;
import java.util.List;

class Petugas {
   private int idPetugas;
   private String namaPetugas;
   private String username;
   private String password;
   public List<AnggotaPerpustakaan> daftarAnggota; // Daftar anggota perpustakaan

   
    public Petugas(int idPetugas, String namaPetugas, String username, String password) {
        this.idPetugas = idPetugas;
        this.namaPetugas = namaPetugas;
        this.username = username;
        this.password = password;
    }


    public void kirimNotifikasi(AnggotaPerpustakaan anggota, int idNotif, int noAnggota, String pesan) {
        // Implementasi logika kirimNotifikasi...
        Notifikasi notifikasi = new Notifikasi(idNotif, pesan, LocalDateTime.now().toString(), null); // Tambahkan waktu notifikasi menggunakan LocalDateTime
        anggota.terimaNotif(notifikasi);
    }
    
    public void aturAnggota() {
        System.out.println("Petugas " + namaPetugas + " sedang mengatur anggota.");
    }

    public void aturBuku() {
        System.out.println("Petugas " + namaPetugas + " sedang mengatur buku.");
    }
    
    public void lihatAnggota() {
        System.out.println("Anggota " + namaPetugas );
    }
    
    public void daftarAnggota() {
        System.out.println("Anggota " + daftarAnggota );
    }

    public int getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(int idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}