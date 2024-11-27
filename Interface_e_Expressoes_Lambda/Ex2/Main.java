package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square square = (double x) -> x * x;

        System.out.println("Informe um número para descobrir o seu quadrado.");
        double num = sc.nextDouble();
        
        System.out.println("O quadrado de " + num + " é " + square.calculate(num));
        sc.close();
    }
}
