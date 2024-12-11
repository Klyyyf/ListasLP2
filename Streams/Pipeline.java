import java.util.Arrays;
import java.util.List;

public class Pipeline {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int result = numeros.stream().filter(x -> x % 2 == 1).map(x -> x * x).reduce(0, Integer::sum);

        System.out.println("Resultado: " + result);
    }
}
