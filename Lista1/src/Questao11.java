import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a velocidade em m/s.");

        double velms = sc.nextDouble();
        double velkmh = velms * 3.6;

        System.out.println(velms + "m/s equivale a " + velkmh + "Km/h.");

        sc.close();
    }
}
