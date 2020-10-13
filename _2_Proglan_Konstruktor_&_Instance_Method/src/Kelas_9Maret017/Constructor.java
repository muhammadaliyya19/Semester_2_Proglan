package Kelas_9Maret017;

// Constructor and Acces Modifier

public class Constructor {
    private String Nama, NIM, JK, Alamat;
    public void Show(){
        System.out.println("Nama \t\t= " + Nama);
        System.out.println("NIM \t\t= " + NIM);
        System.out.println("Jenis Kelamin \t= " + JK);
    }
    public String getAlamat(){
    return Alamat;
    }
    public Constructor(String Nama, String NIM, String JK){
    this.Nama = Nama;
    this.NIM = NIM;
    this.JK = JK;
    }
    
    public Constructor(String Alamat){
    this.Alamat = Alamat;
    }
}
