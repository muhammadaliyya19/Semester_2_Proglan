package Judgement;
import java.util.Scanner;
public class Bebek {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int jum [] = new int [2];
        jum[0] = in.nextInt();
        jum[1] = in.nextInt();
        if(jum[0] <= 1000 && jum[0] >=1 && jum[1] <= 1000 && jum[1] >=1){
            System.out.println("masing-masing " + jum[0] / jum[1]);
            System.out.println("bersisa " + jum[0] % jum[1]);
        }
    
    }
}
