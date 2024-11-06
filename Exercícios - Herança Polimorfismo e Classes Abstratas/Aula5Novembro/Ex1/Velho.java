public class Velho extends Imovel {
  protected double desconto;

  public Velho(String endereco, double preco, double desconto) {
    super(endereco, preco);
    this.desconto = desconto;
  }

  public double getDesconto() {
    return desconto;
  }

  public double returnDesconto() {
    return getPreco() - desconto;
  }
}