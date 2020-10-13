package Materi_OOP_Rental_VCD;

public class Peminjam {
   private  String Nama;
   private  String Alamat;
   private  String JK;
    
    public Peminjam(String Nama, String Alamat, String JK){
    this.Nama = Nama;
    this.Alamat = Alamat;
    this.JK = JK;
    }
    
    String getNama(){
    return Nama;
    }
    
    String getAlamat(){
    return Alamat;
    }
    
    String getJK(){
    return JK;
    }
}
