import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o ano que você quer verificar.");
        int ano = sc.nextInt();
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {    
                System.out.println(ano + " não é bissexto.");
            } else {
                System.out.println(ano + " é bissexto");
            }
        } else if (ano % 400 == 0) {
            System.out.println(ano + " é bissexto");
        } else {
            System.out.println(ano + " não é bissexto.");
        }
        sc.close();
    }
}
