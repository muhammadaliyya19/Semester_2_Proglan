package Rental_Mobil;

public class Peminjaman {
    Mobil m = new Mobil();
    Pelanggan p = new Pelanggan();
    int pinjam;
    int kembali;
    double denda;
    int late;
    int durasi;
    double bayar , Tarif;
    public Peminjaman(){
    
    }
    public void setPelanggan(Pelanggan p){
        this.p = p;
    }
    public void setMobil(Mobil m){
        this.m = m;
    }
    public void showTanggal(){
        System.out.println("Tanggal Pinjam\t\t : " + pinjam);
        System.out.println("Durasi Sewa\t\t : " + durasi + " hari");
        System.out.println("Tanggal Harus Kembali\t : " + (pinjam + durasi));
        System.out.println("Tanggal Kembali\t\t : " + kembali);
        System.out.println("Lama Ditangan Peminjam\t : " + (kembali - pinjam)+ " hari");
        System.out.println("Terlambat\t\t : " + late + " hari");
    }
    public Peminjaman(int pin, int kem, int Durasi){
        this.durasi = Durasi;
        this.pinjam = pin;
        this.kembali = kem;
        this.late = (kembali - pinjam) - durasi;
        if(this.late < 0){this.late*=-1;}
        
    }
    public void setTarif(int Durasi){
        Tarif = (Durasi * 325000);
        hitungDenda(Tarif);
        bayar = (Tarif + denda);
    }
    public void hitungDenda(double Tar){
        this.denda = Tar * 0.1 * this.late;
    }
    public void showBayar(){
        System.out.println("Tarif : " + Tarif);
        System.out.println("Denda : " + this.denda);
        System.out.println("Bayar : " + bayar);
    }
}
