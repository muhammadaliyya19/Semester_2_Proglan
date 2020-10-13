/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ilmi
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Mahasiswa {
    private String Nama;
    private String NIM;
    private String JK;
    private String TTL;
    private ArrayList<MatKul>MKdiambil  = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int jumMK;
    
    public Mahasiswa(){}
    
    public Mahasiswa(String Nama, String NIM, String JK, String TTL){
        this.Nama = Nama;
        this.NIM = NIM;
        this.JK = JK;
        this.TTL = TTL;
    }
    
    public void showMahasiswa(){
        System.out.println("MAHASISWA");
        System.out.println("Nama          : " + Nama);
        System.out.println("NIM           : " + NIM);
        System.out.println("Jenis Kelamin : " + JK);
        System.out.println("TTL           : " + TTL);
    }
    
    public void Mengambil(MatKul e){
        MKdiambil.add(e);
    }
    
    public void showMatkulDiambil(){
        for (MatKul ajar : MKdiambil) {
            ajar.showMatkulDiambil();
        }
    }
    
}
