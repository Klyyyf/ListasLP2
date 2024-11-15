package ClassesAbstratas.Formas;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(5, 8);
        Circulo c = new Circulo(3);

        System.out.println("A área do retangulo é: " + r.calcularArea());
        System.out.println("A área do circulo é: " + c.calcularArea());
    }
}
