package BAB_1_Class_and_Object_run;
import java.util.Scanner;
public class MainMobil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int speed1, speed2;
        String Merk1, Merk2;
        String Plat1, Plat2;
        String Warna1, Warna2;
        
        // Input data mobil m1
        System.out.println("====Program Setting Mobil Impian Anda====");
        System.out.print("Silakan input merk mobil yang anda inginkan \t : ");
        Merk1 = in.nextLine();
        System.out.print("Silakan input warna yang anda inginkan \t\t : ");
        Warna1 = in.nextLine();
        System.out.print("Silakan input plat nomor yang anda inginkan \t : ");
        Plat1 = in.nextLine();
        System.out.print("Silakan input kecepatan mobil anda \t\t : ");
        speed1 = in.nextInt();
        
        // Input data mobil m2
        System.out.println("====Silakan Setting Mobil ke-2 Anda====");
        System.out.print("Silakan input merk mobil yang anda inginkan \t : ");
        Merk2 = in.next(); 
        System.out.print("Silakan input warna yang anda inginkan \t\t : ");
        Warna2 = in.nextLine(); Warna2=in.nextLine();
        System.out.print("Silakan input plat nomor yang anda inginkan \t : ");
        Plat2 = in.nextLine();
        System.out.print("Silakan input kecepatan mobil anda \t\t : ");
        speed2 = in.nextInt();
        
        Mobil m1 = new Mobil();
            m1.setKecepatan(speed1);
            m1.setManufaktur(Merk1);
            m1.setNoPlat(Plat1);
            m1.setWarna(Warna1);
            m1.displayMessage();
        System.out.println("================");
        
        Mobil m2 = new Mobil();
            m2.setKecepatan(speed2);
            m2.setManufaktur(Merk2);
            m2.setNoPlat(Plat2);
            m2.setWarna(Warna2);
            m2.displayMessage();
        System.out.println("================");
    }
}