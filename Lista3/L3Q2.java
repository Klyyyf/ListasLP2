import java.util.Scanner;

public class L3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe 10 números");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10 - j - 1; k++) {
                if (arr[k] > arr[k+1]) {
                    int aux = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = aux;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
