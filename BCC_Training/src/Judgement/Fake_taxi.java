package Judgement;
import java.util.Scanner;
public class Fake_taxi {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int kas = in.nextInt();
    int [][] state = new int [kas][4];
    String cek [] = new String[kas];
    int i , j , l;
        for(i = 0 ; i < kas ; i++){
                for(j = 0 ; j < 3 ; j++){
                    state[i][j] = in.nextInt();
                }
            state[i][3] = in.nextInt();
            cek[i] = in.next();
                for(l = 1 ; l < 3 ; l++){
                    state[i][0] *= state[i][l];
                }
                    if(cek[i].equalsIgnoreCase("bayar")){
                        state[i][3] = state[i][3] - state[i][0];
                    }
                    else {
                    state[i][3] = state[i][0]*-1;    
                    }
            
        }
            for(i = 0 ; i < kas ; i++){
                System.out.println(state[i][3]);
            }
    }
}
