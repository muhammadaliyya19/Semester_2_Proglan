package BAB_6_Class_P_Furqon;

public class _2_Inheritance_27_Apr_017 {
    /*
    Direct superclass dan inDirect superclass
        - Direct superclass
          Ketika sebuah subClass diturunkan dari superClass secara eksplisit. 
          (Satu tingkat diatas subclass)
        - Indirect superclass
          Ketika sebuah SUBCLASS memiliki subClass lagi. maka 
          turunan dari SUBCLASS (yaitu subClass) indirect superclass dengan superclass 
          yang dimiliki SUBCLASS
    
          Konstruktor Chaining (Reaksi berantai Konstruktor)
          Ketika instansiasi suatu objek, maka konstruktor dari kelas objek tersebut akan dieksekusi.
    
          tapi, berbeda dengan objek dari sebuah class yang merupakan sebuah subclass.
          maka, java akan memeriksa, apakah kelas ini memiliki superclass?
          jika ia memiliki superclass, maka konstruktor dari superclass itulah yang akan dieksekusi terlebih dahulu.
          
          dan jika, ternyata superclass itu punya SUPERCLASS lagi, 
          maka konstruktor dari SUPERCLASS itulah yang akan dieksekusi terlebih dahulu
    
          secara gamblang, dapat dipahami kalau java akan mengeksekusi konstruktor dari 
          class yang hirarkinya lebih tinggi, baru turun ke yang lebih rendah. yakni 
          konstruktor milik Objek yang baru diinisialisasi
    
          pemanggilan konstruktor yang berantai seperti ini disebut dengan Constructor Chaining
    
          _____+++++++______
          
          Pemanggilan konstruktor tanpa proses instansiasi yaitu dengan menggunakan kata kunci "new".
          contoh : 
          class C extends Bhe{
            public C(){
                sout("Konstruktor default C");
            }
            new C();
          }
          
          class Bhe{
            public Bhe(){
            sout("Konstruktor default Bhe);
            }
          }
    
          SEBUAH STATIC METHOD
          TIDAK bisa dioverriding. tapi bisa di hide.
    
          ketika sebuah overload method dipanggil di salah satu kelas yg inheritance,
          yang diapnggil adalah method yang lebih cocok dengan argument yang dilewatkan.
    
          misal
          void Hitung(int a){
            a += 10;
          }
          void Hitung(double a){
            a += 100;
          }
    
          //dipanggil 
    
          Hitung(10);
    
          // maka yang terpanggil adalah yg berparameter int
    
          // dipanggil
    
            Hitung(10.0);
    
          // maka yang dipanggil adalah yg berparameter double
    */
    
}
