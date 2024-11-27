package Ex1;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", 26,   3000));
        pessoas.add(new Pessoa("Maria", 32, 4000));
        pessoas.add(new Pessoa("Jonas", 18, 2000));

        List<Pessoa> filtradas = pessoas.stream().filter(p -> p.getIdade() >= 30).collect(Collectors.toList());
        
        filtradas.forEach(System.out::println);

        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        pessoas.forEach(System.out::println);

        Desconto desconto = pessoa -> pessoa.getSalario() * 0.9;

        pessoas.forEach(p -> {
            double novoSalario = desconto.aplicar(p);
            System.out.println(p.getNome() + " - Novo Salário: " + novoSalario);
        });
    }
}
