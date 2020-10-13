package Rental_Mobil;

public class Pelanggan {
    private String Nama;
    private String KTP;
    
    public Pelanggan(){
    
    }
    
    public Pelanggan(String Nama, String KTP){
        this.Nama = Nama;
        this.KTP = KTP;
    }
    
    public String getNama(){
    return Nama;
    }
    
    public String getKTP(){
    return KTP;
    }
    
    public void ShowIndentity(){
        System.out.println("Nama\t : " + Nama);
        System.out.println("KTP\t : " + KTP);
    }
            
}
