package Buku_habis_pakai;
public class Rumus_formula{
   public static void main(String [] args){
       Tambahan t1 = new Tambahan();

       System.out.println("Diketahui jumlah lembar : " + t1.getLembar());

       System.out.println("Diketahui jumlah kata perlembar : " + t1.getkataperLbr());

       System.out.println("Maka dapat disimpulkan bahwa jumlah kata untuk semua lembar : " + t1.getkataSemuaLembar());

System.out.println("Jadi, jika tiap hari tertulis 100 kata maka buku akan habis dalam jangka waktu : " + t1.getHasil() );

   }
}
   class Tambahan{
     int lembar = 50;
     int kataperLbr = 400;
     int kataperHari = 100;
     int kataSemuaLembar = kataperLbr * lembar;
     int habisPakai = kataSemuaLembar / kataperHari;
   public int getLembar(){
      return lembar;
   }
   public int getkataperHari(){
      return kataperHari;
   }
   public int getkataperLbr(){
      return kataperLbr;
   }
   public int getkataSemuaLembar(){
      return kataSemuaLembar;
   }
   public int getHasil(){
      return habisPakai;
   }
}
