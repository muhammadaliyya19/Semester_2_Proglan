package Ticketing;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Transaksi T = new Transaksi();
    Scanner in = new Scanner(System.in);
        System.out.println("= = = = Selamat Datang Di Online Ticket Mboh = = = =");
        int pil = 0;
        do{
        System.out.println(  "Pilihan : \n"
                           + "  1. Lihat Jadwal Pesawat\n"
                           + "  2. Lihat Rute Pesawat\n"
                           + "  3. Pesan Tiket Pesawat\n"
                           + "  4. Lihat Tiket Dipesan\n"
                           + "  5. Keluar");
        System.out.print("Silakan Masukkan Pilihan : ");
        pil = in.nextInt();
            switch (pil){
                case 1 : { T.j.showJadwal();break;}
                case 2 : {T.r.showAllRoute(); break;}
                case 3 : {T.setPemesan();
                          T.setRoute();
                            break;}
                case 4 : {T.showPesanan(); break;}
                case 5 : {System.out.println("Program Dihentikan"); break;}
                default :{System.out.println("Pilihan Tidak Ada \nProgram Dihentikan"); break;}
            }
        }while(pil < 5);
    }    
}
