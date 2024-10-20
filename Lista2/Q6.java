import java.util.Scanner;

public class Q6 {
    public static int fat(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fat(n - 1);
        }
    }
    public static void euler(int n) {
        double euler = 0.0;
        for (int i = 0; i < n; i++) {
            euler += 1.0 / fat(i);
            System.out.println("Termo " + (i+1) + ": " + euler);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de termos da série.");
        int n = sc.nextInt();
        euler(n);
        sc.close();
    }
}
