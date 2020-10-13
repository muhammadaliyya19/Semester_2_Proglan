package Kelas_23_Mar_017;

public class Array_of_Object {
    /*
    mirip dengan array biasa.
    namun yang disimpan adalah Sebuah OBJEK yang punya berbagai atribut sendiri - sendiri.
    misal
    
    Mahasiswa [] Mhs = new Mahasiswa[9];
    
    misal diakses Mahasiswa[0].nama;
    
    maka akan error, karena Mahasiswa[0] 
    ==**** belum berupa objek yang sudah diinstansiasikan ****==
    
    maka ---> harus diinstansiasi dulu.. seperti : 
    
    Mhs[0] = new Mahasiswa();
    
    sehingga Array Objek Mhs[0] sudah diinstansiasikan 
    dan bisa diinisialisasi tiap atributnya.
    
    ==== loop ====
    
    for - each 
    for - each akan mengeksekusi semua indeks array.
    
    sedangkan for biasa, dapat kita gunakan untuk mengeksekusi
    array pada indeks tertentu.
    
    class Student{
    int marx;
    }
    //for each
    for(Student x : studentArray){
    x.marx = in.nextInt();
    }
    
    loop diatas akan mengulang sebanyak Panjang dari array studentArray
    'x' merepresentasikan tiap elemen dari studentArray ==urut dari indeks ke-[0]==
    'x' bertipe Student sehingga memiliki variabel "marx" yang bisa diakses
    
    contoh : 
    psvm{
    Student [] SArray = new Student[7];
    SArray [0] = new Student();
    SArray.marx = 10;
    modify(SArray[0])
    }    
    
    static void modify(Studennt x){
    x.marx = 100;
    }
            ==============================
           ||                           ||
            ####==== ARRAY__LIST ====####
           ||                           ||
            ==============================
    
    element nya dinamis. pada awalnya dimensi dan ukurannya nol.
    dan selama kita mengkode dapat kita ubah ubah ukurannya.
    seperti menghapus elemen, menambah element.
    
    elemennya bertipe objek.
    
    dengan method : - add
                    - toString
                    - remove
    kita dapat membuat arraylist yang menyimpan data bertipe primitive 
    tapi bukan sejatinya primitive, kode : ArrayList<Integer>
    Integer diatas berupa reference.
    contoh
    Number [] numbers = {1,2,3,4,5,6};
    
    ArrayList<Number> numberList = new ArrayList<Number>();
    // diatas, isinya kosong.
    // isinya dapat dimasukkan dgn for - each
    
    for(Number element : numbers){
    numberList.add(element); \\ menambahkan data array 'numbers' indeks ke - [element] ke ArrayList "numberList"
    }
    misal menghapus data :
    numberList.remove(i); \\ i adalah indeks numberList ke - [i]
    
    
    
    
    

    
    */
    
    
    
    
    
    
    
    
    
}
