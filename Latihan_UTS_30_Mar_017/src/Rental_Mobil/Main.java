package Rental_Mobil;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Peminjaman p1 = new Peminjaman();
        Pelanggan p;
        Mobil m;
        
        System.out.println("= = = = Selamat Datang Di Rental Mobil RUSAK = = = =");
        int pil = 0;
        while(pil < 4){
        System.out.print("Pilihan : \n"
                         + " 1. Lihat Mobil Tersedia\n"
                         + " 2. Pinjam Mobil\n"
                         + " 3. Lihat Data Sewa\n"
                         + " 4. Keluar\n");
        System.out.print("Pilihan : ");
        pil = in.nextInt();
        String nama;
        String NIK;
        String Merk;
        String Plat;
        String Warna;
        int lama,pin,kem;
            switch(pil){
                case 1 : {
                         p1.m.showAllCar();
                         break;}
                case 2 : {
                         System.out.print("Nama\t : ");
                         nama = in.next();
                         System.out.print("NIK\t : ");
                         NIK = in.next();
                         System.out.print("Merk\t : ");
                         Merk = in.next();
                         System.out.print("Plat\t : ");
                         Plat = in.next();
                         System.out.print("Warna\t : ");
                         Warna = in.next();
                         System.out.print("Lama Pinjam\t : ");
                         lama = in.nextInt();
                         System.out.print("Tanggal Pinjam\t : ");
                         pin = in.nextInt();
                         System.out.print("Tanggal Kembali\t : ");
                         kem = in.nextInt();
                         
                         p = new Pelanggan(nama, NIK);
                         m = new Mobil(Merk, Plat, Warna);
                         
                         p1 = new Peminjaman(pin, kem , lama);
                         p1.setTarif(lama);
                         p1.setPelanggan(p);
                         p1.setMobil(m);
                         break;}
                case 3 : {
                    System.out.println("\t=-=^=-= Saudara Dengan Identitas =-=^=-=\t");
                         p1.p.ShowIndentity();
                    System.out.println("\t=-=^=-= Meminjam Mobil Dengan Spesifikasi =-=^=-=\t");
                         p1.m.showCar();
                    System.out.println("\t=-=^=-= Dengan Ketentuan Waktu =-=^=-=\t");
                        p1.showTanggal();
                    System.out.println("\t=-=^=-= Dengan Pembayaran =-=^=-=\t");
                         p1.showBayar();
                         break;}
                case 4 : {System.out.println("Program Dihentikan");
                          break;}
               default : {
                         System.out.println("PILIHAN TIDAK ADA\nProgram Dihentikan");
                         break;}
            }
        }
    }
    
}
