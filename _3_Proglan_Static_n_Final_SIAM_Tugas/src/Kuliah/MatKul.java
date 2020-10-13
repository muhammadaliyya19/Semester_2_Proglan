package Kuliah;

public class MatKul {
    public Ruang Rug1;
    public int MatkulDiambil = 0;
    String MatkulDipilih;
    String KodeMatkul;
    int SKSMatkul;
    public static final String Kode[] =   {"MPK4001"  , "COM60011" , "MPK4007",
                              "UBU4008"  , "CID62122" , "COM50012",
                              "CID62121" , "COM60010" , "CID62120",
                              "COM60013" , "CIF60113" , "CID62125"};
    public static final String Matkul[] = {"Agama Islam" , "Arsitektur & Organisasi Komputer" , "Bahasa Indonesia",
                              "Bahasa Inggris" , "Interaksi Manusia & Komputer" , "Matematika Komputasi",
                              "Matematika Komputasi Lanjut" , "Pemrograman Dasar" , "Pemrograman Lanjut",
                              "Pengantar Ilmu Komputer" , "Sistem Digital" , "Statistika"};
    public static final int SKS[] = { 2 , 3 , 2 ,
                         2 , 3 , 4 ,
                         4 , 5 , 5 ,
                         3 , 3 , 3  };
    
    public MatKul(int ke, int pil, int ged ){
        setMatKul(ke , pil , ged);
    }
    
    public void setMatKul(int ke , int pilih, int ged){
        MatkulDipilih = Matkul[pilih-1];
        KodeMatkul = Kode[pilih-1];
        SKSMatkul = SKS[pilih-1];
        Rug1 = new Ruang(ged);
        MatkulDiambil++;
    }
    
    public String getMatkul(){
    return MatkulDipilih;
    }
    
    public String getKode(){
    return KodeMatkul;
    }
    
    public int getSKS(){
    return SKSMatkul;
    }
    
}
