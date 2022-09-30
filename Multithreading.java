import java.io.*;
import java.util.*;  

public class Multithreading extends Thread {

    private int rowNumber1;
    private int rowNumber2;

    Matrices Matrix = new Matrices();
    
    public Multithreading(int rowNumber1, int rowNumber2){
        this.rowNumber1 = rowNumber1;
        this.rowNumber2 = rowNumber2;
    }

    public void run() {
            
        Matrix.multiplyMatrices(rowNumber1, rowNumber2);

        /* 
        try{
                
        } catch (InterruptedException e){
        }
        */   
    }
}
