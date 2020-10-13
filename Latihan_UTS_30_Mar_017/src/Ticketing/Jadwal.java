package Ticketing;

public class Jadwal {
    Pesawat p = new Pesawat();
    String [] para = {"\tNo.\t" , "||  Flight\t||" , "  Gate  " , "||  Remark  \n"};
    
    String [] Gate = {"   1A  ","   1C  ","   2A  ","   3A  ","   1B  ",
                      "   2B  ","   3B  ","   2C  ","   3C  ","   1D  "};
    
    String [] Remark = {"Check in open","Delay","Delay","To waiting room","Delay",
                        "Check in open","Delay","To waiting room","Delay","Check in open"};
    
    public void showJadwal(){
        for(int i = 0 ; i < 4 ; i++){
            System.out.print(para[i]);
        }
        for(int j = 0 ; j < 10 ; j++){
            System.out.println("\t"+(j+1) + "\t||  "+p.getMaskapai(j)+"\t||"+Gate[j] +" ||  "+ Remark[j]);
        }
    }
    
}
