package BAB_2_Constructor_Prak;

import java.util.Scanner;

public class Main {
    static String [][] Buku =  {{"Pendidikan Agama Islam", "Agama Hindu dan Budha", "Pendidikan Agama Khonghucu dan Budi Pekerti SD","Merajut Rumah Tangga Bahagia","Meneladani Akhlak Rasul dan Para Sahabat" },
                         {"A Cold Dark Place","Journey of Love","Mahligai Cinta Firdaus","57 Detik","Mengapung Bersama Nil"},
                         {"Berfilsafat Politik","Perjumpaan Dalam Dimensi Ketuhanan","Pemahaman sampai dengan Perdamaian Dunia","Filsafat Ilmu","Filsafat Ilmu"},
                         {"Pengantar Ilmu Politik","Perkembangan Ilmu Politik di Indonesia","Sistem Politik Indonesia","Islam dan Pembangunan Politik di Indonesia","Pembimbing Ke Ilmu Politik"},
                         {"Biopsikologi (Edisi Ketujuh)","Bimbingan Konseling","Asas-Asas Penelitian Behavioral ","Analisis Tulisan Tangan","Agenda Psikologi Islami"},
                         {"Runtuhnya Kerajaan - kerajaan Islam di Nusantara","Indonesia Images from The Past","Pengantar Sejarah Sebagai Ilmu","Ide Anak  Bali pada Abad XIX","Sejarah Lokal di Indonesia"},
                         {"Pengantar Teknoligi Pangan", "Dasar Teknik Digital", "Elektronik Industri","Kelistrikan Industri", "Beton non Pasir"}};
    static String []   Kategori = {"Agama",
                            "Fiksi",
                            "Filsafat",
                            "Politik",
                            "Psikologi",
                            "Sejarah",
                            "Teknologi"};
    static String [][] Penulis  = {{"Dr. Deden Makbuloh, M. Ag." , "Dr. Harun Hadiwijono","Yunnita Gunawan dan Lanny Guito","A. Fatih Syuhud","A. Fatih Syuhud"},
                                   {"Gregg Olsen","Emmylia Hannig","Moon el-Faqir","Ken Tarate","Arif Friyadi"},
                                   {"E. Armada Riyanto","Margaretha Paulus","Reza A.A Wattimena","Dr. Cecep Sumarna","DR. Amsal Bakhtiar, M.A."},
                                   {"F. Isjwara","Miriam Budiardjo, Maswadi Rauf","Sukana","Alamsyah ratu Perwira Negara","S.M. Abidin"},
                                   {"John P.J. Pinel","Fenti Hikmawati","Fred N. Kerlinger","Karen K. Amend, Mary S. Ruiz","H Fuad Nashori"},
                                   {"Slamet Muljana","Demenni Jean","Sidi Gazalba","Agung Gede","Taufik Abdullah"},
                                   {"F. G. Winarno" , "Pernantin Tarigan" , "Frank D. Petruzella" , "Irwan Iftadi" , "Diarto Trisnoyuwono, S.T., M.T."}};
    static int [][] Tahun       = {{2012,2006,2000,1999,2014},
                            {2009,2009,2009,2009,2009},
                            {2016,2006,2006,2008,2005},
                            {2000,2003,2010,2011,2002},
                            {1999,2001,2009,2011,2016},
                            {2005,1987,1996,1989,2010},
                            {2000,2012,2009,2015,2016}};
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Bridge j1 = new Bridge(Buku, Penulis, Kategori, Tahun);
        String Jud, Kat, Pen;
        int pil;
        
        do{
        System.out.println("======  Perpustakaan eX  ======");
        System.out.println("\t 1. Tampilkan Semua Koleksi Buku \n"+
                           "\t 2. Pencarian Buku Berdasar Judul \n"+
                           "\t 3. Pencarian Buku Berdasar Kategori \n"+
                           "\t 4. Pencarian Buku Berdasar Penulis \n"+
                           "\t 5. Hentikan Program");
        System.out.print("Silakan Pilih Operasi : ");
        pil = in.nextInt();
            switch (pil){
                case 1 : {j1.b1.showAll();
                          break;
                         }
                case 2 : {System.out.print("Silakan Masukkan Judul Buku : ");
                          Jud = in.next(); in.nextLine();
                          j1.b1.cariJudul_Buku(Jud);
                          break;
                          }
                case 3 : {System.out.print("Silakan Masukkan Kategori Buku : "); 
                          Kat = in.next(); in.nextLine();
                          j1.b1.cariKategori(Kat);
                          break;
                          }
                case 4 : {System.out.print("Silakan Masukkan Penulis Buku : ");
                          Pen = in.next(); in.nextLine(); 
                          j1.b1.cariPenulis(Pen);
                          break;
                          }
                default : {System.out.println("Program Dihentikan.");
                          break;
                          }
            }
        }while(pil<5 && pil > 0);
    }
}