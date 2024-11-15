package ClassesAbstratas.Formas2;

public class Retangulo extends Figura {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura, String cor, boolean filled) {
        super(cor, filled);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double getArea() {
        return altura * largura;
    }

    @Override
    public double getPerimetro() {
        return (2*altura) + (2*largura);
    }
}
