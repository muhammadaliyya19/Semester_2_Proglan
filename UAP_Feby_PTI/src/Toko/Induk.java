/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;
import java.util.Scanner;
public class Induk {
    int [] jumlah = new int[3];
    double [] harga = {1000,2000,1500};
    String [] barang = {"Kerupuk", "Kacang", "Permen"};
    Scanner in = new Scanner(System.in);
    public void Beli(){
        int pilih = 0;
        do{
            for (int i = 0; i < barang.length; i++) {
                System.out.println((i+1) + ". " + barang[i]);
            }
            System.out.print("Beli apa ? ");
            pilih = in.nextInt();
            System.out.println("Berapa ? ");
            int jum = in.nextInt();
        }while(pilih > 0 && pilih < 4);
    }
    
    public void Totalan(){
        
    }
}
