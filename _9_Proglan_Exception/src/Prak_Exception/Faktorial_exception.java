package Prak_Exception;

import java.util.Scanner;

public class Faktorial_exception extends Exception{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num=0;
//        try{
//            int a = in.nextInt();
//        }
//        catch(Exception n){
//            System.out.println(n);
//        }
//        finally{
//            System.out.println("Selesai");
//        }
        Faktorial_exception [] a = new Faktorial_exception[2];
        a[0] = new Faktorial_exception();
        try{
            System.out.println("Faktorial sederhana");
            System.out.print("Masukkan batas : ");
            int batas = in.nextInt();
            if(batas < 0){
                throw new Exception("Batas bernilai negatif");
            }
            else{
                num = a[0].faktorial(batas);
                System.out.println("Batas diterima");
                System.out.println(batas + " ! = " + num);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Selesai");
        }
    }
    public double faktorial(int up){
        int first = 1;
        for (int i = 1; i <= up; i++) {
            first*= i;
        }
        return first;
    }
}
