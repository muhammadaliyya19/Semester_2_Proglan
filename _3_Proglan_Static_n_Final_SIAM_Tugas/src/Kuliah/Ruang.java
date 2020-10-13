package Kuliah;

public class Ruang {
    
    private static int JumlahRuang = 0;
    private static String Nama [] = {"A 2.13" , "A 2.14" , 
                                     "B 1.4" , 
                                     "E 1.1" , "E 1.2" , "E 2.5" , "E 2.6", 
                                     "F 2.11" , "F 2.12"};
    private static int Kapasitas [] = {30,40,35,40,30,45,40,30,25};
    public String Ruang;
    private int Capacity;
    
    public Ruang(){
    JumlahRuang++;
    }
    
    public Ruang(int pilihan){
    this.Ruang = Nama[pilihan];
    Capacity = Kapasitas[pilihan];
    JumlahRuang++;
    }
    
    public String getRuang(){
    return Ruang;
    }
    
    
}
