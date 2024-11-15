package ClassesAbstratas.Formas;

public class Circulo extends Forma {
    protected double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        return 3.14 * (raio * raio);
    }
}
