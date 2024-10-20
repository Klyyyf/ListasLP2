import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade em dias.");
        int dias = sc.nextInt();
        int meses = 0;
        int anos = 0;
        while (dias >= 365) {
            anos += 1;
            dias -= 365;
        }

        while (dias < 365 && dias >= 30) {
            meses += 1;
            dias -= 30;
        }

        System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias de idade.");
        sc.close();
    }
}
