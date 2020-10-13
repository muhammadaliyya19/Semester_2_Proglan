/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_Polimorfisme_Run;

import java.util.Date;

import java.text.SimpleDateFormat;
/**
 *
 * @author Ilmi
 */
public abstract class Employee {
private String name;
private String noKTP;
protected int jumlahBarang;
protected double hargaBarang;
protected double GajiBorongan;
protected Date Lahir;
protected Date Present = new Date();
private double BonusBulanan;
SimpleDateFormat SdfAll = new SimpleDateFormat("DD " + " MM " + " YYYY");
SimpleDateFormat SdfDate = new SimpleDateFormat("DD");
SimpleDateFormat SdfMonth = new SimpleDateFormat("MM");
SimpleDateFormat SdfYear = new SimpleDateFormat("YYYY");


public Employee(String name, String noKTP){
    this.name = name;
    this.noKTP = noKTP;
}

public void setTanggal(int date, int month, int year){
    Lahir = new Date(year+1900, month, date);
}

public double getBonusUltah(){
    if((Present.getMonth()+1) == (Lahir.getMonth())){
        BonusBulanan += 100000;
    }
    return BonusBulanan;
}
public String Surprise(){
    if((Present.getMonth()+1) == (Lahir.getMonth())){
        return "Today month is same with the employee month born \nso his/her earnings this month is raised with 100000";
    }
    else{return "Today mont doesnt same with the employee born month";}
}

public String getName(){
return name;
}
public String getNoKTP(){
return noKTP;
}
@Override
public String toString(){
return String.format(" "+getName()+"\nNo. KTP:"+getNoKTP());
}
public abstract double earnings();//pendapatan
public abstract void setUpahBoronganBarang(int jumlahBarang, double hargaBarang);
public abstract double getGajiBorongan();
}

