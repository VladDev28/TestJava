package lab1Ex5;

import java.sql.SQLOutput;
import java.util.Random;

public class ex5 {
    public static void main(String[] args) {
        int nr =1;
        Random rand = new Random();
        nr = rand.nextInt(20);
        System.out.println(nr);
        int a=1;
        int b=1;
        int c;
        int n = 10;
        System.out.print(a + " " + b + " ");
        boolean esteInSir = false;

        for(int i = 0; i<10;i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            if (nr == c){
                esteInSir = true;
            }
        }
        if(esteInSir) {
            System.out.println("\nNumarul "+ nr +" este in sir");
        }else{
            System.out.println("\nNumarul "+ nr +" nu este in sir");
        }
    }
}
