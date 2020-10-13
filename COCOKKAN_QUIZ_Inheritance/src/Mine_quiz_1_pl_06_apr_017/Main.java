package Mine_quiz_1_pl_06_apr_017;

public class Main {
    public static void main(String[] args) {
        Binatang [] b = new Binatang [3];
        b [0] = new Binatang(200, 2, "Zebra", "Apel");
        b [1] = new Binatang(250, 2.1, "Kuda", "Tomat");
        b [2] = new Binatang(175, 2.3, "Singa", "Daging");
    
        for(int i = 0 ; i  < b.length ; i++){
            b[i].showHewan();
        }
        System.out.println("====----==^-^-^==----====");
        for(int i = 0 ; i  < b.length ; i++){
            b[i].t.showTanaman();
        }
        System.out.println("====----==^-^-^==----====");
        b[2].showjumHT();
        System.out.println("Terimakasih");
    }
}
