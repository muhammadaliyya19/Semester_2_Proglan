package quiz_1_pl_06_apr_017;

public class Binatang {
    public double Bb;
    public double Tp;
    public double BMI;
    public String Nama;
    public Tanaman t;
    public static int jumHewan = 0 ;
    
    public Binatang(){}
    
    public Binatang(double Bb, double Tp, String Nama, String Makan){
        this.Bb = Bb;
        this.Tp = Tp;
        this.Nama = Nama;
        t = new Tanaman(Makan);
        setBMI();
        jumHewan++;
    }
    
    public void setBMI(){
        BMI = Bb / Tp;
    }
    
    public double getBMI(){
        return BMI;
    }
    
    public void showHewan(){
        System.out.println(Nama + " Sedang makan" + t.Nama);
        System.out.println(Nama + " Memiliki BMI : " + BMI);
    }
    
    public void showjumHT(){
        System.out.println("Jumlah Hewan Di Kebun Binatang = " + jumHewan);
        t.showJum();
    }
}
