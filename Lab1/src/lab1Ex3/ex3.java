package lab1Ex3;

import javax.swing.*;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int n;
        int t;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.print("Divizorii numarului " + n + " sunt: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" " + i);
                count++;
            }
        }
        if (count == 2) {
            System.out.println("\nNumarul este prim");
        } else {
            System.out.println("\nNumarul nu este prim");
        }
    }
}
