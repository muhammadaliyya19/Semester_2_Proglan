/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tes_Objek;

/**
 *
 * @author Ilmi
 */

class Induk{
    public void Sout(){
        System.out.println("Sout");
    }
}
public class A extends Induk{
    public String Nama;
    static int jum = 0;
    
    public A (){
        jum++;
    }    
    public void setNama(String Nama){
        this.Nama = Nama;
        
    }
    public String getNama(){
        return Nama;
    }    
    
    public int getJum(){
        return jum;
    }
}
