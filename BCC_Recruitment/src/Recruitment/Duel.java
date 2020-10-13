package Recruitment;
import java.util.Scanner;
public class Duel {
    /*
      10  9  41  17  24     00  01
    50                      10  11
    19
    29
    51
    
    */
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
        int satu = in.nextInt();
        int dua = in.nextInt();
        int i , j , k;
        int Strong[][] = new int[dua][satu];
        int skill1[] = new int[satu];
        int skill2[] = new int[dua];
        int sort[] = new int[satu*dua];
        int terkecil = 0;
                for(i = 0 ; i < satu ; i++){
                    skill1[i] = in.nextInt();
                }
                for(j = 0 ; j < dua ; j++){
                    skill2[j] = in.nextInt();
                }
            
                for(j = 0 ; j < dua ; j++){
                    for(k = 0 ; k < satu ; k++){
                    Strong[j][k] +=  skill2[j] - skill1[k];
                    if( Strong[j][k] < 0 ){Strong[j][k] *= -1;}
                    for(i = 0 ; i < sort.length ; i++ ) {
                    sort[i]= Strong[j][k];
                    }
                    }
                }
                
                for(i = 0 ; i < sort.length-1 ; i++ ){
                if(sort[i] < sort[i+1]){
                terkecil = sort[i];
                }
                }
            System.out.println(terkecil);
    }
}
