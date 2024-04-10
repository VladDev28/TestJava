package lab1Ex1;

import java.util.Scanner;

class Dreptungi{
    public float Latime;
    public float Lungime;

    public Dreptungi(float latime, float lungime) {
        Latime = latime;
        Lungime = lungime;
    }

    public Dreptungi() {

    }

    public float aria(float a, float b){
        float arie = a*b;
        return arie;
    }
    public float perimetru(float a, float b){
        float perimetru = 2*(a+b);
        return perimetru;
    }
}

public class ex1 {
    public static void main(String[] args) {

        Dreptungi dreptungi = new Dreptungi();
        Scanner scanner = new Scanner(System.in);
        dreptungi.Latime = scanner.nextFloat();
        dreptungi.Lungime = scanner.nextFloat();
        dreptungi.aria(dreptungi.Latime, dreptungi.Lungime);

        System.out.println(dreptungi.aria(dreptungi.Latime, dreptungi.Lungime));
        System.out.println(dreptungi.perimetru(dreptungi.Latime, dreptungi.Lungime));
    }
}
