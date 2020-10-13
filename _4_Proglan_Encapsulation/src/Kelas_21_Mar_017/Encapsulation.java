package Kelas_21_Mar_017;

public class Encapsulation extends Time2{
    public static void main(String[] args) {
        Time2 S = new Time2(12,30,00);
        System.out.println(S.getHour() + " : " + S.getMin() +" : "+ S.getSec());
        
    }
    
}
    class Time2{
        static int H;
        static int M;
        static int S;
        
        public Time2(int H, int M, int S){
        setTime(H,M,S);
        }
        
        public Time2(){
        this(0,0,0);
        }
        
        private void setTime(int H, int M, int S){
            setHour(H);
            setMin(M);
            setSec(S);
        }
        
        private void setHour(int H){
        this.H = H;
        }
    
        private void setMin(int M){
        this.M = M;
        }
    
        private void setSec(int S){
        this.S = S;
        }
    
        public int getHour(){
        return this.H;
        }
    
        public int getMin(){
        return this.M;
        }
    
        public int getSec(){
        return this.S;
        }
    
    }
     

