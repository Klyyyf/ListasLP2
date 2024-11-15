package ClassesAbstratas.Formas2;

public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio, String cor, boolean filled) {
        super(cor, filled);
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return 3.14 * (raio * raio);
    }

    @Override
    public double getPerimetro() {
        return 2 * 3.14 * raio;
    }
}
