import java.util.Scanner;

public class TrianguloRetangulo {
    private double catetobase;
    private double catetoaltura;
    private double hipotenusa;

    public void definirAltura(Scanner sc) {
        System.out.println("Informe o tamanho do cateto altura.");
        this.catetoaltura = sc.nextDouble();
    }

    public void definirBase(Scanner sc){
        System.out.println("Informe o tamanho do cateto base");
        this.catetobase = sc.nextDouble();
    }

    public void calcularHipotenusa() {
        this.hipotenusa = Math.sqrt(catetoaltura * catetoaltura) + (catetobase * catetobase);
    }

    public double valorHipotenusa() {
        return hipotenusa;
    }

    public double areaTriangulo() {
        return (catetobase * catetoaltura) / 2;
    }

    public double perimetroTriangulo() {
        return catetoaltura + catetobase + hipotenusa;
    }
}
