package Ticketing;

public class Pemesan {
    private String Nama;
    private String NIK;
    
    public Pemesan(){
    
    }
    
    public Pemesan(String Nama, String NIK){
        this.Nama = Nama;
        this.NIK  = NIK;
    }
    
    public String getNama(){
    return Nama;
    }
    
    public String getNIK(){
    return NIK;
    }
    
    
}
