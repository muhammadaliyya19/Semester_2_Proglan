/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ilmi
 */
public class Main {
    public static void main(String[] args) {
        Dos_PNS [] PNS = new Dos_PNS[5];
        Dos_non_PNS [] NonPNS = new Dos_non_PNS[5];
        Mahasiswa [] mhs = new Mahasiswa[5];
        
        PNS[0] = new Dos_PNS("Ilmi", "Laki - laki", "Kediri", "Sawojajar", "165150200111050", "4A", 3000000);
        PNS[1] = new Dos_PNS("Sidia", "Perempuan", "Lamongan", "Batu", "165150211111050", "4C", 4000000);
        PNS[2] = new Dos_PNS("Rif", "Laki - laki", "Jogjakarta", "Bululawan", "165150200111050", "4B", 7000000);
        PNS[3] = new Dos_PNS("Lidia", "Perempuan", "Kanada", "Kandangan", "165150200100050", "3A", 2000000);
        PNS[4] = new Dos_PNS("Dia", "Laki - laki", "Pelosok", "Pucuk", "165150222111050", "3C", 4000000);
        
        NonPNS[0] = new Dos_non_PNS("Ubed", "Laki - laki", "Sragen", "Malang", "165150200111092", 2000000);
        NonPNS[1] = new Dos_non_PNS("Ubed", "Laki - laki", "Sragen", "Malang", "165150200111092", 2000000);
        NonPNS[2] = new Dos_non_PNS("Ubed", "Laki - laki", "Sragen", "Malang", "165150200111092", 2000000);
        NonPNS[3] = new Dos_non_PNS("Ubed", "Laki - laki", "Sragen", "Malang", "165150200111092", 2000000);
        NonPNS[4] = new Dos_non_PNS("Ubed", "Laki - laki", "Sragen", "Malang", "165150200111092", 2000000);
        
        mhs[0] = new Mahasiswa("Ilmi", "165150200111050", "Laki - laki", "Kediri");
        mhs[1] = new Mahasiswa("Deden", "165150200111052", "Laki - laki", "Kediri");
        mhs[2] = new Mahasiswa("Fian", "165150200111000", "Laki - laki", "Madiun");
        mhs[3] = new Mahasiswa("Ayaflu", "165150200121050", "Perempuan", "Malang");
        mhs[4] = new Mahasiswa("Tatan", "165150200211050", "Perempuan", "Klaten");
        
        MatKul [] Mat = new MatKul[5];
        Mat[0] =  new MatKul("CID123", "IMK", 3, 4);
        Mat[1] =  new MatKul("CID234", "AOK", 3, 5);
        Mat[2] =  new MatKul("PAI123", "Agama", 4, 2);
        Mat[3] =  new MatKul("MAT123", "Matkom", 2, 3);
        Mat[4] =  new MatKul("MAT124", "MatkomLanjut", 2, 3);
        
        for (int i = 0; i < PNS.length; i++) {
            PNS[i].Mengajar(Mat[i]);
            NonPNS[i].Mengajar(Mat[i]);
            mhs[i].Mengambil(Mat[i]);
        }
        
        System.out.println("=====================OPEN=====================");
        
        for (int i = 0; i < PNS.length; i++) {
                System.out.println("=====PNS ke - " + (i+1)+"=====");
            PNS[i].showIdentity();
            System.out.println("-----------");
            PNS[i].showMatkulDiajar();
            System.out.println("^^^^^^^^^^^");
        }
        
        System.out.println("=======================================================");
        
        for (int i = 0; i < NonPNS.length; i++) {
            System.out.println("=====Non-PNS ke - " + (i+1)+"=====");
            NonPNS[i].showIdentity();
            System.out.println("-----------");
            NonPNS[i].showMatkulDiajar();
            System.out.println("^^^^^^^^^^^");
        }
        
        System.out.println("=======================================================");
        
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("=====Mahasiswa ke - " + (i+1)+"=====");
            mhs[i].showMahasiswa();
            System.out.println("-----------");
            mhs[i].showMatkulDiambil();
            System.out.println("^^^^^^^^^^^");
        }
        
        
        
    }
}
