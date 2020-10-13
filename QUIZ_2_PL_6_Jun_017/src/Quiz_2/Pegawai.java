/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz_2;

import java.io.IOException;

/**
 *
 * @author Ilmi
 */
public abstract class Pegawai {
    protected String Nama;
    protected String Umur;
    protected double GajiPokok;

    public Pegawai(){}
    
    public Pegawai(String Nama, String Umur, double GajiPokok){
        this.Nama = Nama;
        this.Umur = cekUmur(Umur);
        this.GajiPokok = GajiPokok;
    }
    
    public abstract double getGaji();
    
    @Override
    public String toString() {
        return String.format("Nama       : " + Nama + "\n" +
                             "Umur       : " + Umur + "\n"+
                             "Gaji Pokok : " + GajiPokok + "\n");
    }
    
    public String cekUmur(String Umur){
        try{
            if(Integer.parseInt(Umur) >= 0 || Integer.parseInt(Umur) < 0){
                System.out.println("Umur diterima");
            }
            else{throw new IOException("Masukan bukanlah angka");}
        }
        catch(IOException e){
            System.out.println(e.getCause());
        }
        finally{
            System.out.println("Cek Umur selesai");
        }
        return Umur;
    }
    
    
}
