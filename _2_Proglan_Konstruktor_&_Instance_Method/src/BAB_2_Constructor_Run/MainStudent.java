package BAB_2_Constructor_Run;
import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
Student anna = new Student();
 anna.setName("Anna");
 anna.setAddress("Malang");
 anna.setAge(20);
 anna.setMath(100);
anna.setScience(89);
 anna.setEnglish(80);
 anna.displayMessage();

 //menggunakan constructor lain
 System.out.println("===================");
 Student chris = new Student("Chris", "Kediri", 21);
 chris.setMath(70);
 chris.setScience(60);
 chris.setEnglish(90);
 chris.displayMessage();
        //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
System.out.println("===================");
 anna = new Student("anna", "Batu", 18);
 anna.displayMessage();

 //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
 System.out.println("===================");
 chris.setAddress("Surabaya");
 chris.setAge(22);
 chris.displayMessage();
 
 Student Ilmi = new Student(80,90,100);
 
    Scanner in = new Scanner(System.in);
        System.out.println("Input Jumlah Siswa : ");
        int jum = in.nextInt();
        String [] Nama = new String[jum];
        for(int i = 0 ; i < jum ; i++){
            Nama [i] = in.next(); in.nextLine();
        }
        /*for(int i = 0 ; i < jum ; i++){
            Student Nama[i] = new Student;
        }*/
        
    
 }
}
    

