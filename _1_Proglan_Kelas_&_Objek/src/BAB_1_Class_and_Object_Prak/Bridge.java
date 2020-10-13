package BAB_1_Class_and_Object_Prak;

public class Bridge {
    Books b1 = new Books();
    
    String  []  mainKategori= b1.Kategori;
    String [][] mainBuku    = b1.Bookz;
    String [][] mainPenulis = b1.Penulis;
    int    [][] mainTahun   = b1.Tahun;
    
    public String getKategori(int i){
    return mainKategori[i];
    }
    
    public String getJudulBuku(int i, int j){
    return mainBuku[i][j];
    }
    
    public String getPenulis(int i, int j){
    return mainPenulis[i][j];
    }
    
    public int getTahun(int i, int j){
    return mainTahun[i][j];
    }
}
