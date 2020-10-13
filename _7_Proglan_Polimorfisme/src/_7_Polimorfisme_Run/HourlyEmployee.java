/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_Polimorfisme_Run;

public class HourlyEmployee extends Employee {
private double wage; //upah per jam
private double hours; //jumlah jam tiap minggu

    public HourlyEmployee(String name, String noKTP, double hourlyWage, double hoursWorked) {
        super(name, noKTP);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

public void setWage(double hourlyWage){
wage = hourlyWage;
}
public double getWage(){
return wage;
}
public void setHours(double hoursWorked){
hours = hoursWorked;
}
public double getHours(){
return hours;
}
public double earnings(){
if(getHours()<=40)
return getWage() * getHours();
else
return 40 * getWage() + ( getHours()-40) *
getWage() * 1.5;
}

public String toString(){
return String.format("Hourly employee: "+super.toString()+"\nhourly wage"+getWage()+"\nhours worked:"+getHours()+
                     "\nNow Month = " + (Present.getMonth()+1) + "\nEmployee month born = " + (Lahir.getMonth()) + "\n"+Surprise()+
                     "\nProduksi perusahaan minggu ini = " + jumlahBarang + "\nHarga barang produksi = " + hargaBarang+
                     "\nGaji borongan produksi barang = " + getGajiBorongan()+
                     "\nEarnings count for this week (7 days)= " + (earnings() * 7) + "\nMonthly earnings (4 weeks) = " + ((4*7*earnings()) + getBonusUltah() + getGajiBorongan()));
}

    @Override
    public void setUpahBoronganBarang(int jumlahBarang, double hargaBarang) {
        this.jumlahBarang = jumlahBarang;
        this.hargaBarang = hargaBarang;
    }

    @Override
    public double getGajiBorongan() {
        GajiBorongan = jumlahBarang * hargaBarang;
        return GajiBorongan;
    }
}