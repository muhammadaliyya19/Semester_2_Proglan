/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_Polimorfisme_Run;

/**
 *
 * @author Ilmi
 */
public class PekerjaBorongan extends Employee{
    public PekerjaBorongan(String name, String noKTP){
        super(name,noKTP);
    }
    @Override
    public void setUpahBoronganBarang(int jumlahBarang, double hargaBarang){
        this.jumlahBarang = jumlahBarang;
        this.hargaBarang = hargaBarang;
        GajiBorongan = jumlahBarang * hargaBarang;
    }
    @Override
    public double getGajiBorongan(){
    return GajiBorongan;
    }

    @Override
    public double earnings() {
        return getGajiBorongan();
    }
    @Override
    public String toString(){
        return String.format("Pekerja borongan " + super.toString() + "\nJumlah barang : " + jumlahBarang+ "\nHarga barang : " + hargaBarang +"\ngaji borongan : " + earnings());
    }
    
}
