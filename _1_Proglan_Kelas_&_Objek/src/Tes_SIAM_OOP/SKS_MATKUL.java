package Tes_SIAM_OOP;

public class SKS_MATKUL {
    Mhs Mahasiswa;
    Dosen dosen; 
    
    
    int [] SKS= {};
    String [] Matkul = {};
    
    int getSKS(int i){
    return SKS[i-1];
    }
    
    String getMatkul(int i){
    return Matkul[i];
    }

    public void ShowAll(){
        System.out.println(Mahasiswa.getNamaMhs() + " NIM " + Mahasiswa.getNIM() + "\n" + "Mengambil Mata Kuliah : ");
        for(int i = 0 ; i < 4 ; i++){
            System.out.println(Matkul[i] + "Jumlah SKS \t: " + SKS[i]);
        }
    }
}
