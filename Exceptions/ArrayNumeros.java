package Exceptions;

import java.util.Scanner;

public class ArrayNumeros {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.println("Preencha os valores do vetor de tamanho 10.");
        while (cont < vetor.length) {
            try {
                System.out.println("Informe a posição (0 - 9)");
                int pos = Integer.parseInt(sc.nextLine());

                if (pos < 0 || pos > 9) {
                    throw new ArrayIndexOutOfBoundsException("Posição fora do limite do vetor.");
                }

                System.out.println("Informe o valor que irá na posição " + pos + ".");
                int val = Integer.parseInt(sc.nextLine());

                vetor[pos] = val;
                System.out.println("Valor: " + val + " inserido na posição: " + pos + ".");
                cont++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ERRO: A posição informada está fora do limite de vetor.");
            } catch (NumberFormatException e) {
                System.out.println("ERRO: O valor informado não é um número válido.");
            }
        }
        sc.close();

        System.out.println("Conteúdo final do vetor");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Posição: " + i + " Valor: " + vetor[i]);
        }
    }
}
