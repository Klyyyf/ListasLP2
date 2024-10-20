import java.util.Scanner;
public class Q2 {
    public static boolean vogal(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um caractere qualquer.");
        char r = sc.next().charAt(0);
        if (Character.isLetter(r)) {
            if (vogal(r)) {
                System.out.println(r + " é uma vogal.");
            } else {
                System.out.println(r + " é uma consoante.");
            }
        } else if (Character.isDigit(r)) {
            System.out.println(r + " é um número.");
        } else {
            System.out.println(r + " é um símbolo.");
        }
        sc.close();
    }
}
