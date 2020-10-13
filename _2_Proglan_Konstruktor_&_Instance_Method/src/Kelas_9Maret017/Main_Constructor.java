package Kelas_9Maret017;

public class Main_Constructor {
    public static void main(String[] args) {
        Constructor mhs1 = new Constructor("Muhammad Aliyya Ilmi", "165150200111050", "Laki - laki");
        Constructor mhs2 = new Constructor("Jl. Gajayana Gg. 4 no. 645 Malang");
        //Constructor mhs3 = new Constructor();
        mhs1.Show();
        System.out.println("Alamat \t\t= " + mhs2.getAlamat());
        
    }
}
