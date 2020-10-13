package BAB_6_Inheritance_Prak;

public class Main {
    public static void main(String[] args) {
       Pegawai p1 = new Pegawai();
       Pegawai p2 = new Pegawai("Rif", "165150092", 2010, 3000000, "Tidak berkeluarga", 0);
       Pegawai p3 = new Pegawai("Bachmid", "165150200", 2005, 3000000, "Berkeluarga", 5);
       Manager m1 = new Manager("Ros", "165150201", 2009, 4000000, "Tidak Berkeluarga", 0);
       Manager m2 = new Manager("Inas", "165150111", 2014, 4000000, "Berkeluarga", 2);
       Sales s1 = new Sales("Sale", "165150207", 2012, 2000000, "Berkeluarga", 4, 25000, 100, 50);
       Sales s2 = new Sales("Lase", "165150102", 2014, 2000000, "Berkeluarga", 1, 10000, 250, 220);
       Programmer f1 = new Programmer("Big", "155150200", 2011, 2500000, "Tidak Berkeluarga", 0, 10);
       Programmer f2 = new Programmer("Gib", "135150200", 2013, 2500000, "Tidak Berkeluarga", 0, 12);
        System.out.println("1. ====----====^^=^^====----====");
       p1.ShowAllInfo();
        System.out.println("2. ====----====^^=^^====----====");
       p2.ShowAllInfo();
        System.out.println("3. ====----====^^=^^====----====");
       p3.ShowAllInfo();
        System.out.println("4. ====----====^^=^^====----====");
       m1.ShowAllInfo();
       System.out.println("5. ====----====^^=^^====----====");
       m2.ShowAllInfo();
        System.out.println("6. ====----====^^=^^====----====");
       s1.ShowAllInfo();
        System.out.println("7. ====----====^^=^^====----====");
       s2.ShowAllInfo();
        System.out.println("8. ====----====^^=^^====----====");
       f1.ShowAllInfo();
        System.out.println("9. ====----====^^=^^====----====");
       f2.ShowAllInfo();
        System.out.println("====----====^^=^^====----====");
    }
}
