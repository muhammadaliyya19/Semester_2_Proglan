package Judgement;
import java.util.Scanner;
public class Penjumlahan {
    public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    int a [] = new int [3];
    a[0] = in.nextInt();
    a[1] = in.nextInt();
    a[2] = a[0] + a[1];
        System.out.println(a[2]);
    }
}
