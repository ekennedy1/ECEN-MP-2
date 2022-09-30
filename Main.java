import java.io.*;
import java.util.*;  

public class Main {
    public static void main(String[] args) {

        Multithreading Thread1 = new Multithreading(0, 4);
        Multithreading Thread2 = new Multithreading(4, 8);
        Multithreading Thread3 = new Multithreading(8, 12);
        Multithreading Thread4 = new Multithreading(12, 16);
        Multithreading Thread5 = new Multithreading(16, 20);

        //Thread1.start();

        Matrices Matrix = new Matrices();
        Matrix.Initialize();

        boolean stop = true;
        do{
            System.out.println("Welcome to the 20 x 20 Matrix Calculator designed by Group 12.");
            System.out.println("Enter I to Initialize two new matrices, C to Calculate the matrices product, and Q to quit.");
            Scanner sc= new Scanner(System.in); 
            String str = sc.nextLine();   
            switch(str){
                case "I":
                case "i":

                    Matrix.Initialize();
                    Matrix.printM();
                    break;

                case "C":
                case "c":

                    
                    Matrix.printP();
                    break;

                
                case "Q":
                    stop = false;
                default:
                    break;
            }
        }
        while(stop);

    }    
}    


