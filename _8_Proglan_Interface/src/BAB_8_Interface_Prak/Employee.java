package BAB_8_Interface_Prak;

import java.util.Scanner;
public class Employee implements Payable{
    String name;
    int regNumber;
    double payment;
    int salaryPerMonth;
    Invoice [] invoices;
    Scanner in = new Scanner(System.in);
    
    public Employee(){}
    
    public Employee(String name, int regNumber, int salaryPerMonth){
        this.name = name;
        this.regNumber = regNumber;
        this.salaryPerMonth = salaryPerMonth;
    }
    
    public void Beli(){
        System.out.println("---- === --- Pembelian Barang Koperasi --- === ----");
        System.out.print("Macam item : ");
        int macam = in.nextInt();
        invoices = new Invoice[macam];
        System.out.println("Masukkan detil pembelian : ");
        for (int i = 0; i < macam; i++) {
            System.out.print((i+1)+ ". Nama item   : ");
            String item = in.next(); in.nextLine();
            System.out.print("   Harga @item : ");
            int hargasatuan = in.nextInt();
            System.out.print("   Jumlah item : ");
            int jumlah = in.nextInt();
            invoices[i] = new Invoice(item, hargasatuan, jumlah);
            payment += invoices[i].getPayableAmount();
        }
    }
    
    public void showBills_and_Salary(){
        System.out.println(toString());
        for (int i = 0; i < invoices.length; i++) {
            System.out.println(invoices[i].toString(i + 1));
        }
        System.out.println("Employee bills\t\t  : " + payment);
        System.out.println("Employee take home pay\t  : " + getPayableAmount());
    }
    
    public String toString(){
        return String.format("Name\t\t : " + name + "\nReg. number\t : " + regNumber + "\nMonthly salary\t : " + salaryPerMonth
                            );
    }

    @Override
    public double getPayableAmount() {
        return (salaryPerMonth - payment);
    }
}
