import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Nomes {
    public static void main(String[] args) {
        List<String>  nomes = Arrays.asList("Ana", "Carlos", "Francisco", "Chagas", "Eduardo", "Fabio", "Baltazar", "Gaspar", "Fred", "Bela");

        List<String> nomesFiltrados = nomes.stream().filter(name -> name.length() > 5).sorted().collect(Collectors.toList());

        System.out.println("Nomes filtrados: " + nomesFiltrados);
    }
}
