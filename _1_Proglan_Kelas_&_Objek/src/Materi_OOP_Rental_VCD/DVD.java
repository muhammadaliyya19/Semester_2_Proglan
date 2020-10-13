package Materi_OOP_Rental_VCD;

public class DVD {
    private String Judul;
    private String Genre;
    private String Durasi;
    private String Sutradara;
    
    public DVD(String Judul, String Sutradara, String Genre, String Durasi){
    this.Judul = Judul;
    this.Sutradara = Sutradara;
    this.Genre = Genre;
    this.Durasi = Durasi;
    }
    
    String getJudul(){
    return Judul;
    }
    String getSutradara(){
    return Sutradara;
    }
    String getGenre(){
    return Genre;
    }
    String getDurasi(){
    return Durasi;
    }
    
    
}
