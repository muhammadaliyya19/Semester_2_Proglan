package BAB_6_Class_P_Furqon;

public class _1_Inheritance_25_Apr_017 {
    /*
    ----====----Inheritance / Pewarisan----====----
    
    Salah satu bagian dari konsep OOP
    
    Java Mendukung konsep software reuseability
    atrinya Java mendukung penggunaan ulang suatu karakteristik
    contohnya pada konsep Inheritance, yang mampu menurunkan karakteristik
    yang dapat dipakai oleh SubClass subClass nya.
    
    Kelas Yang Mewariskan Karakteristiknya disebut
        - Parent Class
        - Super Class
        - Base Class
    Kelas yang diwarisi disebut
        - Child Class
        - subClass
        - extended class
        - derived class
        **Note : Child class akan mendapat warisan hampir seluruh variabel, 
                 dan method dari parent Class nya.
                 Yang tidak diwariskan : 
                    - 
    Keuntungan Inheritance / Pewarisan
        - Tidak perlu mendeklarasikan ulang method yang fungsinya sama.
          karena secara, kita dapat menurunkan / mewariskan method tersebut 
          dari kelas yang satu ke yang lain.
        - Pada konsepnya kita hanya menspesifikkan child class nya. 
          karena variabel^2 yg umum telah diturunkan dari class Parent nya
    
    // -----=====-----=====----- //
        Class Object
    Hirarki Class object terletak diatas Parent Class
    secara implisit, seluruh class yang kita buat di java merupakan turunan dari class Object
    // -----=====-----=====----- //
    
    modifier acces Protected memberi hak akses sampai ke tingkat subClass.
    yang artinya variabel yang dideklarasikan dengan acces modifier protected dapat diwariskan hingga ke turunannya.
    hampir semua member / variabel^2 dan method^2 dari parent class akan diwariskan. 
    kecuali ketika method / variabel dideklarasikan dengan modifier private.
    
    constructor tidaklah termasuk member dari sebuah class, constructor tidak diturunkan ke child class
    karena constructor bukanlah method.
    
    Pemanggilan constructor dari Superclass atau parent class dengan cara / kata kunci
    
    ----super----
    
    super reference adalah kata kunci yang dapat digunakan untuk memanggil dari superclass / parent class nya.
    super harus dideklarasikan pada baris pertama dalam constructor dari child class nya.
    
    //^^^^ kasus Private member dalam superClass / parent ^^^^//
    private member tidaklah diturunkan ke child class nya.
    untuk mengaksesnya perlu setter dan getter.
    
    //^^ Kasus Nested Class ^^//
    nested class memiliki akses ke method^2 dan variabel^2 yang bermodifier private dari class dimana ia bersarang
    
    // ^^^ Menspesifikkan Class child ^^^ //
    kita dapat membuat method^2 yang lebih spesifik di tiap subClass / child class
    
        terkait overLoading, 
    
    signature dari tiap method harus berbeda.
    signature = ciri khas --- > Parameter.
    pembeda nya --- > jumlah variabel, tipe data variabel.
    
        **** Terkait Method Didalam Subclass & Overriding ****
    
    Kita dapat membuat method yang signature nya sama persis dengan method yang dimiliki oleh parent class.
    jadi jika sebuah method di parent class dideklarasikan ulang didalam 
    subClass dengan signature yang sama persis hal ini dapat dilakukan. dan hal ini disebut dengan 
    @overriding.
    
    overidding method menyebabkan child class mengeksekusi method yang dideklarasikan di dalam childclass tersebut.
    tidak lagi merujuk ke method dalam parent classnya.
    
    ^^^^ Hiding ^^^^
    
    jika ada dua method yang sama dari super class dan sub class yang sama - sama bermodifier static.
    maka method yang ada di parent class seolah^2 disembunyikan. sehingga yang dieksekusi adalah method yang ada di sub class.
    perbedaan dengan Overiding adalah : 
        - dalam overriding, jika method yang ter override dipanggil, baik itu di parentClass ataupun di subClass
          yang terpanggil adalah method yang ada di SubClass.
        - dalam Hiding, jika kita memanggil method di parent class, 
          maka yang terpanggil adalah method yang dimiliki parent class tersebut.
    
    */
}
