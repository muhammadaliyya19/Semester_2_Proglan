/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak_Exception;
import java.util.Scanner;
public class Exception_2_Array {
    static int [] bit;
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Exception_2_Array ob = new Exception_2_Array();
        try{
            ob.setArray();
        }
        catch(Exception e){
            System.out.println("Terjadi error \n"
                    + "Array yang dipanggil berindeks "
                    + e.getMessage());
        }
        finally{
            System.out.println("Selesai");
        }
    }
    public void setArray(){
        System.out.print("Set panjang array : ");
        int pjg = in.nextInt();
        bit = new int[pjg];
        System.out.print("Coba panggil array indeks ke - ");
        int ke = in.nextInt();
        System.out.println("Indeks ke - " + ke + " = " + bit[ke]);
    }
}
