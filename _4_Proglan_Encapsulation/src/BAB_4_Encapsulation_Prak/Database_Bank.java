package BAB_4_Encapsulation_Prak;

public class Database_Bank {
    private Uang U;
    
    public Database_Bank(){}
    
    public Database_Bank(String Nama, String NoRek, String PIN, long Saldo){
        U = new Uang(Nama, NoRek, PIN, Saldo);
        setJenRek();
    }
    public Database_Bank(String Nama, String NoRek, String PIN){
        U = new Uang(Nama, NoRek, PIN);
    }
    public Uang getUang(){
        return U;
    }
    
    public void setJenRek(){
        if(U.getOrang().getNorek().startsWith("001")){
            U.getOrang().setJenRek("Gold");
            U.limitTarikTunai = 10000000;
            U.BiayaAdmin = 0;
        }
        else if(U.getOrang().getNorek().startsWith("192")){
            U.getOrang().setJenRek("Silver");
            U.limitTarikTunai = 7000000;
            U.BiayaAdmin = 6500;
        }
        else if(U.getOrang().getNorek().startsWith("283")){
            U.getOrang().setJenRek("Bronze");
            U.limitTarikTunai = 5000000;
            U.BiayaAdmin = 7500;
        }
    }
}
