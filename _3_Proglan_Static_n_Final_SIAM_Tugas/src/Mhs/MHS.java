package Mhs;
import Kuliah.MatKul;
import Kuliah.Ruang;

public class MHS {
    public MatKul Mat1;
    public Ruang Rug1;
    int CountMK = 0;
    int CountSKS = 0 ;
    
    private static int JumlahMHS = 0;
    private String Nama;
    private String NIM;
    private String JK;
    public int ke;
    public MHS(){
    JumlahMHS++;
    }
    
    public MHS(String Nama , String NIM , String JK){
    this.Nama = Nama;
    this.NIM = NIM;
    this.JK = JK;
    JumlahMHS++;
    }
    
   
    public void setNama(String Nama){
    this.Nama = Nama;
    }
    
    public void setNIM(String NIM){
    this.NIM = NIM;
    }
    
    public void setJK(String JK){
    this.JK = JK;
    }
    
    public String getNama(){
    return Nama;
    }
    
    public String getNIM(){
    return NIM;
    }
    
    public void getJK(String JK){
    this.JK = JK;
    }
    
    public void Perkuliahan(int ke, int mat , int Gedung ){
        Mat1 = new MatKul(ke , mat, Gedung);
        CountMK++;
        CountSKS += Mat1.SKS[mat];
    }
    public int getJumKuliah(){
    return CountMK;
    }
    
    public int getJumSKS(){
    return CountSKS;
    }
    
    public int getJumlah(){
    return JumlahMHS;
    }
    
    public void showSelf(){
        System.out.println("Nama \t : " + Nama);
        System.out.println("NIM \t : " + NIM);
        System.out.println("JK \t : " + JK);
        System.out.println("========================================");
        System.out.println("\tMengambil Mata Kuliah\t");
        System.out.println("========================================");
    }
    public void showKuliah(){
    System.out.println(Mat1.getMatkul() + "\n"+
                           "Jumlah SKS : " + Mat1.getSKS() + "\n"+
                           "Di ruang : " + Mat1.Rug1.getRuang()+ "\n" +
                           "----------  --------------------  ----------");
    }
    
}
