import java.text.DecimalFormat;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe as três notas do aluno.");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1+n2+n3)/3;
        DecimalFormat df = new DecimalFormat("#.##");
        String mediaFormatada = df.format(media);
        if (media < 3) {
            System.out.println("Sua média é " + mediaFormatada + ", você está reprovado.");
        } else if (media >= 3 && media < 6) {
            System.out.println("Sua média é " + mediaFormatada + ", você está na recuperação.");
        } else {
            System.out.println("Sua média é " + mediaFormatada + ", você está aprovado.");
        }
        sc.close();
    }
}
