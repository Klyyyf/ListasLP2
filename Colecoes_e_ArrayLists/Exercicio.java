import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int num;
        System.out.println("Informe o número que deseja inserir no array (-1 para encerrar)");
        while (true) {
            num = sc.nextInt();
            if (num == -1) break;
            lista.add(num);
        }

        Collections.sort(lista);
        System.out.println("Lista Ordenada: ");
        for(int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
        
        int numBusca;
        System.out.println("Informe o número que deseja procurar no Array (-1 para encerrar)");
        while(true) {
            numBusca = sc.nextInt();
            if (numBusca == -1) break;

            int resultado = Collections.binarySearch(lista, numBusca);
            if (resultado >= 0) {
                System.out.println("Valor encontrado na posição: " + resultado);
            } else {
                System.out.println("Valor não encontrado.");
            }
        }

        sc.close();
    }
}
