package Judgement;
import java.util.Scanner;
public class Jauh_amat {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int cart [] = new int [4];
        cart[0] = in.nextInt();
        cart[2] = in.nextInt();
        cart[1] = in.nextInt();
        cart[3] = in.nextInt();
    int x , y ;
        x = cart[0] - cart[1];
        y = cart[2] - cart[3];
    if(x < 0){x*=-1;}
    if(y < 0){y*=-1;}
    int hasil = x + y ;
        System.out.println(hasil);    
    }
}
