import java.util.Scanner;

public class L3Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] mat = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                mat[i][j] = '-';
            }
        }
        System.out.println("Informe a linha que a torre se encontra");
        int li = sc.nextInt();
        System.out.println("Informe a coluna que a torre se encontra");
        int col = sc.nextInt();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == li-1 || j == col-1) {
                    mat[i][j] = 'x';
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
