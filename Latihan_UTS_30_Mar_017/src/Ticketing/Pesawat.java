package Ticketing;

public class Pesawat {
    private String Maspilih;
    private int Capacity;
    private int Bayar;
    private String [] Maskapai = {"Garuda","Lion","Citilink","Batik","Sriwijaya",
                                  "Qatar","Bali","Wings","Air Asia","Emirates"};
    private int []   Kapasitas = {150,200,250};
    private int [][] Uang      = {{500000 , 600000 , 700000} ,
                                  {375000 , 425000 , 550000} ,
                                  {500000 , 650000 , 800000} ,
                                  {600000 , 725000 , 850000} ,
                                  {500000 , 675000 , 850000} ,
                                  {900000 , 1200000, 1500000},
                                  {700000 , 775000 , 850000} ,
                                  {600000 , 700000 , 820000} ,
                                  {500000 , 625000 , 750000} ,
                                  {1000000 , 1500000 , 2000000}};
    
    public Pesawat(){
    
    }
    
    public Pesawat(String Maspilih,String Grade){
        cekCapacity(Grade);
        this.Maspilih = Maspilih;
        int kol;
        int bar = 0;
        if(Grade.equals("VIP")){
            kol = 2;
        }
        else if(Grade.equals("Bisnis")){
        kol = 1;
        }
        else{kol = 0;}
        
        for(int i = 0 ; i < 10 ; i++){
            if(Maskapai[i].equals(Maspilih)){
            bar = i;
            }
        }
        Bayar = Uang[bar][kol];
    }
    
    public int getBayar(){
    return Bayar;
    }
    
    public void cekCapacity(String Grade){
        if(Grade.equalsIgnoreCase("VIP")){
            Capacity = Kapasitas[0];
        }
        else if(Grade.equalsIgnoreCase("Bisnis")){
            Capacity = Kapasitas[1];
        }
        else if(Grade.equalsIgnoreCase("Ekonomi")){
            Capacity = Kapasitas[2];
        }
    }
    
    public void showCapacity(){
        System.out.println("Kapasitas Kabin Pesawat : " + Capacity);
    }
    
    public String getMaskapai(int i){
    return Maskapai[i];
    }
    
    
    
    
}
