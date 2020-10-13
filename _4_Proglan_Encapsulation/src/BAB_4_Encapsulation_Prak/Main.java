package BAB_4_Encapsulation_Prak;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Database_Bank [] D = new Database_Bank[3];
        D [0] = new Database_Bank("Ilmi", "001150200111050", "soktahulu", 15000000);
        D [1] = new Database_Bank("Rif", "192150201111092", "adunyali", 10000000);
        D [2] = new Database_Bank("Bachmid", "283150200111061", "mumbull", 7000000);
        Scanner in = new Scanner (System.in);
        boolean cek = false;
        int pil = 5 , count = 0, ke = 0, ke2 = 0;
        long Tarik;
        long Transfer;
        String Nama;
        String NoRek;
        String PIN;
        do{
        System.out.println("\t=-=^-^=-= Selamat Datang Di Bank Bang Tut =-=^-^=-=\t");
        System.out.print("Silakan Masukkan Nomor Rekening : ");
            NoRek = in.next();
        System.out.print("Silakan Masukkan PIN : ");
            PIN = in.next();
        for(int i = 0 ; i < 3 ; i++){
            if(D[i].getUang().getOrang().getNorek().equals(NoRek) && D[i].getUang().getOrang().getPIN().equals(PIN)){
            count++;
            ke = i;
            }
        }
        if(count >= 1 ){
        do{
            System.out.println("Menu : ");
            System.out.println("\t1. Cek Saldo\n"
                             + "\t2. Tarik Tunai\n"
                             + "\t3. Transfer\n"
                             + "\t4. Keluar");
            System.out.print("Pilihan : ");
            pil = in.nextInt();
            switch(pil){
                case 1 : {
                    D[ke].getUang().showSaldo();
                break;}
                case 2 : {
                    System.out.print("Silakan Tarik Tunai : Rp. ");
                    Tarik = in.nextLong();
                    D[ke].getUang().tarikTunai(Tarik);
                break;}
                case 3 : {
                    count = 0;
                    System.out.print("Masukkan Rekening Tujuan : ");
                    NoRek = in.next();
                    System.out.print("Silakan Masukkan Nominal : ");
                    Transfer = in.nextLong();
                    D[ke].getUang().Transfer(Transfer);
                        for(int j = 0 ; j < D.length ; j++){
                            if(D[j].getUang().getOrang().getNorek().equals(NoRek)){
                            count++;
                            ke2 = j;
                            }
                        }
                        if(count == 1){
                        D[ke2].getUang().terimaTunai(Transfer);
                        }
                        else{System.out.println("Rekening Tujuan Tidak Terdaftar");
                        D[ke].getUang().terimaTunai(Transfer);
                        }
                break;}
                case 4 : {System.out.println("Transaksi Selesai");  break;}
                default : {System.out.println("Pilihan Tidak Ada\n"
                                            + "Program Dihentikan"); cek = false; break;}
            }
          }while(pil < 4);
        System.out.print("Login Lagi ? Y / N : ");
        String co = in.next();
            if(co.equals("Y")){
               cek = true;}
            else{
                System.out.println("Program Dihentikan");    
                cek = false;
            }
        }
        else{
        System.out.println("Nomor Rekening atau PIN Salah");
        System.out.print("Coba Lagi ? Y / N : ");
        String co = in.next();
            if(co.equals("Y")){
               cek = true;}
            else{
                System.out.println("Program Dihentikan");    
                cek = false;}}
        }while(cek);
    }
}
