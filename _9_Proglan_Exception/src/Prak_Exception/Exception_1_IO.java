/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prak_Exception;
import java.util.Scanner;
public class Exception_1_IO{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.print("Masukkan angka : ");
            String input = in.next();
            double hasil = getFak(Integer.parseInt(input));
            if(hasil >= 0 || hasil < 0){
                System.out.println("angka diterima");
            }
            else{
                throw new Exception("Masukkan bukanlah bilangan bulat");
            }
        }
        catch(Exception e){
            System.out.println("Masukkan bukanlah bilangan bulat");
        }
        finally{
            System.out.println("Selesai");
        }
        
    }
    static double getFak(int input){
        int satu = 1;
        for(int i = satu ; i < input ; i++){
            satu*=i;
        }
        return satu;
    }
    
}
