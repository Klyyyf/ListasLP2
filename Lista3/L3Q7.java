import java.util.Scanner;

public class L3Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int soma = 0;
        System.out.println("Informe os elementos da matriz 3x3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Elemento da linha " + (i + 1) + " e coluna " + (j + 1));
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j > i) {
                    soma += mat[i][j];
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("A soma dos elementos acima da diagonal principal é: " + soma);

        sc.close();
    }
}
