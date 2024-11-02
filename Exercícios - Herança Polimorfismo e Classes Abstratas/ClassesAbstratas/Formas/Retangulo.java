package ClassesAbstratas.Formas;

public class Retangulo extends Forma {
    protected double altura;
    protected double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
