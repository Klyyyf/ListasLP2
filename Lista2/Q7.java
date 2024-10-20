import java.util.Scanner;
public class Q7 {
    public static int fat(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fat(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que deseja descobrir o fatorial.");
        int num = sc.nextInt();
        System.out.println(num + "! = " + fat(num));
        sc.close();
    }
}
