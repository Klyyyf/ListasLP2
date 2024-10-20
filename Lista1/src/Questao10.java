import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as notas do primeiro bimestre.");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        System.out.println("Informe as notas do segundo bimestre.");
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double b1 = (n1 + n2)/2;
        double b2 = (n3 + n4)/2;
        double ns = (b1 + b2)/2;
        System.out.println("A nota semestral desse aluno é: " + ns);
        sc.close();
    }
}
