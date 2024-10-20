import java.util.Scanner;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do array");
        int tam = sc.nextInt();
        int[] array = new int[tam];
        System.out.println("Agora informe " + tam + " números");
        int num;
        for(int i = 0; i < tam; i++) {
            num = sc.nextInt();
            array[i] = num;
        }

        for(int j = tam-1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }
        sc.close();
    }
}
