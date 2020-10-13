/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _7_Polimorfisme_Run;
public class BasePlusCommissionEmployee extends
CommissionEmployee {
private double baseSalary;//gaji pokok tiap minggu
public BasePlusCommissionEmployee(String name, String
noKTP, double sales, double rate, double salary) {
super(name, noKTP, sales, rate);
setBaseSalary(salary);
}
public void setBaseSalary(double salary) {
baseSalary = salary;
}
public double getBaseSalary() {
return baseSalary;
}
@Override
public double earnings() {
return getBaseSalary() + super.earnings();
}
@Override
public String toString() {
return String.format("Base-Salaried " + super.toString() + "\nbase salary " + getBaseSalary());
}
}