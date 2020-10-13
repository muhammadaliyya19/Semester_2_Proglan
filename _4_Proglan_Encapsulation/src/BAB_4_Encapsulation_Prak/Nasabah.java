package BAB_4_Encapsulation_Prak;

public class Nasabah {
    private String Nama;
    private String NoRek;
    private String PIN;
    private String JenRek;
    
    public Nasabah(){}
    
    public Nasabah(String Nama, String NoRek, String PIN){
        this.Nama = Nama;
        this.NoRek = NoRek;
        this.PIN = PIN;
    }
    
    public void setJenRek(String JenRek){
        this.JenRek = JenRek;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public String getNorek(){
        return NoRek;
    }
    
    public String getPIN(){
        return PIN;
    }
    
    
    
    
}
