package Ex2;

abstract class Funcionario implements Bonus{
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
    }

    public abstract double calcularSalario();

    public double calcularPagamento() {
        return calcularSalario();
    }
}
