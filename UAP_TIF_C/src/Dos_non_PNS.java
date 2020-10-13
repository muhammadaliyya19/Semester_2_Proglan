
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ilmi
 */
public class Dos_non_PNS{
   private String Nama;
    private String JK;
    private String TTL;
    private String Alamat;
    private String NIP;
    private double Gaji;
    private ArrayList<MatKul>Diajar  = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    
    public Dos_non_PNS(
    String Nama,String JK,String TTL,String Alamat,String NIP,double Gaji){
        this.Nama = Nama;
        this.JK = JK;
        this.TTL = TTL;
        this.Alamat = Alamat;
        this.NIP = NIP;
        this.Gaji = Gaji;
    } 
    
    public void Mengajar(MatKul e){
        Diajar.add(e);
    }
    
    public void showMatkulDiajar(){
        for (MatKul ajar : Diajar) {
            ajar.showMatkulDiajar();
        }
    }
    public void showIdentity(){
        System.out.println("Dosen NON PNS");
        System.out.println("Nama "+ Nama);
        System.out.println("Jenis Kelamin " + JK);
        System.out.println("TTL " + TTL);
        System.out.println("Alamat " + Alamat);
        System.out.println("NIP " + NIP);
        System.out.println("Gaji "+Gaji);
        
    }
}
