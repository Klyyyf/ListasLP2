import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 32.");
        int num = sc.nextInt();
        int cont = 5;
        int[] bin = new int[]{0, 0, 0, 0, 0, 0};
        while (num > 0) {
            bin[cont] = num % 2;
            num = num / 2;
            cont--;
        }
        for (int i = 0; i <= 5; i++) {
            System.out.print(bin[i]);
        }
        sc.close();
    }
}
