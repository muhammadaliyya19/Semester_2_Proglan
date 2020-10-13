/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ilmi
 */
public class MatKul {
    String Kode;
    String Matkul;
    int SKS;
    double Jam;
    
    public MatKul(){}
    
    public MatKul(String Kode, String Matkul, int SKS, double Jam){
        this.Kode = Kode;
        this.Matkul = Matkul;
        this.SKS = SKS;
        this.Jam = Jam;
    }
    
    public void showMatkulDiambil(){
        System.out.println("Nama : " + Matkul);
        System.out.println("Kode : " + Kode);
        System.out.println("SKS  : " + SKS);
    }
    
    public void showMatkulDiajar(){
        System.out.println("Nama : " + Matkul);
        System.out.println("Kode : " + Kode);
        System.out.println("Jam  : " + Jam);
    }
}
