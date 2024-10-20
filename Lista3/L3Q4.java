import java.util.Scanner;

public class L3Q4 {
    public static void multiMatriz(int[][] m1, int[][] m2) {
        int[][] matResultado = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matResultado[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    matResultado[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matResultado[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[2][3];
        int[][] mat2 = new int[3][2];
        System.out.println("Informe os elementos da matriz 2x3");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Elemento da linha " + (i + 1) + " e coluna " + (j + 1));
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Informe os elementos da matriz 3x2");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Elemento da linha " + (i + 1) + " e coluna " + (j + 1));
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("O resultado da multiplicação das duas matrizes é: ");
        multiMatriz(mat1, mat2);

        sc.close();
    }
}
