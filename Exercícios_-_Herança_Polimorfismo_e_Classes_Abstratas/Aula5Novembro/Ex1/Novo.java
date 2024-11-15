public class Novo extends Imovel {
    protected double adicional;
  
    public Novo(String endereco, double preco, double adicional) {
      super(endereco, preco);
      this.adicional = adicional;
    }
  
    public double getAdicional() {
      return adicional;
    }
  
    public double returnPreco() {
      return getPreco() + adicional;
    }
  }