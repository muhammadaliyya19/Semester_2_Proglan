package BAB_6_Inheritance_Prak;

public class Manager extends Pegawai{
    private double bonusJabatan;
    public Manager(){}
    public Manager(String Nama, String NIP, int Year, double GajiPokok, String Keluarga, int JumlahAnak){
        super(Nama, NIP, Year, GajiPokok, Keluarga, JumlahAnak);
        this.bonusJabatan = GajiPokok*=0.1;
        setBonusKerja_and_Jabatan(bonusJabatan);
    }
    @Override
    public void ShowAllInfo(){
        super.ShowAllInfo();
        System.out.println("\t4. Bonus Jabatan \t: Rp. " + bonusJabatan);
    }
}
