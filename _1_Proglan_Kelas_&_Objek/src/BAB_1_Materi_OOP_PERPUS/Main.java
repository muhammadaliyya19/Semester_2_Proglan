package BAB_1_Materi_OOP_PERPUS;

public class Main {
    public static void main(String[]args){
        Mhs mhs1 = new Mhs();
        Mhs mhs2 = new Mhs();
        
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        
        Pinjaman org1 = new Pinjaman();
        Pinjaman org2 = new Pinjaman();
        
        mhs1.nama = "Andre";
        mhs1.NIM = "123";
        mhs1.alamat = "Malang Kota";
        
        mhs2.nama = "Difa";
        mhs2.NIM = "456";
        mhs2.alamat = "Kota Batu";
        
        buku1.Author = "Deitel";
        buku1.Judul = "[Java - OOP Programing]";
        buku1.tahun = "(2003)";
        
        buku2.Author = "Morris Mano";
        buku2.Judul = "[Digital Design 9th Edition]";
        buku2.tahun = "(2006)";
        
        org1.tgl_pin = "3 Maret 2017";
        org1.tgl_kem = "10 Maret 2017";
        org1.buku = buku1.Judul + " " + buku1.Author + " " + buku1.tahun;
        org1.peminjam = mhs1.nama + " " + mhs1.NIM + " " + mhs1.alamat;
        
        org2.tgl_pin = "1 Maret 2017";
        org2.tgl_kem = "8 Maret 2017";
        org2.buku = buku2.Judul + " " + buku2.Author + " " + buku2.tahun;
        org2.peminjam = mhs2.nama + " " + mhs2.NIM + " " + mhs2.alamat;
        
        System.out.println(org1.buku);
        System.out.println(org1.peminjam);
        System.out.println(org1.tgl_pin);
        System.out.println(org1.tgl_kem);
        System.out.println();
        System.out.println(org2.buku);
        System.out.println(org2.peminjam);
        System.out.println(org2.tgl_pin);
        System.out.println(org2.tgl_kem);
        
       
    }
}
