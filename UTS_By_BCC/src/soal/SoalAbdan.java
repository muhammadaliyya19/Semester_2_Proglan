/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;

import com.sun.org.apache.bcel.internal.generic.GOTO;

public class SoalAbdan {
    public static void main(String[] args) {
        CobaTebak acak1 = new CobaTebak(2, 3);
        CobaTebak acak2 = new CobaTebak(3, 4);
        
        //Tampil output pada baris ke-1
        tampil(acak1, acak2);
        acak1=acak2;
        
        //Tampil output pada baris ke-2
        tampil(acak1, acak2);
        
        //Tampil output pada baris ke-3
        System.out.println(acak1.getCount());
        acak2 = new CobaTebak(4, 4);
        
        //Tampil output pada baris ke-4
        tampil(acak1, acak2);
        acak2 = null;
        
        //Tampil output pada baris ke-5
        System.out.println(acak2.getCount());
        String cetak = "67";
        double bu = Double.parseDouble(cetak);
        System.out.println(bu);
        
    }
    private static void tampil(CobaTebak acak1, CobaTebak acak2) {
        System.out.printf("%d %.0f %d %.0f\n", acak1.getAngka1(), acak1.getAngka2(), acak2.getAngka1(), acak2.getAngka2());
    }
}
class CobaTebak {
    private int angka1 ;
    private static double angka2;
    private static int count = 0;
    public CobaTebak(int angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        count++;
    }
    public int getAngka1() {
        return angka1;
    }
    public double getAngka2() {
        return angka2;
    }
    public static int getCount() {
        return count;
    }
}
