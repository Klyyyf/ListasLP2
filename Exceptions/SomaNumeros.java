package Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ExcecaoAcimaDeCem extends Exception {
    public ExcecaoAcimaDeCem(String mensagem) {
        super(mensagem);
    }
}

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        int soma = 0, num = 0;
        System.out.println("Digite números para somá-los (menor que 0 para encerrar).");
        try{
            while (num >= 0) {
                System.out.println("Digite um número.");
                num = sc.nextInt();

                numeros.add(num);
                soma += num;

                if (soma > 100) {
                    throw new ExcecaoAcimaDeCem("A soma ultrapassou 100. Valor atual: " + soma);
                }
            }
        } catch (ExcecaoAcimaDeCem e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            
            int quantidade = numeros.size();
            double media = (quantidade > 0) ? (double) soma / quantidade : 0;

            System.out.println("\nResumo:");
            System.out.println("Quantidade de números somados: " + quantidade);
            System.out.println("Soma total: " + soma);
            System.out.println("Média: " + media);
        }
    }
}
