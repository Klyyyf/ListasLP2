package Aula5Novembro.Ex2;

public class CamaroteSuperior extends VIP {
    protected double valorAdicional2;
    protected String localizacao;
  
    public CamaroteSuperior(double valor, double valorAdicional, double valorAdicional2, String localizacao) {
      super(valor, valorAdicional);
      this.valorAdicional2 = valorAdicional2;
      this.localizacao = localizacao;
    }
  
    public String getLocalizacao() {
      return localizacao;
    }
  
    @Override
    public void imprimeValor(){
      System.out.println("O valor do Camarote Superior é R$: " + (getValor() + getValorAdicional() + valorAdicional2));
    }
  
    public void imprimeLocal() {
      System.out.println("A localização do Camarote Superior é: " + localizacao);
    }
  }
