package BAB_5_Static_Final_Prak_2;
import java.util.Scanner;
public class Main_Jaket {
    private static final int Harga [] = {100000,125000,175000};
    static String Para [] = {"No. ","Tipe "," Harga\t"};
    static char [] Tipe = {'A','B','C'};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=====---    LABKOMDAS    ---=====\n"
                         + "===  GROSIR JAKET TERPERCAYA  ===");
        int pil = 0;
        while(pil < 3){
            System.out.println("Menu : \n"
                             + "   1. Beli\n"
                             + "   2. Lihat Tipe dan Harga\n"
                             + "   3. Keluar");
            System.out.print("Select : ");
            pil = in.nextInt();
            switch(pil){
                case 1 : {System.out.print("   Jumlah : "); int jum = in.nextInt();
                          System.out.print("   Tipe   : "); String Tipe = in.next();
                          Beli(jum, Tipe);
                          break;}
                case 2 : {for (int i = 0; i < 3; i++) {
                            System.out.print(Para[i]);
                          }
                          System.out.println();
                          for (int i = 0; i < 3; i++) {
                            System.out.println(" "+(i+1)+ ".   " + Tipe[i] +"   "+ Harga[i]);
                          }
                          
                         break;}
                case 3 : {System.out.println("Keluar");break;}
            }
        }
    }
    public static void Beli(int jumlah , String Tipe){
        int HargaBaru, Total;
        if(jumlah > 100){
            if(Tipe.equals("A")){
                HargaBaru = Harga[0] - 5000;
                Total = HargaBaru * jumlah;
                System.out.println("Harga Terdiskon(@)\t : " + HargaBaru);
                System.out.println("Total Biaya Pembelian\t : " + Total);
            }
            else if(Tipe.equals("B")){
                HargaBaru = Harga[1] - 5000;
                Total = HargaBaru * jumlah;
                System.out.println("Harga Terdiskon(@)\t : " + HargaBaru);
                System.out.println("Total Biaya Pembelian\t : " + Total);
            }
            else if(Tipe.equals("C")){
                HargaBaru = Harga[2] - 15000;
                Total = HargaBaru * jumlah;
                System.out.println("Harga Terdiskon(@)\t : " + HargaBaru);
                System.out.println("Total Biaya Pembelian\t : " + Total);
            }
        }
        else{
            if(Tipe.equals("A")){
                Total = Harga[0] * jumlah;
                System.out.println("Total Biaya Pembelian\t : " + Total);
            }
            else if(Tipe.equals("B")){
                Total = Harga[1] * jumlah;
                System.out.println("Total Biaya Pembelian\t : " + Total);
            }
            else if(Tipe.equals("C")){
                Total = Harga[2] * jumlah;
                System.out.println("Total Biaya Pembelian\t : " + Total);
            }
        }
    }
}
