package Lab2ex2;

import java.io.*;
import java.util.StringTokenizer;

public class MainApp {
    public static void main(String[] args) {
        String line;
        int counter = 0;
        String grupare = "ce";
        try {
            BufferedReader buff = new BufferedReader(new FileReader("src/Lab2ex2/cantec_in.txt"));
            FileWriter writer = new FileWriter("src/Lab2ex2/cantec_out.txt");
            while((line = buff.readLine())!=null){
                String linie = line;
                    for(int i = 0;i<linie.length();i++){
                        if(linie.charAt(i) == 'a' || linie.charAt(i) == 'e' || linie.charAt(i) == 'i' || linie.charAt(i) == 'o' || linie.charAt(i) == 'u') {
                        counter++;
                    }
                }

                writer.write(linie + " "+ linie.split(" ").length+ " " + counter + " ");
                if(linie.endsWith(grupare)){
                    writer.write("(*)");
                }
                writer.write("\n");

            }
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
