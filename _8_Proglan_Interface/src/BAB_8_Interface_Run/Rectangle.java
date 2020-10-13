package BAB_8_Interface_Run;
import java.util.Scanner;
    
    interface Colorable {
        public void howToColor();
    }
    interface Comparable{
        public void compareTo(Object obj);
    }
    public class Rectangle implements Colorable, Comparable{ // lass
        private String warna;
        private int kategori;
        
        public Rectangle() {}
        
        public Rectangle(String warna) {
            this.warna = warna;
        }
        
        @Override
        public void howToColor() {
            if(this.warna == null){
                System.out.println("tidak ada warna, warna bangun kotak masih polos");
            }
            else{
                System.out.println("bangun kotak sudah diwarnai dengan warna "+this.warna);
            }
        }
        
        @Override
        public void compareTo(Object obj) {
            this.kategori = (int) obj;
            if(this.kategori == 0){
                System.out.println("ukuran cat yang cocok untuk bangun kotak dengan ukuran kategori " +this.kategori+" yaitu 2.5L" );
            }
            else{
                System.out.println("ukuran cat yang cocok untuk bangun kotak dengan ukuran kategori " +this.kategori+" yaitu 6.5L" );
            }
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Rectangle kotak1, kotak2, kotak3;
            
//            System.out.print("Masukkan warna kotak - 1 : ");
//            String w1 = in.nextLine();
//            if("Polos".equals(w1)){kotak1 = new Rectangle();}
//            else{kotak1 = new Rectangle(w1);kotak1.howToColor();}
//            
//            System.out.print("Masukkan warna kotak - 2 : ");
//            String w2 = in.nextLine();
//            if("Polos".equals(w1)){kotak2 = new Rectangle();}
//            else{kotak2 = new Rectangle(w1);kotak2.howToColor();}
//            
//            System.out.print("Masukkan warna kotak - 3 : ");
//            String w3 = in.nextLine();
//            if("Polos".equals(w1)){kotak3 = new Rectangle();}
//            else{kotak3 = new Rectangle(w1);kotak3.howToColor();}
//            
//            System.out.print("Input kategori kotak - 1 : ");
//            int kat1 = in.nextInt();
//            kotak1.compareTo(kat1);
//            
//            System.out.print("Input kategori kotak - 2 : ");
//            int kat2 = in.nextInt();
//            kotak2.compareTo(kat2);
//            
//            System.out.print("Input kategori kotak - 3 : ");
//            int kat3 = in.nextInt();
//            kotak3.compareTo(kat3);
            
            Rectangle kotak4;
            System.out.print("Masukkan warna kotak - 4 : ");
            String w4 = in.nextLine();
            if("Polos".equals(w4)){kotak4 = new Rectangle();}
            else{kotak4 = new Rectangle(w4);kotak4.howToColor();}
            
            System.out.print("Input kategori kotak - 4 : ");
            int kat4 = in.nextInt();
            kotak4.compareTo(kat4);
            
            System.out.println("Mengganti warna kotak - 4");
            kotak4.changeColor();
            
            
        }
        
        public void changeColor(){
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan warna baru : ");
            this.warna = in.nextLine();
            System.out.println("Warna kotak telah diubah menjadi : " + this.warna);
        }
}