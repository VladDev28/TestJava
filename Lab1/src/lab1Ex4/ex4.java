package lab1Ex4;

import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int nr1 = rand.nextInt(31);
        int nr2 = rand.nextInt(31);
        System.out.println(nr1 + " " + nr2);

        while(nr1!=nr2){
            if(nr1>nr2){
                nr1-=nr2;
            }else
                nr2-=nr1;
        }
        System.out.println(nr1);
    }
}
