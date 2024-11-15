import java.util.Vector;

abstract class Pessoa {
    public Pessoa() {

    }

    public String toString() {
        return "Pessoa";
    }
}

abstract class PessoaIMC extends Pessoa {
    protected double altura;
    protected double peso;

    public PessoaIMC(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC(double altura, double peso) {
        return peso / (altura * altura);
    }

    public abstract String resultIMC();

    @Override
    public String toString() {
        return "Altura: " + altura + ", Peso: " + peso;
    }
}

class Homem extends PessoaIMC {
    public Homem(double altura, double peso) {
        super(altura, peso);
    }

    @Override
    public String resultIMC() {
        double imc = calcularIMC(altura, peso);

        if (imc < 20.7) {
            return "Abaixo do peso ideal";
        } else if (imc <= 26.4) {
            return "Peso ideal.";
        } else {
            return "Acima do peso ideal.";
        }
    }
}

class Mulher extends PessoaIMC {
    public Mulher(double altura, double peso) {
        super(altura, peso);
    }

    @Override
    public String resultIMC() {
        double imc = calcularIMC(altura, peso);

        if (imc < 19.1) {
            return "Abaixo do peso ideal";
        } else if (imc <= 25.8) {
            return "Peso ideal.";
        } else {
            return "Acima do peso ideal.";
        }
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Vector<PessoaIMC> pessoas = new Vector<>();

        pessoas.add(new Homem(1.80, 75));
        pessoas.add(new Mulher(1.65, 60));

        for (PessoaIMC pessoa : pessoas) {
            System.out.println(pessoa);
            System.out.println("IMC Resultado: " + pessoa.resultIMC());
            System.out.println();
        }
    }
}

