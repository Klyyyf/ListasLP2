import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListasNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 15, 22, 37, 45, 56, 87, 92, 98, 99, 101, 110);

        List<Integer> pares = numeros.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());

        List<Integer> impares = numeros.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
    }
}
