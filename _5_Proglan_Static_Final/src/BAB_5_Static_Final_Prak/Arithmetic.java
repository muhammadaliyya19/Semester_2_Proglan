package BAB_5_Static_Final_Prak;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Arithmetic a1 = new Arithmetic();
        System.out.println("Operasi Matematika Sederhana");
        System.out.println("Silakan Masukkan Angka Dengan Format num1 (+ , - . * , :) num2");
        double a = in.nextDouble();
        String op = in.next();
        double b = in.nextDouble();
        switch(op){
            case "+" : {Penjumlahan(a, b); break;}
            case "-" : {Pengurangan(a, b); break;}
            case "*" : {a1.Perkalian(a, b); break;}
            case ":" : {a1.Pembagian(a, b); a1.Sederhana(a, b);break;}
        }
    }
    static void Penjumlahan(double a , double b){
        System.out.println("Hasil Penjumlahan : " + a + " + " + b + " = " + (a+b));
    }
    static void Pengurangan(double a , double b){
        System.out.println("Hasil Pengurangan : " + a + " - " + b + " = " + (a-b));
    }
    void Perkalian(double a , double b){
        System.out.println("Hasil Perkalian : " + a + " * " + b + " = " + (a*b));
    }
    void Pembagian(double a , double b){
        if(b != 0){
            System.out.println("Hasil Pembagian : " + a + " : " + b + " = " + (a/b));
        }
        else{
            System.out.println("Hasil Tidak Terdefinisi");
        }
    }
    void Sederhana(double a , double b){
        double c = 0 , d = 0, div = 0;
        double [] temp1 = new double [(int)a];
        double [] temp2 = new double [(int)b];
        for (int i = 0; i < (int)a; i++) {
            if(a % (i+1) != 0){temp1[i] = 0 ;}
            else{temp1[i] = (i+1);}
        }
        for (int i = 0; i < (int)b; i++) {
            if(b % (i+1) != 0){temp2[i] = 0 ;}
            else{temp2[i] = (i+1);}
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if(temp1[i] == temp2[j] && (temp1[i] != 0 && temp2[j] != 0)){div = temp1[i];}
                c = a / div;
                d = b / div;
            }
        }
        if(a == 1 || b == 0){
            System.out.println(a + " / " + b + "\nPecahan Tidak Dapat Disederhanakan");
        }
        else if(a == b){
            System.out.println("Pecahan Bernilai 1");
        }
        else{ 
        System.out.printf("Pecahan " + a + " / " + b + "\n"
                         + "Dapat Disederhanakan Menjadi \n"
                         + c + " / " + d + "\n");
        }
    }
}
