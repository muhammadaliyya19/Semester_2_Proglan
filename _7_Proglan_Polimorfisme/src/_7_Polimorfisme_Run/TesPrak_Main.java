package _7_Polimorfisme_Run;

public class TesPrak_Main {
    public static void main(String[] args) {
//    Employee c1 = new CommissionEmployee("Keanu", "145", 10000, 0.06);
//    c1.setTanggal(20, 5, 1990);
//    System.out.printf("%s\n%s: $%,.2f\n\n", c1, "pendapatan Mingguan: ",c1.earnings());
//    Employee h1 = new HourlyEmployee("Karina", "234", 16.75, 40);
//    h1.setTanggal(10, 10, 1997);
//    System.out.printf("%s\n%s: $%,.2f\n\n", h1, "pendapatan perjam: ", h1.earnings());
//    Employee b1 = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04,300);
//    b1.setTanggal(30, 4, 1996);
//    System.out.printf("%s\n%s: $%,.2f\n\n", b1, "earned", b1.earnings());
    Employee [] employe = new Employee[4];
    employe[0] = new PekerjaBorongan("One","1234");
    employe[0].setTanggal(20, 05, 1996);
    employe[0].setUpahBoronganBarang(100, 200);
    
    employe[1] = new PekerjaBorongan("Two","4567");
    employe[1].setTanggal(30, 02, 1990);
    employe[1].setUpahBoronganBarang(20, 100);
    
    employe[2] = new PekerjaBorongan("Three","6789");
    employe[2].setTanggal(10, 07, 1998);
    employe[2].setUpahBoronganBarang(50, 30);
    
    employe[3] = new PekerjaBorongan("Four","2435");
    employe[3].setUpahBoronganBarang(200, 40);
        for (int i = 0; i < employe.length; i++) {
            System.out.println("---------------------------------");
            System.out.println(employe[i]);
        }
    
    }
}
