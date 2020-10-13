package _7_Polimorfisme_Prak;

import java.util.Scanner;
public abstract class Induk {
    Scanner in = new Scanner(System.in);
    private String Nama;
    private String NIK;
    private String No_HP;
    private String Alamat;
    protected String [] JenisKamar = {};
    protected String Hari;
    protected double Total = 0;
    protected double Diskon = 0;
    protected double [] TarifKamar;
    protected double DiskonTarifKamar;
    protected int JumlahKamar;
    protected int [] n;
    protected int [] nPlusFasilitas = {};
    protected int [] nPlusMakan = {};
    protected String [] FasilitasPlus = {};
    protected String [] MakanPlus = {};
    protected String [] Fasilitas = {"Kolam renang","Spa","Sauna"};
    protected double [] Tarif_Fasilitas = {25000,150000,150000};
    protected String [] Makan = {"Breakfast","Lunch","Dinner"};
    protected double [] Tarif_Makan = {25000,25000,30000};
    protected double [] JumlahMakan = new double[3];
    protected double [] JumlahFasilitas = new double[3];
    protected double [] JumlahMakanNonFree = new double[3];
    protected double [] JumlahFasilitasNonFree = new double[3];
    
    
    public Induk(){}
    
    public Induk(String Nama, String NIK, String No_HP, String Alamat){
        this.Nama = Nama;
        this.NIK = NIK;
        this.No_HP = No_HP;
        this.Alamat = Alamat;
    }
    
    public void SetHargaKamar(int i){
        if(JenisKamar[i].equals("Single")){
            if(Hari.equals("Weekend")){
                TarifKamar[i] = 250000;
            }
            else{
                TarifKamar[i] = 200000;
            }
        }
        else if(JenisKamar.equals("Double")){
            if(Hari.equals("Weekend")){
                TarifKamar[i] = 450000;
            }
            else{
                TarifKamar[i] = 375000;
            }
        }
        else{
        if(Hari.equals("Weekend")){
                TarifKamar[i] = 800000;
            }
            else{
                TarifKamar[i] = 750000;
            }
        }
    }
    
    public String toString() {
        return String.format("Nama \t : " + Nama + "\nNIK \t : " + NIK + "\nHP \t : " + No_HP + "\nAlamat \t : " + Alamat);
    }
    
    public void setTotal(){
        for (int i = 0; i < n.length; i++) {
            Total += n[i] * TarifKamar[i];
        }
        
    }
    
    public double getTotal(){
        return Total;
    }
    
    public double getDiskon(){
        return Diskon;
    }
    
    public double getTotalTerdiskon(){
        return Total - Diskon;
    }
    
    public double getTotalTerdiskonPlusTambahan(){
        int Plus = 0;
        if(nPlusMakan.length != 0){
            for (int i = 0; i < nPlusMakan.length; i++) {
                Plus += nPlusMakan[i] * Tarif_Makan[i];
            }
        }
        if(nPlusFasilitas.length != 0){
            for (int i = 0; i < nPlusFasilitas.length; i++) {
                Plus += nPlusFasilitas[i] * Tarif_Fasilitas[i];
            }
        }
        return (getTotalTerdiskon() + Plus);
    }
    
    public abstract void PesanAll(int macamKamar, String Hari);
    
    public abstract void TampilkanInfo();
    
    public abstract void setDiskonTotal();
    
    public abstract void CountFasilitasAndMakan(String JenisKamar, int n);
    
    public abstract void setTambahFasilitasAndMakan();
}
