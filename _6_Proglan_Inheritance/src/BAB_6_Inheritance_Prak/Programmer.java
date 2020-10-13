package BAB_6_Inheritance_Prak;

public class Programmer extends Pegawai{
    private int jamKerja;
    private double Lembur;
    public Programmer(){}
    
    public Programmer(String Nama, String NIP, int Year, double GajiPokok, String Keluarga, int JumlahAnak, int jamKerja){
        super(Nama, NIP, Year, GajiPokok, Keluarga, JumlahAnak);
        this.jamKerja = jamKerja;
        setBonusKerja_and_Jabatan(getBonusLembur(GajiPokok));
    }
    
    public double getBonusLembur(double gaji){
        if(jamKerja > 10){
            Lembur = gaji*(0.05)*(jamKerja - 10);
        }
    return Lembur;
    }
    
    public double getBonusLembur(){
        return Lembur;
    }
    @Override
    public void ShowAllInfo(){
        super.ShowAllInfo();
        System.out.println("\t4. Bonus Lembur \t: Rp. " + Lembur);
    }
    
}
