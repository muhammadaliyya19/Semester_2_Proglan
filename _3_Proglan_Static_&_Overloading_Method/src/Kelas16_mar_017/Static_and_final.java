package Kelas16_mar_017;

public class Static_and_final {
    
    /*
    ======== static modifier ========
    instansiasi dari suatu kelas akan mengcopy kan 
    semua atribut dari kelas tersebut di tiap tiap 
    objek yang telah di instansiasikan.
    
    satu static variabel didalam class akan digunakan bersama sama, artinya jika 
    sebuah objek mengubah nilai variabel. maka di objek yang lain juga ikut berubah.
    
    misal 
    mhs maha1 = new mhs();
    mhs maha2 = new mhs();
    
    maha1.nama = "Big";
    maha2.nama = "Bill";
    
    maka nama dari objek maha1 akan sama dgn maha2 yaitu Bill.
    
    ---Class Scope---
    - ketika variabel bertipe static maka variabel ini : 
        bisa diakses langsung dari kelas manapun (dalam package) 
        tanpa harus menginstansiasi objeknya,hal ini bisa dilakukan 
        selama variabel ini bermodifier public atau default.
   
        dengan cara : Nama_kelas.[variabel atau method].
    
    - sebuah variabel bermodifier private static tidak dapat diakses
        secara langsung, namun harus melalui method set - get. atau mutator dan
        accessor
    
    ---   ---   ---   ---
    
    variabel, method ataupun apapun yang bermodifier static 
    hanya dapat dipanggil di method yang juga static
    
    ---   ---   ---   ---
    
    ---Static class member---
    Static Fields
    - juga dikenal sebagai class variable, karena seberapa banyakpun objek yang dibuat
    maka variabel ini nilainya tetap sama antara satu objek dengan yang lain.
    
    ==============FINAL dan Finalize================
    garbage Collector
    finalize
    berperan ketika sebuah variabel tidak lagi digunakan.maka variabel ini akan dihapus
    sehingga memori  yang digunakan menjadi bertambah besar, dan program lebih entheng.
    
    final digunakan agar variabel tidak dapat diubah. / jadi KONSTANTA
    
    =====PACKAGE========
    -mengorganisasi komponen aplikasi.
    -fasilitas software reuse, dg cara import kelas dari paket lain
    -menyediakan nama kelas yang uik untuk menghindari tabrakan kesamaan nama.
    
    
    */
    
}
