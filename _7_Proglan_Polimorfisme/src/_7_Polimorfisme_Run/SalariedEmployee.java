package _7_Polimorfisme_Run;

public class SalariedEmployee extends Employee {
private double weeklySalary; //gaji/minggu
    
    public SalariedEmployee(String name, String noKTP, double salary) {
        super(name, noKTP);
        setWeeklySalary(salary);
    }
    
    
public void setWeeklySalary(double salary) {
weeklySalary = salary;
}
public double getWeeklySalary() {
return weeklySalary;
}
public double earnings() {
return getWeeklySalary();
}
public String toString() {
return String.format("Salaried employee: " + super.toString() + "\nweekly salary:" + getWeeklySalary()+
        "\nNow Month = " + (Present.getMonth()+1) + "\nEmployee month born = " + (Lahir.getMonth()) + "\n"+Surprise()+
                     "\nEarnings count for this month \nMonthly earnings (4 weeks) = " + (4 * getWeeklySalary()+getBonusUltah()));
}

    @Override
    public void setUpahBoronganBarang(int jumlahBarang, double hargaBarang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getGajiBorongan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    
