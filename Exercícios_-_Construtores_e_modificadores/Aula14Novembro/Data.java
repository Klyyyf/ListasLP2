public class Data {
    protected int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        if(isDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida!");
        }
    }

    private boolean isDataValida(int dia, int mes, int ano) {
        if(ano < 0) return false;

        if(mes < 0 || mes > 12) return false;

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }
}
