package BAB_3_Proglan_Static_n_Overloading_Method_PRAK;

import java.util.ArrayList;

public class Main_Database {
    
    public static void main(String[] args) {
        
        Database d1 = new Database();
        String [] Para = d1.Para;
        
//INI NIH YANG BIKIN REPOT 1
        System.out.println("==========  Tanpa  Argumen  ==========");
        d1.get();
     
//INI NIH YANG BIKIN REPOT 2

        System.out.println();
        System.out.println("========== Dengan 1 Argumen ==========");
        d1.get("101");
        
//INI JUGA NIH YANG BIKIN REPOT 3

        System.out.println();
        System.out.println("========== Dengan 2 Argumen ==========");
        d1.get("GajiPokok", "2500");
        
//INI JUGA NIH YANG BIKIN REPOT 4
        System.out.println();
        System.out.println("========== Dengan 3 Argumen ==========");
        d1.get("GajiPokok","<", "2000");
    }
    
}
