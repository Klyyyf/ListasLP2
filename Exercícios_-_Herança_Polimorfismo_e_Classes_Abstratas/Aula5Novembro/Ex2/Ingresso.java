package Aula5Novembro.Ex2;

public class Ingresso {
    protected double valor;
  
    public Ingresso(double valor) {
      this.valor = valor;
    }
  
    public double getValor() {
      return valor;
    }
  
    public void imprimeValor() {
      System.out.println("O valor do ingresso é R$: " + valor);
    }
  }
