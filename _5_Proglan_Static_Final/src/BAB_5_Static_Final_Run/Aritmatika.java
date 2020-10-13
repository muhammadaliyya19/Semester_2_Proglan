/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB_5_Static_Final_Run;

/**
 *
 * @author Ilmi
 */
public class Aritmatika {
    public void hitungPenjumlahan(int a,int b){
        int nilai = a+b;
        System.out.println("nilai penjumlahan adalah :"+nilai);
        hitungPerkalian(a, b);
    }
    
    public static void hitungPerkalian(int a, int b){
        int nilai = a*b;
        System.out.println("nilai perkalian adalah : "+nilai);
    }
    
    public static void hitungPengurangan(int a, int b){
        int nilai = a-b;
        System.out.println("nilai pengurangan adalah :"+nilai);
    }
    
    public double hitungPembagian(String nil1, String nil2){
    double satu = Double.parseDouble(nil1);
    double dua = Double.parseDouble(nil2);
    return satu / dua ;
    }
}