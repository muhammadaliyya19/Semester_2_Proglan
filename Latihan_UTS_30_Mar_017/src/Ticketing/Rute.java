package Ticketing;
import java.util.ArrayList;
public class Rute {
    public Rute(){}
    Pesawat phe = new Pesawat();
    private static String []Route = {"Jakarta - Singapore","Surabaya - Bangkok","Surabaya - Kuala Lumpur",
                                     "Jakarta - UEA","Surabaya - Samarinda","Jakarta - Manila",
                                     "Bandung - Jogjakarta","Surabaya - Merauke","Jakarta - Malang",
                                     "Malang - Jogjakarta"};
    private static String [][] Rute = {{"Jakarta - Singapore","Surabaya - Bangkok","Surabaya - Kuala Lumpur"},
                                       {"Jakarta - UEA","Surabaya - Samarinda","Jakarta - Manila"},
                                       {"Bandung - Jogjakarta","Surabaya - Merauke","Jakarta - Malang"},
                                       {"Surabaya - Merauke","Jakarta - Malang","Malang - Jogjakarta"},
                                       {"Bandung - Jogjakarta","Surabaya - Merauke","Jakarta - Malang"},
                                       {"Jakarta - Singapore","Surabaya - Bangkok","Surabaya - Kuala Lumpur"},
                                       {"Bandung - Jogjakarta","Surabaya - Merauke","Jakarta - Malang"},
                                       {"Malang - Jogjakarta","Surabaya - Bangkok","Surabaya - Kuala Lumpur"},
                                       {"Jakarta - UEA","Surabaya - Samarinda","Jakarta - Manila"},
                                       {"Jakarta - Singapore","Surabaya - Bangkok","Surabaya - Kuala Lumpur"}};
    public void showAllRoute(){
        System.out.println("Rute Tersedia : ");
        for(int i = 0 ; i < Route.length ; i++){
            System.out.print("\t");
            System.out.println(i+1 + ". " +Route[i]);
        }
    }
    
    public void showMaskapaiAvaiable(String Rute){
        System.out.println("Maskapai Penerbangan Yang Tersedia : ");
        for(int i = 0 ; i < 10 ; i++ ){
            for(int j = 0 ; j < 3 ; j++){
                if(Rute.equalsIgnoreCase(this.Rute[i][j])){
                    System.out.println("\t"+phe.getMaskapai(i));
                }
            }
        }
    }
    
    
}
