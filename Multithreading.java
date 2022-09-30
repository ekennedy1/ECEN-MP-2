import java.io.*;
import java.util.*;  

public class Multithreading extends Thread {

    private int rowNumber1;
    private int rowNumber2;

    
    public Multithreading(int rowNumber1, int rowNumber2){
        this.rowNumber1 = rowNumber1;
        this.rowNumber2 = rowNumber2;
    }

    public void run() {
        Matrices MatrixM = new Matrices();
        System.out.print(rowNumber1);
        System.out.print(rowNumber2);
        MatrixM.multiplyMatrices(rowNumber1, rowNumber2);

    }
}
