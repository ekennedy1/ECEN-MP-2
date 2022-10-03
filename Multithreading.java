import java.io.*;
import java.util.*;  

public class Multithreading extends Thread {

    private int rowNumber1;
    private int rowNumber2;
    Matrices MatrixM = new Matrices();

    
    public Multithreading(int rowNumber1, int rowNumber2, Matrices MatrixM){
        this.rowNumber1 = rowNumber1;
        this.rowNumber2 = rowNumber2;
        this.MatrixM = MatrixM;
    }

    public void run() {
        MatrixM.multiplyMatrices(rowNumber1, rowNumber2);

    }
}
