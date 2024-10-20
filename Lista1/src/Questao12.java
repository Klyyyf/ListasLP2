import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe respectivamente os valores de R1, R2 e R3.");
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double r3 = sc.nextDouble();
        double req = (1/r1 + 1/r2) + r3;
        System.out.println("A resistência equivalente é: " + req);
        sc.close();
    }
}
