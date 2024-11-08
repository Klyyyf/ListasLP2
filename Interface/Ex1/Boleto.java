public class Boleto extends Pagamento implements Autenticacao {
    private String codigo;
    private String dataVencimento;
  
    public Boleto(float valor, String codigo, String dataVencimento) {
      super(valor);
      this.codigo = codigo;
      this.dataVencimento = dataVencimento;
    }
  
    public boolean autenticar() {
      if(codigo == null || dataVencimento == null) {
        System.out.println("Boleto não autenticado");
        return false;
      }
  
      System.out.println("Boleto autenticado");
      return true;
    }
  
    @Override
    public void realizarPagamento() {
      if(!autenticar()) {
        System.out.println("Não foi possível realizar o pagamento");
        return;
      }
  
      System.out.println("Pagamento realizado com sucesso");
    }
  }