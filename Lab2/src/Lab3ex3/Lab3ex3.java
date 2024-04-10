package Lab3ex3;

import java.util.Scanner;

public class Lab3ex3 {
    public static void main(String[] args) {
        String sir1;
        String sir2;
        int pozitie_insert;
        int pozitie_delete_incep;
        int pozitie_end;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sir1 : ");
        sir1 = scanner.nextLine();
        System.out.println("Sir1 : ");
        sir2 = scanner.nextLine();
        System.out.println("Pozitie inserare : ");
        pozitie_insert = scanner.nextInt();

        StringBuilder build = new StringBuilder(sir1);
        build.insert(pozitie_insert,sir2);
        System.out.println(build.toString());
        System.out.println("Pozitie delete  incep : ");
        pozitie_delete_incep = scanner.nextInt();
        System.out.println("Pozitie delete  sfarsit : ");
        pozitie_end = scanner.nextInt();
        build.delete(pozitie_delete_incep,pozitie_end);
        System.out.println(build.toString());
    }
}
