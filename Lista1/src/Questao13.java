import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe respectivamente o tempo gasto e a velocidade media percorrida.");
        double t = sc.nextDouble();
        double vm = sc.nextDouble();
        double d = t * vm;
        double c = d/12;
        System.out.println("A quantidade de combustível gasta foi de " + c + " litros.");
        sc.close();
    }
}
