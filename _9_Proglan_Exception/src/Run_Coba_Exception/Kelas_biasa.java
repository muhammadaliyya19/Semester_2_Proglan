/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run_Coba_Exception;

/**
 *
 * @author Ilmi
 */
public class Kelas_biasa {
    public static void main(String[] x) {
        int a = 0;
        int b = 10;
        System.out.println(a + " / " + b + " = " + a/b);
        try{
            System.out.println(b + " / " + a );
            System.out.println(b/a);
        }
        catch(Exception e){
            System.out.println("Gabisa");
        }
        finally{
            System.out.println("Semua bilangan gabisa dibagi 0");
        }
    }
}
