package Rental_Mobil;

public class Mobil {
    private String Merk;
    private String Plat;
    private String Warna;
    
    public Mobil(){
    
    }
    
    public Mobil(String Merk, String Plat, String Warna){
        this.Merk = Merk;
        this.Plat = Plat;
        this.Warna = Warna;
    }
    String [] Cars = {"Isuzu Panther Hi Sporty","Toyota Kijang Innova","Mitsubishi Kuda","Toyota Camry","KIA Timor"};
    public void showAllCar(){
        for (int i = 0; i < Cars.length ; i++) {
            System.out.println("Merk : " + Cars[i]);
        }
    }
    public String getMerk(){
    return Merk;
    }
    
    public String getPlat(){
    return Plat;
    }
    
    public String getWarna(){
    return Warna;
    }
    
    public void showCar(){
        System.out.println("Merk\t : " + Merk);
        System.out.println("Plat\t : " + Plat);
        System.out.println("Warna\t : " + Warna);
    }
    
}
