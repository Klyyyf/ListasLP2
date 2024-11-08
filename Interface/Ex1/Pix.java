public class Pix extends Pagamento implements Autenticacao {
    private String codigoPix;
    private float valorPago;
  
    public Pix(float valor, String codigoPix, float valorPago) {
      super(valor);
      this.codigoPix = codigoPix;
      this.valorPago = valorPago;
    }
  
    public boolean autenticar() {
      if(codigoPix == null) {
        System.out.println("Pix não autenticado");
        return false;
      }
  
      if(valorPago < valor) {
        System.out.println("Valor pago insuficiente");
        return false;
      }
  
      System.out.println("Pix autenticado");
      return true;
    }
  
    public void realizarPagamento() {
      if(!autenticar()) {
        System.out.println("Não foi possível realizar o pagamento");
        return;
      }
  
      System.out.println("Pagamento realizado com sucesso");
    }
  }