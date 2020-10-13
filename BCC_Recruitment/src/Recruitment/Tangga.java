package Recruitment;
import java.util.Scanner;
public class Tangga {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
        int tin = in.nextInt();
            if(tin >= 1 && tin <= 10){
                for(int i = 1 ; i <= tin ; i++){
                    for(int j = tin; j > 0 ; j--){
                    if(j > i){System.out.print(" ");}
                    else{System.out.print("*");}
                    }
                    System.out.println();
                }
            }
        }
    }
    

