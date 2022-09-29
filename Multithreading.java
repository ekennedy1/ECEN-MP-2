import java.io.*;
import java.util.*;  

public class Multithreading extends Thread {

    private int threadNumber;
    
    public Multithreading(int threadNumber){
        this.threadNumber = threadNumber;
    }

    public void run() {
        for(int i = 1; i<= 5; i++){
            System.out.println(i);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
            }
            
        }
    }
}
