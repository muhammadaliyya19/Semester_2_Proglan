package Kelas_14Maret017;

public class Visibility_modifier {
    //=======================================================================
    /*
                VISIBILITY MODIFIER
    - public
      membuat method dan field sebuah class dapat diakses dari semua kelas yang ada baik dalam package maupun diluar.
    
    - private
      membuat method dan field sebuah kelas hanya dapat diakses dari kelas dimana ia berada.
    
    - default (tanpa public / private)
      membuat method dan field hanya dapat diakses dari semua kelas yang ada dalam package yang sama
      atau kita sebut diantara public dan private.
    
    */
    //=======================================================================
    /*
            IMMUTABLE OBJECT AND CLASS
    jika konten dari objek tdk dapat diubah ketika suatu objek dibuat instance nya , 
    objek itu disebut immutable object dan class nya disebut immutable class
    
    jadi jika ada variable ber modifier private, tapi tidak ada method modifier public 
    untuk mengubah variable tadi.. maka class ini disebut immutable 
    
    jika semua variable bermodifier private, dan tanpa mutator tetapi class tersebut mutable
    
    immutable class = sebuah class dengan field bermodifier private tanpa ada method yang dapat untuk mengubah nila field class ini.
    
    */
    //=======================================================================
    /*
    method set___(void) bertindak sebagai **** Mutators **** atau penyetel nilai variabel
    sedangkan method get__ (return value) bertindak sebagai ** Accessor ** atau pengakses / pengambil nilai dari variabel
    */
    //=======================================================================
}
