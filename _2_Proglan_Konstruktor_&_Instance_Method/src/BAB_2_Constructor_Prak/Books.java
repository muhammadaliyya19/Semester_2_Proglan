package BAB_2_Constructor_Prak;

public class Books {
    int i , j;

    String [][] Bookz    = {};
    String []   Kategori = {};
    String [][] Penulis  = {};
    int    [][] Tahun    = {};
    
    public Books(String [][] Buku , String [][] Penulis, String [] Kategori, int [][] Tahun){
    this.Bookz = Buku;
    this.Penulis = Penulis;
    this.Kategori = Kategori;
    this.Tahun = Tahun;
        }

    public void cariJudul_Buku(String Judul){
        for(i = 0 ; i < 7 ; i++){
            for(j = 0 ; j < 5 ; j++ ){
                int count = 0 ;
                if(Bookz[i][j].contains(Judul)){
                    count++;
                    if(count == 1){
                        System.out.println("Judul \t\t : " + Bookz[i][j] + "\n"+
                                  "Penulis \t : " + Penulis[i][j] + "\n"+ 
                                  "Tahun \t\t : " +Tahun[i][j] + "\n"+
                                  "Kategori \t : " + Kategori[i]); 
                      
                        
                        System.out.println("---------- ----- ----------");}
                }
            }
        }
    }
    public void cariPenulis(String Penulis){
        for(i = 0 ; i < 7 ; i++){
            for(j = 0 ; j < 5 ; j++ ){
                int count = 0 ;
                if(this.Penulis[i][j].contains(Penulis)){
                    count++;
                    if(count == 1){
                        System.out.println("Judul \t\t : " + Bookz[i][j] + "\n"+
                                  "Penulis \t : " + this.Penulis[i][j] + "\n"+ 
                                  "Tahun \t\t : " +Tahun[i][j] + "\n"+
                                  "Kategori \t : " + Kategori[i]); 
                        System.out.println("---------- ----- ----------");}
                }
            }
        }
    }
    /*public void cariPenulis_Buku(String Writer){
        for(i = 0 ; i < 7 ; i++){
            for(j = 0 ; j < 5 ; j++ ){
                int count = 0 ;
                if(Penulis[i][j].contains(Writer)){
                    count++;
                    if(count == 1){
                        System.out.println("Judul \t\t : " + Bookz[i][j] + "\n"+
                                  "Penulis \t : " + Penulis[i][j] + "\n"+ 
                                  "Tahun \t\t : " +Tahun[i][j] + "\n"+
                                  "Kategori \t : " + Kategori[i]); 
                        System.out.println("---------- ----- ----------");
                    }
                }
            }
        }
    }
    */
    public void cariKategori(String Type){
        for(i = 0 ; i < 7 ; i++){
            if(Kategori[i].contains(Type)){
            System.out.println("Berikut Daftar Buku Kategori " + Kategori[i]);
                for(j = 0 ; j < 5 ; j++ ){
                    System.out.println("---------- ----- ----------");
                    System.out.println("Judul \t : " + Bookz[i][j]);
                    System.out.println("Penulis\t : " + Penulis[i][j]);
                    System.out.println("Tahun \t : " + Tahun[i][j]);
                    System.out.println();
                }
            }
        }
    }

    public void showAll(){
        for(i = 0 ; i < 7 ; i++){
            System.out.println("Kategori Buku \t : " + Kategori[i]);
            System.out.println("=============================");
            for(j = 0 ; j < 5 ; j++){
                System.out.println("Judul \t : " + Bookz[i][j]);
                System.out.println("Penulis\t : " + Penulis[i][j]);
                System.out.println("Tahun \t : " + Tahun[i][j]);
                System.out.println();
            }
            System.out.println("=============================");
        }
    }
}