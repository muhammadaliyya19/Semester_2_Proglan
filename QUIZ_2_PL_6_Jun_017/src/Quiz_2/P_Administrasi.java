/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_2;

/**
 *
 * @author Ilmi
 */
public class P_Administrasi extends Pegawai{
    
    private int MasaKerja;
    
    public P_Administrasi(){}
    
    public P_Administrasi(String Nama, String Umur, double GajiPokok, int MasaKerja){
        super(Nama, Umur, GajiPokok);
        this.MasaKerja = MasaKerja;
    }
    
    @Override
    public double getGaji() {
        return (GajiPokok + getTunjangan());
    }
    
    public double getTunjangan(){
        if(this.MasaKerja > 10){
            return (0.5 * super.GajiPokok);
        }
        else{
                return (0.3 * super.GajiPokok);
        }
    }

    @Override
    public String toString() {
        return String.format(super.toString()+
                             "Tunjangan  : " + getTunjangan() + "\n" + 
                             "Total gaji : " + getGaji());
    }
}
