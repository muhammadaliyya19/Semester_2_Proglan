package Judgement;

public class Test {
    static int g;
    public static void main(String[] args) {
        int kg = 1;
        setToGram(kg);
        System.out.println(g);
                
    }
    public static void setToGram(int kg){
    g = kg*1000;
    }
    
    
}
