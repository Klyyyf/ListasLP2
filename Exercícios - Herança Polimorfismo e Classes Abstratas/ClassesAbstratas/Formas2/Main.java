package ClassesAbstratas.Formas2;

public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5, "verde", true);
        Quadrado q = new Quadrado(9, "azul", false);
        Retangulo r = new Retangulo(4, 5, "rosa", true);

        System.out.println("Círculo - Área: " + c.getArea() + ", Perímetro: " + c.getPerimetro());
        System.out.println("Retângulo - Área: " + r.getArea() + ", Perímetro: " + r.getPerimetro());
        System.out.println("Quadrado - Área: " + q.getArea() + ", Perímetro: " + q.getPerimetro());
    }
}
