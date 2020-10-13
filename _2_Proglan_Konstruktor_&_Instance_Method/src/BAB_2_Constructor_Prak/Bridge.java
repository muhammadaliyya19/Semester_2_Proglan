package BAB_2_Constructor_Prak;

public class Bridge {
    Books b1;
    public Bridge(){
    
    }
    public Bridge(String [][] Buku , String [][] Penulis, String [] Kategori, int [][] Tahun){
    b1 = new Books(Buku, Penulis, Kategori, Tahun);
    }
}
