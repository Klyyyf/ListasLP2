public class CartaoCredito extends Pagamento implements Autenticacao {
    private String numeroCartao;
    private String nomeTitular;
    private String dataExpiracao;
    private String codigoSeguranca;
  
    public CartaoCredito(float valor, String numeroCartao, String nomeTitular, String dataExpiracao, String codigoSeguranca) {
      super(valor);
      this.numeroCartao = numeroCartao;
      this.nomeTitular = nomeTitular;
      this.dataExpiracao = dataExpiracao;
      this.codigoSeguranca = codigoSeguranca;
    }
  
    public boolean autenticar() {
      if(numeroCartao == null || nomeTitular == null || dataExpiracao == null || codigoSeguranca == null) {
        System.out.println("Cartão não autenticado");
        return false;
      }
  
      System.out.println("Cartão autenticado");
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