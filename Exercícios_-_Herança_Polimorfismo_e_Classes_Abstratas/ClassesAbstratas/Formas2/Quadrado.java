package ClassesAbstratas.Formas2;

public class Quadrado extends Figura {
    private double lado;

    public Quadrado(double lado, String cor, boolean filled) {
        super(cor, filled);
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

    @Override
    public double getPerimetro() {
        return lado * 4;
    }
}
