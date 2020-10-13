package Materi_OOP_Rental_VCD;


public class Transaksi {
   private String keluar;
   private String masuk;
   Peminjam p1;
   DVD d1;
    
    public Transaksi(String keluar , String masuk){
    this.keluar = keluar;
    this.masuk = masuk;
    }
    
    public String getTanggalPinjam(){
    return keluar;
    }
    
    public String getTanggalKembali(){
    return masuk;
    }
    
    public Transaksi(String Nama, String Alamat, String JK){
    p1 = new Peminjam(Nama,Alamat,JK);
    }
    
    public Transaksi(String Judul, String Sutradara, String Genre, String Durasi){
    d1 = new DVD(Judul, Sutradara, Genre, Durasi);
    }
    
    public Peminjam getPeminjam(){
    return p1;
    }
    
    public DVD getDVD(){
    return d1;
    }

    /*public void setPeminjam (String nama ,String Alamat, String JK){
    p1.Nama = nama;
    p1.Alamat = Alamat;
    p1.JK = JK;
    }
    
    public void setDVD(String Judul , String Genre, String Durasi){
    d1.Judul = Judul;
    d1.Genre = Genre;
    d1.Durasi = Durasi;
    }
    */    
    public void showPeminjam(){
        System.out.println("Nama \t\t : " + p1.getNama());
        System.out.println("Alamat \t\t : " + p1.getAlamat());
        System.out.println("Jenis Kelamin \t : " + p1.getJK());
                
    }
    
    public void showDVD(){
        System.out.println("Judul \t : " + d1.getJudul());
        System.out.println("Sutradara \t : " + d1.getSutradara());
        System.out.println("Genre \t : " + d1.getGenre());
        System.out.println("Durasi \t : " + d1.getDurasi());
    }
}
