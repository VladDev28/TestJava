package Lab2ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String line=null;
        String judete[];
        int nr_judete=0;
        try {
            BufferedReader buff = new BufferedReader(new FileReader("src/Lab2ex1/judete.txt"));
            while((line = buff.readLine())!=null){
                nr_judete++;
            }
            buff.close();
            judete = new String[nr_judete];
            buff = new BufferedReader(new FileReader("src/Lab2ex1/judete.txt"));
            int index = 0;
            while((line = buff.readLine())!=null){
                judete[index] = line;
                index++;
            }
            buff.close();
            Arrays.sort(judete);
            System.out.println("Judete ordonate: ");
            for(String judet:judete){
                System.out.println(judet);
            }
            String judetCautat;
            System.out.println("Introduceți județul căutat: ");
            Scanner scan = new Scanner(System.in);
            judetCautat = scan.nextLine();
            int pozitie = Arrays.binarySearch(judete,judetCautat)+ 1;
            if(pozitie>=0){
                System.out.println(pozitie);
            }else
                System.out.println("Lox");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
