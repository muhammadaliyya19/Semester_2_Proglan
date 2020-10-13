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
public class Hewan {
    String nama;
String jenis;

public Hewan(){};

public Hewan(String nama, String jenis){
this.nama = nama;
this.jenis = jenis;
}

public String getNama(){
    return nama;
}
public String getJenis(){
    return jenis;
}

}
