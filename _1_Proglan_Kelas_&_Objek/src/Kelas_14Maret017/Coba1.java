package Kelas_14Maret017;

import Kelas_14Maret017.Baru.NewClass;

public class Coba1 {
    public static void main(String[] args) {
    
        NewClass2 a1 = new NewClass2();
        
        a1.a = 10;
        a1.b = 25;
        
        // untuk mengakses variabel / instance objek dari sebuah kelas pada package lain, maka 
        //kita harus impor package dan kelas yg hendak kita akses.. ^up^
        
        NewClass b1 = new NewClass();
        b1.b =0;
    
    }
}
