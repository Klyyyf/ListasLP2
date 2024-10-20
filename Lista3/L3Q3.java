import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[5][5];
        int maior = 0;
        int[] locMaior = new int[2];
        System.out.println("Informe os elementos da matriz 5x5");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Elemento da linha " + (i + 1) + " e coluna " + (j + 1));
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                    locMaior[0] = i+1;
                    locMaior[1] = j+1;
                }
            }
        }

        System.out.println("O maior elemento da matriz é " + maior + " que se encontra na linha " + locMaior[0] + " e coluna " + locMaior[1]);
        sc.close();
    }
}