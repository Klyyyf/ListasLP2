import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número natural positivo.");
        int num = sc.nextInt();
        int aux = num;
        System.out.println("Os divisores de " + num + " são:");
        while (aux > 0) {
            if (num % aux == 0) {
                System.out.print(num/aux + " ");
            }
            aux--;
        }
        sc.close();
    }
}
