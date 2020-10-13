package Kelas_23_Mar_017;

public class ArrayList {
    public static void main(String[] args) {
        String [] nama = {"Mbuud","Geov","Jim"};
        Mhs [] m = new Mhs[3];
        
        for(int i = 0 ; i < 3 ; i++){
            m[i] = new Mhs();
            m[i].Nama = nama[i];
        }
        
        Integer [] a = {1,2,3};
        
        //ArrayList<Integer> aList = new ArrayList<Integer>();
        for(Integer i : a){
          //  aList.add(i);
        }
    
    
    }
    
}
