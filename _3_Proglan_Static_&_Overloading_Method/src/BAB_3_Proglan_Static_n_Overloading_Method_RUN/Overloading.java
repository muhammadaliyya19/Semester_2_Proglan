package BAB_3_Proglan_Static_n_Overloading_Method_RUN;
import java.util.Scanner;
public class Overloading {
        static int nilai;
        public static void HitungLuas(int a,int b){
            nilai = 0 ;
            int nilai = a*b;
            System.out.println("maka hasil luas : "+nilai);
        }
        
        public static void HitungLuas(double value, double value2){
            nilai = 0 ;
            double nilai = value* value2;
        }
        
        public static int getLuas(){
            return nilai;
        }
        
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            
            System.out.print("masukkan nilai integer 1 : ");
            int integer1 = in.nextInt();
            
            System.out.print("masukkan nilai integer 2 : ");
            int integer2 = in.nextInt();
            
            HitungLuas(integer1, integer2);
            
            System.out.print("masukkan nilai double 1 : ");
            double double1 = in.nextDouble();
            
            System.out.print("masukkan nilai double 2 : ");
            double double2 = in.nextDouble();
            
            HitungLuas(double1, double2);
            
            System.out.println("Maka hasil luas :"+ getLuas());
 }
 }
