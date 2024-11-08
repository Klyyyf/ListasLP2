package Ex2;

public class Main {
    public static void main(String[] args) {
        FuncionarioHorista horista = new FuncionarioHorista("João", 160, 25.0); // 160 horas, R$25 por hora
        horista.exibirDetalhes();
        System.out.println("Salário (Horista): R$" + horista.calcularSalario());
        System.out.println("Bônus (Horista): R$" + horista.calcularBonus());
        System.out.println("Salário Total (Horista): R$" + (horista.calcularSalario() + horista.calcularBonus()));

        System.out.println();

        // Criar um funcionário assalariado
        FuncionarioAssalariado assalariado = new FuncionarioAssalariado("Maria", 5000);
        assalariado.exibirDetalhes();
        System.out.println("Salário (Assalariado): R$" + assalariado.calcularSalario());
        System.out.println("Bônus (Assalariado): R$" + assalariado.calcularBonus());
        System.out.println("Salário Total (Assalariado): R$" + (assalariado.calcularSalario() + assalariado.calcularBonus()));
    }
}

