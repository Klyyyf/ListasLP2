import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        retangulo.definirAltura(sc);
        retangulo.definirLargura(sc);

        System.out.println("Área do retângulo: " + retangulo.area());
        System.out.println("Perímetro do retângulo: " + retangulo.perimetro());

        TrianguloRetangulo triangulo = new TrianguloRetangulo();
        triangulo.definirAltura(sc);
        triangulo.definirBase(sc);
        triangulo.calcularHipotenusa();

        System.out.println("Hipotenusa do triângulo: " + triangulo.valorHipotenusa());
        System.out.println("Área do triângulo: " + triangulo.areaTriangulo());
        System.out.println("Perímetro do triângulo: " + triangulo.perimetroTriangulo());
    }
}
