package Ticketing;
import java.util.Scanner;
public class Transaksi {
    Pemesan Org;
    Pesawat Pes;
    Jadwal j = new Jadwal();
    Rute r = new Rute();
    int JmlTiket = 0;
    
    Scanner in = new Scanner(System.in);
    
    public void setPemesan(){
        System.out.print("Nama \t\t : ");
        String Nama = in.nextLine();
        System.out.print("NIK \t\t : ");
        String NIK = in.nextLine();
        Org = new Pemesan(Nama, NIK);
    }
    public boolean pesan(){
        System.out.print("Pesan Tiket ? Y / N : ");
        String A = in.next();
        if(A.equalsIgnoreCase("Y")){
        return true;
        }
        else{return false;}
    }
    String tuj;
    String Mas;
    String kel;
    public void setRoute(){
        System.out.println("Silakan Pilih Tujuan yang Anda Inginkan");
        System.out.print("Tujuan   : "); 
        tuj = in.nextLine();
        System.out.println();
        r.showMaskapaiAvaiable(tuj);
        System.out.print("Silakan Pilih Maskapai : ");
        Mas = in.nextLine();
        System.out.print("Silakan Pilih Kelas : \n  1. VIP \n  2. Bisnis \n  3. Ekonomi \nPilihan\t : ");
        kel = in.next();
        Pes = new Pesawat(Mas, kel);
        Pes.showCapacity();
        if(pesan()){
        JmlTiket++;
        }
        System.out.print("Keluar ? Y/N : ");
        String pil = in.next();
        
    }
    
    public void showPesanan(){
        System.out.println("Saudara " + Org.getNama());
        System.out.println("Memesan Tiket Dengan Detail : ");
        System.out.println("\t Jumlah   : " +JmlTiket+ " Tiket");
        System.out.println("\t Maskapai : " + Mas);
        System.out.println("\t Tujuan   : " + tuj);
        System.out.println("\t Kelas    : " + kel);
        System.out.println("\t Bayar    : " + Pes.getBayar());
    }
}
