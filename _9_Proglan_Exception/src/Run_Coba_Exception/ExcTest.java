/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run_Coba_Exception;

/**
 *
 * @author Ilmi
 */
public class ExcTest {
    
static double division(int a, int b)  {
  if (b == 0) {
    throw new IllegalArgumentException("division by zero!");
  }
		
  return a / b;
}
	
public static void main (String[] args) {
  try {
    double x = division(9, 0);
  } catch (Exception e) {
    System.out.println(e.getMessage());
  } finally {
    System.out.println("Horee");
  }

  String yy = "Adadeh aasdasd" ;
  String sub = yy.substring(0 , yy.length() - 3);
}
}
