/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_Polimorfisme_Run;

public class CommissionEmployee extends Employee {
private double grossSales;//penjualan per minggu
private double commissionRate;//komisi

    public CommissionEmployee(String name, String noKTP, double sales, double rate){
        super(name, noKTP);
        setGrossSales(sales);
        setCommissionRate(rate);
    }   
    
public void setGrossSales(double sales){
grossSales = sales;
}
public double getGrossSales(){
return grossSales;
}
public void setCommissionRate(double rate){
commissionRate = rate;
}
public double getCommissionRate(){
return commissionRate;
}
public double earnings(){
    return getCommissionRate()*getGrossSales();
}
public String toString(){
return String.format(
        "Commision employee:"+super.toString()+"\ngross sales: "+getGrossSales()+"\ncommission rate "+getCommissionRate()+
                     "\nNow Month = " + (Present.getMonth()+1) + "\nEmployee month born = " + (Lahir.getMonth()) + "\n"+Surprise()+
                     "\nProduksi perusahaan minggu ini = " + jumlahBarang + "\nHarga barang produksi = " + hargaBarang+
                     "\nGaji borongan produksi barang = " + getGajiBorongan()+
                     "\nEarnings count for this month \nMonthly earnings (4 weeks) = " + ((4*earnings()) + getBonusUltah()+getGajiBorongan()));
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