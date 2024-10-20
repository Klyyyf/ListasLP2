import java.util.Scanner;

public class L3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de linhas do triangulo de Pascal");
        int n = sc.nextInt();
        int[][] triangulo = new int[n][];
        for (int i = 0; i < n; i++) {
            triangulo[i] = new int[i+1];
            triangulo[i][0] = 1;
            triangulo[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i-1][j-1] + triangulo[i-1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}