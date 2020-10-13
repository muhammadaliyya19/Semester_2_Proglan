package _7_Polimorfisme_Prak;

public class Main {
    public static void main(String[] args) {
        Induk [] pemesan = new Induk[3];
        
        System.out.println("========== - - PREMIUM ORDER - - ==========");
        pemesan [0] = new Premium("Nana" , "165150201111090", "089789123654","Mana ya");
        pemesan [0].PesanAll(3, "Workday");
        System.out.println(pemesan[0]);
        pemesan [0].TampilkanInfo();
        
        System.out.println("========== - - MEMBER ORDER - - ==========");
        pemesan [1] = new Member("Ilmi", "165150200111050", "085784114468", "Kediri");
        pemesan [1].PesanAll(3, "Workday");
        System.out.println(pemesan[1]);
        pemesan [1].TampilkanInfo();
        
        System.out.println("========== - - NON - MEMBER ORDER - - ==========");
        pemesan [2] = new Non_Member("Rif" , "165150201111092", "085784114472", "Madiun");
        pemesan [2].PesanAll(1 , "Weekend");
        System.out.println(pemesan[2]);
        pemesan [2].TampilkanInfo();
        System.out.println("====----====--==========---------------==========--====----====");
    }
}
