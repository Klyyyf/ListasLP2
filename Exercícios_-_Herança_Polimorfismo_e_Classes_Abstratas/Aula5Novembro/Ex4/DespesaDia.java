package Aula5Novembro.Ex4;

public class DespesaDia extends DespesaMes {
    private int dia;

    public DespesaDia(int dia, int mes, float valor) {
        super(mes, valor);
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }
}
