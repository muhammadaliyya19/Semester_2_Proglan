/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal;

/**
 *
 * @author Ilmi
 */
public class main_tes {
    public static void main(String[] args) {
        Kandang tes1 [] = new Kandang[10];
        for (int i = 0; i < 10; i++) {
            tes1[i].getHewan().jenis = "i";
        }
        System.out.println(tes1[0].getHewan().getJenis());
        tes1[0] = new Kandang();
        tes1[0].getHewan().jenis = "lalal";
        System.out.println(tes1[0].getHewan().getJenis());
    }
    
}
