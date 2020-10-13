package Tes_SIAM_OOP;

public class SIAM_Main_ {
    public static void main(String[]args){
    Mhs mhs1 = new Mhs();
    Dosen dos1 = new Dosen();
    SKS_MATKUL ambil1 = new SKS_MATKUL();
    
    Mhs mhs2 = new Mhs();
    Dosen dos2 = new Dosen();
    SKS_MATKUL ambil2 = new SKS_MATKUL();
    
    ambil1.dosen = dos1;
    ambil1.Mahasiswa = mhs1;
    //ambil1.Matkul[0] = "AOK";
    
    ambil2.dosen = dos2;
    ambil2.Mahasiswa = mhs2;
    
    dos1.nama = "Bpk. Tanzil Furqon";
    dos1.pengampu = "ProgLan";
    dos1.Ruang = "A.1.6.3";
    
    dos2.nama = "Bpk. Arif Rahman";
    dos2.pengampu = "MatLan";
    dos2.Ruang = "E.1.6.3";
    
    mhs1.namaMhs = "Muhammad Aliyya Ilmi";
    mhs1.NIM = "165150200111050";
    
    mhs2.namaMhs = "Ma'ruf R. F.";
    mhs2.NIM = "165150201111053";
    
    //int i;
        
        System.out.println("Mahasiswa dengan nama " + mhs1.getNamaMhs() + "\n" + "Mengambil Matkul : " 
        +ambil1.dosen.getPengampuMatkul() + "\n" +"Dibimbing Oleh " + ambil1.dosen.getNamaDosen());
        System.out.println();
        System.out.println("Mahasiswa dengan nama " + mhs2.getNamaMhs() + "\n" + "Mengambil Matkul : " 
        +dos2.getPengampuMatkul() + "\n" + "Dibimbing Oleh " +dos2.getNamaDosen());
        
        //System.out.println(ambil1.getMatkul(0) + " ");
    }
    
}
