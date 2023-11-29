package perpustakaan;

class Buku {
    int idBuku;
    String judul;
    String pengarang;
    String noISBN;
    String statusKetersediaan;

    public Buku(int idBuku, String judul, String pengarang, String noISBN, String statusKetersediaan) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.noISBN = noISBN;
        this.statusKetersediaan = statusKetersediaan;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getNoISBN() {
        return noISBN;
    }

    public void setNoISBN(String noISBN) {
        this.noISBN = noISBN;
    }

    public String getStatusKetersediaan() {
        return statusKetersediaan;
    }

    public void setStatusKetersediaan(String statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }
    
}