package Aula5Novembro.Ex2;

public class CamaroteInferior extends VIP {
    private String localizacao;
  
    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
      super(valor, valorAdicional);
      this.localizacao = localizacao;
    }
  
    public String getLocalizacao() {
      return localizacao;
    }
  
    @Override
    public void imprimeValor() {
      System.out.println("O valor do Camarote Inferior é R$: " + (getValor() + getValorAdicional()));
    }
  
    public void imprimeLocal() {
      System.out.println("A localização do Camarote Inferior é: " + localizacao);
    }
  }
