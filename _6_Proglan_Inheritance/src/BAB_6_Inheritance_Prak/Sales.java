/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB_6_Inheritance_Prak;

/**
 *
 * @author Ilmi
 */
public class Sales extends Pegawai{
    private double HargaBarang;
    private int StockBarang;
    private int BarangTerjual;
    private double BonusPenjualan = 0;
    
    public Sales(){}
    
    public Sales(String Nama, String NIP, int Year, double GajiPokok, String Keluarga, int JumlahAnak, int HargaBarang, int StockBarang, int BarangTerjual){
        super(Nama, NIP, Year, GajiPokok , Keluarga, JumlahAnak);
        this.HargaBarang = HargaBarang;
        this.StockBarang = StockBarang;
        this.BarangTerjual = BarangTerjual;
        setBonusKerja_and_Jabatan(getBonusTambahan(GajiPokok));
    }
    
    public double getBonusTambahan(double GajiPokok){
        if((BarangTerjual / StockBarang) * (100) > 70){
            BonusPenjualan = 0.1 * HargaBarang * BarangTerjual;
        }
        else{
            BonusPenjualan = 0.03 * HargaBarang * BarangTerjual;
        }
    return BonusPenjualan;
    }
    
    public double getBonusTambahan(){
        return BonusPenjualan;
    }
    
    @Override
    public void ShowAllInfo(){
        super.ShowAllInfo();
        System.out.println("\t4. Bonus Penjualan \t: Rp. " + getBonusTambahan());
    
    }
    
}
