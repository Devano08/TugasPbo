package perpustakaan;

class TransaksiPeminjaman {
    int idTransaksi;
    int noAnggota;
    String noISBN;
    String tanggalPeminjaman;
    String tenggatWaktu;

    public TransaksiPeminjaman(int idTransaksi, int noAnggota, String noISBN, String tanggalPeminjaman, String tenggatWaktu) {
        this.idTransaksi = idTransaksi;
        this.noAnggota = noAnggota;
        this.noISBN = noISBN;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.tenggatWaktu = tenggatWaktu;
    }

    public void catatanPeminjaman() {
        System.out.println("Catatan Peminjaman: Transaksi " + idTransaksi + ", Anggota " + noAnggota + ", Buku ISBN " + noISBN + ", Tanggal Peminjaman " + tanggalPeminjaman + ", Tenggat Waktu " + tenggatWaktu);
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getNoAnggota() {
        return noAnggota;
    }

    public void setNoAnggota(int noAnggota) {
        this.noAnggota = noAnggota;
    }

    public String getNoISBN() {
        return noISBN;
    }

    public void setNoISBN(String noISBN) {
        this.noISBN = noISBN;
    }

    public String getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(String tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public String getTenggatWaktu() {
        return tenggatWaktu;
    }

    public void setTenggatWaktu(String tenggatWaktu) {
        this.tenggatWaktu = tenggatWaktu;
    }
    
}