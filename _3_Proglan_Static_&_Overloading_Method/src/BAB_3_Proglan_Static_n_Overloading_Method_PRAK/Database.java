package BAB_3_Proglan_Static_n_Overloading_Method_PRAK;

import java.util.ArrayList;
public class Database {
    public int i, j, k;
    public static final String [] Para = {
        "ID \t\t : ","Nama \t\t : ","GajiPokok \t : ","Tunjangan \t : ","Bonus \t\t : ","Denda  \t\t : "};
    
    public static final String [][] Data = {
        {"101" , "Paijo" , "2000" , "1000" , "500" , "200"},
        {"102" , "Lala"  , "1750" , "900"  , "500" , "200"},
        {"103" , "Lulu"  , "2150" , "1000" , "300" , "375"},
        {"104" , "Sabar" , "1500" , "750"  , "600" , "200"},
        {"105" , "Sule"  , "2500" , "850"  , "500" , "300"}};
    
    public static final int [][] Uang = {
        {2000 , 1000 , 500 , 200},
        {1750 , 900  , 500 , 200},
        {2150 , 1000 , 300 , 375},
        {1500 , 750  , 600 , 200},
        {2500 , 850  , 500 , 300}
    };
    
    //Additional
    
    public static void ShowPilihan(int clmn){
        for(int j = 0 ; j < 6 ; j++){
                System.out.println(Para[j] + Data[clmn][j]);
        }
    System.out.println("===== # # # ==== ^^^^ ==== # # # =====");
    }
    
    ///NIH 1 !
    
    public static void get(){
        for(int j = 0 ; j < 5 ; j++){
            ShowPilihan(j);
        }
    }
    
    ///NIH 2 !
    
    public void get(String id){
        for(i = 0 ; i < 5 ; i++){
            if(Data[i][0].equals(id)){
                ShowPilihan(i);
            }
        }
    }
    ///NIH 3 !
    
    public void get(String columnName , String value){
        for(i = 0 ; i < 6 ; i++){
            if(Para[i].contains(columnName)){
                for(j = 0 ; j < 5 ; j++){
                    if(Data[j][i].equals(value)){
                        ShowPilihan(j);
                    }
                }
            }
        }
    }
    
    //NIH 4 !
    public void get(String columnName , String Operator, String value){
        int val = Integer.parseInt(value);
        for(i = 0 ; i < 6 ; i++){
            if(Para[i].contains(columnName)){
                Seleksi(Operator, (i-2) , val );
            }
        }
    }
    
    public void Seleksi(String opt, int clmn, int value){
        if(opt.equals("<=")){
            for(j = 0 ; j < 5 ; j++){
                if(Uang[j][clmn]<=value){
                        ShowPilihan(j);
                }
            }
        }
        else if(opt.equals(">=")){
            for(j = 0 ; j < 5 ; j++){
                if(Uang[j][clmn]>=value){
                        ShowPilihan(j);
                }
            }
        }
        else if(opt.equals("<")){
            for(j = 0 ; j < 5 ; j++){
                if(Uang[j][clmn]<value){
                        ShowPilihan(j);
                }
            }
        }
        else{
            for(j = 0 ; j < 5 ; j++){
                if(Uang[j][clmn]>value){
                        ShowPilihan(j);
                }
            }
        }
    }
}
