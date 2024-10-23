import java.util.Scanner;

public class Retangulo {
    private double altura;
    private double largura;

    public void definirAltura(Scanner sc) {
        System.out.println("Informe a altura do retângulo.");
        this.altura = sc.nextDouble();
    }

    public void definirLargura(Scanner sc) {
        System.out.println("Informe a largura do retângulo.");
        this.largura = sc.nextDouble();
    }

    public double area() {
        return altura * largura;
    }

    public double perimetro() {
        return (2*altura) + (2*largura);
    }
}
