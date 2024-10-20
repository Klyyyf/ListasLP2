import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit.");
        double f = sc.nextDouble();
        double c = 5/9 * (f - 32);

        System.out.println(f + "F = " + c + "ºC");

        sc.close();
    }
}
