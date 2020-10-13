/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB_8_Interface_Prak;

/**
 *
 * @author Ilmi
 */
public class Invoice implements Payable{
    String ProductName;
    int quantity;
    int pricePerItem;
    
    public Invoice(){}
    
    public Invoice(String ProductName, int pricePerItem, int quantity){
        this.ProductName = ProductName;
        this.pricePerItem = pricePerItem;
        this.quantity = quantity;
    }

    public String toString(int i){
        return String.format("\t" + i + ". Product name   : " + ProductName + 
                             "\n\t   Price per-item : " + pricePerItem + 
                             "\n\t   Quantity\t  : " + quantity)+
                             "\n\t   Sum\t\t  : " + (quantity*pricePerItem);
    }
    
    @Override
    public double getPayableAmount() {
        return (pricePerItem * quantity);
    }
}
