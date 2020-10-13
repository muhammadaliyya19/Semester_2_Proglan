package Test;

import Mhs.MHS;
import Kuliah.MatKul;
import Kuliah.Ruang;

public class Main {
    public static void main(String[] args) {
        MHS Mhs1 = new MHS("Muhammad Aliyya Ilmi","165150200111050","Laki - laki");
        MHS Mhs2 = new MHS("Lukman Hakim W." , "165150201111088" , "Laki - laki");
        MHS Mhs3 = new MHS("Rosa Nur Madinah" , "165150201111084" , "Perempuan");
        
        Mhs1.showSelf();
        Mhs1.Perkuliahan(1,1,1);
        Mhs1.showKuliah();
        Mhs1.Perkuliahan(2, 2, 2);
        Mhs1.showKuliah();
        Mhs1.Perkuliahan(4, 4, 2);
        Mhs1.showKuliah();
        Mhs1.Perkuliahan(7, 3, 1);
        Mhs1.showKuliah();
        System.out.println("Total Matkul semester ini : " + Mhs1.getJumKuliah() );
        System.out.println("Total SKS semester ini : " + Mhs1.getJumSKS());
        
        System.out.println("\n#### *******  ========================  ******* ####\n");
        
        Mhs2.showSelf();
        Mhs2.Perkuliahan(1,4,1);        
        Mhs2.showKuliah();
        Mhs2.Perkuliahan(2, 3, 2);
        Mhs2.showKuliah();
        System.out.println("Total Matkul semester ini : " + Mhs2.getJumKuliah() );
        System.out.println("Total SKS semester ini : " + Mhs2.getJumSKS());
        
        System.out.println("\n#### *******  ========================  ******* ####\n");
        
        Mhs3.showSelf();
        Mhs3.Perkuliahan(2,4,1);        
        Mhs3.showKuliah();
        Mhs3.Perkuliahan(3, 3, 2);
        Mhs3.showKuliah();
        Mhs3.Perkuliahan(4, 3, 2);
        Mhs3.showKuliah();
        System.out.println("Total Matkul semester ini : " + Mhs3.getJumKuliah() );
        System.out.println("Total SKS semester ini : " + Mhs3.getJumSKS());
        
    }
    
}
