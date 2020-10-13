package Mine_quiz_1_pl_06_apr_017;

public class Tanaman {
    public String Jenis;
    public String Nama;
    public int Tumbuh;
    public int SikPanen;
    public static int jmlTanaman = 0;
    public Tanaman(){}
    
    public Tanaman(String Nama){
        this.Nama = Nama;
        setLamaDanPanen();
        if(Nama.equals("Daging")){}
        else{jmlTanaman++;}
    }
    
    public void setLamaDanPanen(){
        if(Nama.equalsIgnoreCase("Apel") || Nama.equalsIgnoreCase("Mangga")){
            Tumbuh = 5;
            SikPanen = 3;
            Jenis = "Buah";
        }
        else if(Nama.equalsIgnoreCase("Tomat")){
            Tumbuh = 2;
            SikPanen = 4;
            Jenis = "Sayur";
        }
        else{
        Tumbuh = 0;
            SikPanen = 0;
            Jenis = "Daging";
        }
    }
    
    public String getJenis(){
        return Jenis;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void showTanaman(){
        System.out.println("Jenis\t : " + Jenis);
        System.out.println("Nama\t : " + Nama);
        System.out.println("Lama Tumbuh\t : " + Tumbuh);
        System.out.println("Siklus Panen\t : " + SikPanen);
    }
    public void showJum(){
        System.out.println("Jumlah Total Tanaman : " + jmlTanaman);
    }
    
}
