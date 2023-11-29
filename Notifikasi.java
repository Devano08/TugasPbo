package perpustakaan;


class Notifikasi {
    int idNotifikasi;
    String pesan;
    String waktuNotifikasi;
    Buku buku;

    public Notifikasi(int idNotifikasi, String pesan, String waktuNotifikasi, Buku buku) {
        this.idNotifikasi = idNotifikasi;
        this.pesan = pesan;
        this.waktuNotifikasi = waktuNotifikasi;
        this.buku = buku;
    }

    public int getIdNotifikasi() {
        return idNotifikasi;
    }

    public void setIdNotifikasi(int idNotifikasi) {
        this.idNotifikasi = idNotifikasi;
    }

    public void kirimNotifikasi() {
        System.out.println("Notifikasi dikirim dengan batas waktu: " + waktuNotifikasi + ", Info: " + pesan);
}
    
    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public String getWaktuNotifikasi() {
        return waktuNotifikasi;
    }

    public void setWaktuNotifikasi(String waktuNotifikasi) {
        this.waktuNotifikasi = waktuNotifikasi;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    
}