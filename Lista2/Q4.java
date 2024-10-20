import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;
        do {
            System.out.println("Digite a senha:");
            senha = sc.nextLine();
            if (!senha.equals("1234")) {
                System.out.println("Senha incorreta, tente novamente.");
            }
        } while (!senha.equals("1234"));
        System.out.println("Senha Correta.");
        sc.close();
    }
}
