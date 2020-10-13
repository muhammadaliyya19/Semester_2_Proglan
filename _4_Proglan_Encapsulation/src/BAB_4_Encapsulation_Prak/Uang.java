package BAB_4_Encapsulation_Prak;

public class Uang {
    private long Saldo;
    long TerimaTunai;
    long limitTarikTunai;
    long BiayaAdmin;
    private Nasabah Org ;
    
    public Uang(){}
    
    public Uang(String Nama, String NoRek, String PIN,long Saldo){
        this.Saldo = Saldo;
        Org = new Nasabah(Nama, NoRek, PIN);
    }
    
    public Uang(String Nama, String NoRek, String PIN){
        Org = new Nasabah(Nama, NoRek, PIN);
    }
    
    public void tarikTunai(long Tarik){
        if(Tarik <= limitTarikTunai){
        Saldo -= (Tarik + BiayaAdmin);
        if(Saldo < 10000){
            System.out.println("Saldo Tidak Mencukupi\n"
                             + "Transaksi Dibatalkan");
        }
        }
        else{
            System.out.println("Nominal Melebihi Limit\n"
                             + "Transaksi Dibatalkan");
        }
    }
    
    public void Transfer(long Transfer){
        if(Transfer <= limitTarikTunai){
        Saldo -= (Transfer + BiayaAdmin);
        if(Saldo < 10000){
            System.out.println("Saldo Tidak Mencukupi\n"
                             + "Transaksi Dibatalkan");
        }
        }
        else{
        System.out.println("Nominal Melebihi Limit\n"
                             + "Transaksi Dibatalkan");
        }
    }
    
    public void terimaTunai(long Transfer){
        Saldo += Transfer;
    }
    
    public void showSaldo(){
        System.out.println("Saldo Anda Saat Ini : Rp. " + Saldo);
    }
    
    public void showOrang(){
        System.out.println("Nama\t\t : " + Org.getNama());
        System.out.println("Nomor Rekening\t : " + Org.getNorek());
    }
    
    public Nasabah getOrang(){
        return Org;
    }
    
    public long getSaldo(){
    return Saldo;
    }
    
}
