import java.io.*;
import java.util.*;
import java.util.random.*;
public class RollingDice{
    public static void main(String args[]){
        Random ran = new Random();
            int random1 = ran.nextInt(6) + 1;
            int random2 = ran.nextInt(6) + 1;
            System.out.print(" " + random1);
            System.out.print(" " + random2);
            System.out.println(" ");
            System.out.print("Total: " + (random1 + random2));



    }
}
