abstract class Pagamento {
    protected float valor;
  
    public Pagamento(float valor) {
      this.valor = valor;
    }
  
    public float getValor() {
      return valor;
    }
  
    public void setValor(float valor) {
      this.valor = valor;
    }
  
    public void realizarPagamento(){
      
    }
  }