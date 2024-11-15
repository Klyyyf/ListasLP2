import java.util.ArrayList;
import java.util.List;

class Data {
    int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}

abstract class Pessoa {
    protected String nome;
    protected Data nascimento;

    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public abstract void imprimeDados();
}

class Cliente extends Pessoa {
    private int codigo;

    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Cliente: " + nome + ", Código: " + codigo + ", Nascimento: " + nascimento);
    }
}

abstract class Funcionario extends Pessoa {
    protected float salario;

    public Funcionario(String nome, Data nascimento, float salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public abstract float calculaImposto();

    @Override
    public void imprimeDados() {
        System.out.println("Funcionário: " + nome + ", Salário: " + salario + ", Nascimento: " + nascimento);
        System.out.println("Imposto: " + calculaImposto());
    }
}

class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, Data nascimento, float salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    @Override
    public float calculaImposto() {
        return salario * 0.05f;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Gerente: " + nome + ", Área: " + area + ", Salário: " + salario + ", Nascimento: " + nascimento);
        System.out.println("Imposto: " + calculaImposto());
    }
}

class FuncionarioPadrao extends Funcionario {
    public FuncionarioPadrao(String nome, Data nascimento, float salario) {
        super(nome, nascimento, salario);
    }

    @Override
    public float calculaImposto() {
        return salario * 0.03f;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Funcionário Padrão: " + nome + ", Salário: " + salario + ", Nascimento: " + nascimento);
        System.out.println("Imposto: " + calculaImposto());
    }
}

class CadastroPessoas {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastraPessoa(Pessoa p) {
        pessoas.add(p);
    }

    public void imprimeCadastro() {
        for (Pessoa pessoa : pessoas) {
            pessoa.imprimeDados();
            System.out.println();
        }
    }
}

public class TestaCadastro {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();

        cadastro.cadastraPessoa(new Cliente("Cliente 1", new Data(1, 1, 1990), 101));
        cadastro.cadastraPessoa(new Cliente("Cliente 2", new Data(2, 2, 1985), 102));
        cadastro.cadastraPessoa(new Cliente("Cliente 3", new Data(3, 3, 2000), 103));

        cadastro.cadastraPessoa(new FuncionarioPadrao("Funcionario 1", new Data(4, 4, 1980), 3000));
        cadastro.cadastraPessoa(new FuncionarioPadrao("Funcionario 2", new Data(5, 5, 1975), 3500));
        cadastro.cadastraPessoa(new FuncionarioPadrao("Funcionario 3", new Data(6, 6, 1995), 4000));

        cadastro.cadastraPessoa(new Gerente("Gerente 1", new Data(7, 7, 1970), 7000, "Vendas"));
        cadastro.cadastraPessoa(new Gerente("Gerente 2", new Data(8, 8, 1980), 7500, "Marketing"));
        cadastro.cadastraPessoa(new Gerente("Gerente 3", new Data(9, 9, 1990), 8000, "RH"));

        cadastro.imprimeCadastro();
    }
}
