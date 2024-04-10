package lab1Ex2;

import java.io.*;

public class ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader buff = new BufferedReader(new FileReader("src/lab1Ex2/in.txt"));
        String line = null;
        double count=0;
        double total = 0;
        double media = 0;
        double number;
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        try {
            while((line = buff.readLine()) != null) {
                number = Double.parseDouble(line);
                System.out.println(line);
                total += number;
                count++;
                if(number<min){
                    min = number;
                } if (number>max) {
                    max = number;
                }
            }

            System.out.println("Total: "+total);
            media = total/count;
            System.out.println("media: " + media);
            System.out.println("Minim: " + min);
            System.out.println("Maxim: " + max);

            PrintWriter writer = new PrintWriter(new File("src/lab1Ex2/out.txt"));
            writer.println("Total: "+total);
            writer.println("media: " + media);
            writer.println("Minim: " + min);
            writer.println("Maxim: " + max);
            writer.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
