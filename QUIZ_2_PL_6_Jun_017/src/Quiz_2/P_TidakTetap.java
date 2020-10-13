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
public class P_TidakTetap extends Pegawai{
    private int lembur;
     public P_TidakTetap(String Nama, String Umur, double GajiPokok, int Lembur){
        super(Nama, Umur, GajiPokok);
        this.lembur = Lembur;
    }
    
    @Override
    public double getGaji() {
        return (GajiPokok + getLembur());
    }
    
    public double getLembur(){
        if(this.lembur > 8){
            return (0.1 * super.GajiPokok * (lembur - 8));
        }
        else{
                return (0);
        }
    }

    @Override
    public String toString() {
        return String.format(super.toString()+
                             "Lembur  : " + getLembur()+ "\n" + 
                             "Total gaji : " + getGaji());
    }
}
