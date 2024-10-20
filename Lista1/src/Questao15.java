import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe respectivamente o valor do comprimento, largura e altura da caixa.");
        double c = sc.nextDouble();
        double l = sc.nextDouble();
        double a = sc.nextDouble();
        double vol = c * l * a;
        System.out.println("O volume da caixa é: " + vol);
        sc.close();
    }
}
