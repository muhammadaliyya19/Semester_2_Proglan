package BAB_1_Class_and_Object_run;

public class Mobil {
    
private String noPlat;
private String warna;
private String manufaktur;
private int kecepatan;

/*1*/   public void setNoPlat(String s){
           noPlat = s;
        }
    
/*2*/   public void setWarna(String s){
            warna = s;
        }
    
/*3*/   public void setManufaktur(String s){
           manufaktur = s;
        }
    
/*4*/   public void setKecepatan(int i){
            kecepatan = i;
            ubahKecepatan(i);
        }
    
/*5*/   public void displayMessage(){
           System.out.println("Mobil anda adalah bermerek : "+manufaktur);
            System.out.println("mempunyai nomor plat : "+noPlat);
            System.out.println("serta memililki warna : "+warna);
            System.out.println("dan mampu menempuh kecepatan : "+kecepatan);
            System.out.println("jarak yang telah anda tempuh : "+ jarakMeter + " m"+ "\n\t\t sama dengan " + Jarak + " Km"  );
        }

/*6*/ private double Waktu;
      public void setWaktu(double Waktu){
        this.Waktu = Waktu;
          ubahSekon(Waktu);
      }

/*7*/ private double Sekon;
      private void ubahSekon(double Jam){ 
          Sekon = Jam*60*60;
      }
      
/*8*/ private double mh;
      private void ubahKecepatan(int Kmh){
      mh = (Kmh * 1000) / 3600;
      }
      
/*9*/ private double Jarak, jarakMeter;
      private void hitungJarak(){
          Jarak = kecepatan*Waktu;
          jarakMeter = Jarak*1000;
      }
}

