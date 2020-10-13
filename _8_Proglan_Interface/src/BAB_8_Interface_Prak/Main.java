package BAB_8_Interface_Prak;

public class Main {
    public static void main(String[] args) {
        Employee employees = new  Employee("Ilmi", 165150050, 750000);
            employees.Beli();
            System.out.println("---- === --- Data Tagihan Pegawai --- === ----");
            employees.showBills_and_Salary();
    }
}
