package BAB_1_Class_and_Object_Prak;

public class Main {
    
    public static void main(String[] args) {
        Bridge m1 = new Bridge();
        for(int i = 0 ; i < 7 ; i++){
        System.out.println("Kategori Buku \t : " + m1.mainKategori[i]);
        System.out.println("=============================");
            for(int j = 0 ; j < 5 ; j++){
                System.out.println("Judul \t : " + m1.getJudulBuku(i, j));
                System.out.println("Penulis\t : " + m1.getPenulis(i, j));
                System.out.println("Tahun \t : " + m1.getTahun(i, j));
                System.out.println();
            }
        System.out.println("=============================");
        }

    }
}
