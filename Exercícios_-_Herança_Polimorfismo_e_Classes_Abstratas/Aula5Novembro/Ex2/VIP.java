package Aula5Novembro.Ex2;

public class VIP extends Ingresso {
    protected double valorAdicional;
  
    public VIP(double valor, double valorAdicional) {
      super(valor);
      this.valorAdicional = valorAdicional;
    }
  
    public double getValorAdicional() {
      return valorAdicional;
    }
  
    @Override
    public void imprimeValor() {
      System.out.println("O valor do ingresso VIP é R$: " + (getValor() + valorAdicional));
    }
  }
