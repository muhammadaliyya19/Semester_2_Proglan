package Materi_OOP_Rental_VCD;

public class Main {
    static Transaksi t1;
    static Transaksi t2;
    static Transaksi t3;
    static Transaksi t21;
    static Transaksi t22;
    static Transaksi t23;
    
    public Main(){
    
    }
    
    public static void main(String[]args){
        System.out.println("====\tTANSAKSI RENTAL VCD\t====");
        
        //dengan Constructor
        t1 = new Transaksi("01 Maret 2017", "08 Maret 2017");
        t2 = new Transaksi(" Muhammad Aliyya Ilmi ", " Kediri ", " Laki - laki ");
        t3 = new Transaksi(" Titanic ", " James Cameron ", " Romance ", " 2:48:50 ");
        
        t21 = new Transaksi("09 Maret 2017", "17 Maret 2017");
        t22 = new Transaksi(" Lukman Hakim W. ", " Samarinda ", "Laki - laki");
        t23 = new Transaksi(" Snowden ", " Oliver Stone ", " Drama, Thriller ", " 2:14:36");
        
        System.out.println("Pada Tanggal \t : "+ t1.getTanggalPinjam());
        
        System.out.println("DVD " + t3.d1.getJudul() + " by "+t3.d1.getSutradara() +" bergenre "+ t3.d1.getGenre());
        
        System.out.println("Dipinjam oleh \t : "+t2.p1.getNama());
        System.out.println("Beralamat di \t : "+t2.p1.getAlamat());
        
        System.out.println("Tanggal kembali\t : " + t1.getTanggalKembali());
        
        /* keduax*/ System.out.println(); System.out.println();
        
        System.out.println("Pada Tanggal \t : "+ t21.getTanggalPinjam());
        
        System.out.println("DVD " + t23.d1.getJudul() + " by "+t23.d1.getSutradara() +" bergenre "+ t23.d1.getGenre());
        
        System.out.println("Dipinjam oleh \t : "+t22.p1.getNama());
        System.out.println("Beralamat di \t : "+t22.p1.getAlamat());
        
        System.out.println("Tanggal kembali\t : " + t21.getTanggalKembali());

        
        
        /* TANPA CONSTRUCTOR
        t1.setPeminjam("Ilmi", "Kediri", "Laki - laki");
        t1.setDVD("Dr. Strange", "Action", "2:34:45");
        
        System.out.println("Hari ke-1");
        System.out.println(t1.p1.Nama + " Alamat " + t1.p1.Alamat + " Meminjam " + t1.d1.Judul);
    
        t2.setPeminjam("Lee", "Malang", "Perempuan");
        t2.setDVD("Goblin", "Romance", "6:56:32");
        
        System.out.println("");
        
        System.out.println("Hari ke-2");
        System.out.println(t2.p1.Nama + " Alamat " + t2.p1.Alamat + " Meminjam " + t2.d1.Judul);
        
        System.out.println();
        
        t1.showPeminjam();
        
        System.out.println();
        
        t1.showDVD();
        
        System.out.println();
        
        t2.showPeminjam();
        
        System.out.println();
        
        t2.showDVD();
        */
    }
    
    
}
