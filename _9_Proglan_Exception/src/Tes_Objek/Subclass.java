/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tes_Objek;
class Superclass{
Superclass(int nilai){
System.out.println(4);
}
}
public class Subclass extends Superclass{
    public Subclass(){
        super(4);
        System.out.println(6);
}
public static void main(String[] args) {
    
Subclass objek = new Subclass();
}
}