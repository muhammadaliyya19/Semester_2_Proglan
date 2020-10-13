package BAB_1_Materi_OOP_PERPUS;

public class Lat {
    int rad;
    public static void main(String[]args){
    
    Lat tes1 = new Lat();
    Lat tes2 = new Lat();
    
    tes1.rad = 10;
    tes2.rad = 100;
    
    tes1 = tes2;
    
    tes1.rad = 50;
    tes1.rad = 1000;
    
        System.out.println(tes1.rad);
    
    
    
    }
}
