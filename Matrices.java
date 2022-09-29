import java.io.*;
import java.util.*;  

public class Matrices {

    public int m1[][] = new int [20][20];
    public int m2[][] = new int [20][20];
    public int product[][] = new int [20][20];

    public void Initialize (){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(100);
        int rand_int2 = rand.nextInt(100);
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                m1[i][j] = rand_int1;
                m2[i][j] = rand_int2;

                rand_int1 = rand.nextInt(100);
                rand_int2 = rand.nextInt(100);
            }

        }
        
    }

    public void printM (){
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                System.out.print("[" + m1[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                System.out.print("[" + m2[i][j] + "]");
            }
            System.out.println();
        }
    }

    //Multiply from rows a to b
    //for use in multitreasing class
    public void Multiply (int a, int b){
        
        for(int i = a; i < b; i++){
            for(int j = 0; j < 20; j++){
                


            }

        }
        
    }

}

