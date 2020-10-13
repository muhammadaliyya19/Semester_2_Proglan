package BAB_6_Inheritance_Prak;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Pegawai {
    
    private String Nama;
    private String NIP;
    private static Date Present = new Date();
    private int YearHire;
    private double GajiPokok;
    private boolean Keluarga;
    private int JumlahAnak;
    
    private double BonusJabatanKerja;
    private double Bonus;
    private double Tunjangan;
    private long lamaKerja;
    
    SimpleDateFormat sdfPresent = new SimpleDateFormat("dd / MM / YYYY");
    SimpleDateFormat sdfPresentYear = new SimpleDateFormat("YYYY");
    
    long now = Long.parseLong(sdfPresentYear.format(Present));
    
    public Pegawai(){}
    
    public Pegawai(String Nama, String NIP, int Year, double GajiPokok, String Keluarga, int JumlahAnak){
        this.Nama = Nama;
        this.NIP = NIP;
        this.GajiPokok = GajiPokok;
        this.Keluarga = Keluarga.equalsIgnoreCase("Berkeluarga");
        this.YearHire = Year;
        this.JumlahAnak = JumlahAnak;
        lamaKerja = now - Year;
        setBonusTahun();
    }
    
    public void setBonusTahun(){
            if(lamaKerja > 0 && lamaKerja < 6){
                Bonus = lamaKerja * GajiPokok * (0.05);
            }
            else if(lamaKerja > 5){
                Bonus = lamaKerja * GajiPokok * (0.1);
            }
            else{}
    }
    public void setBonusKerja_and_Jabatan(double BonusJabatanKerja){
      this.BonusJabatanKerja = BonusJabatanKerja;
   }
    public double getBonus(){
        return Bonus;
    }
    public double getGajiPokok(){
        return GajiPokok;
    }
    public double getTunjangan(){
        if(Keluarga){
            Tunjangan += (0.05) * GajiPokok;
            if(JumlahAnak > 2){
                Tunjangan += 2 * (0.05) * GajiPokok;
            }
            else{
                Tunjangan += JumlahAnak * (0.05) * GajiPokok;
            }
        }
        return Tunjangan; 
   }
   public double getTotalGaji(){
       return (GajiPokok + Tunjangan + Bonus + BonusJabatanKerja);
   }
   public void ShowAllInfo(){
       System.out.println("Nama \t   : " + Nama);
       System.out.println("NIP  \t   : " + NIP);
       System.out.println("Year Hire  : " + YearHire);
       System.out.println("Now Year   : " + now);
       System.out.println("Lama Kerja : " + lamaKerja + " tahun");
       System.out.println("Total Gaji : Rp. " + getTotalGaji());
       System.out.println("Rincian\t   : ");
       System.out.println("\t1. Gaji Pokok\t\t: Rp. " + getGajiPokok());
       System.out.println("\t2. Tunjangan\t\t: Rp. " + getTunjangan());
       System.out.println("\t3. Bonus Lama Kerja\t: Rp. " + (getBonus()));
   }
}
