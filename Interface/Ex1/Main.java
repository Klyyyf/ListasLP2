public class Main {
    public static void main(String[] args) {
      CartaoCredito cartao = new CartaoCredito(100.0f, "1234567890123456", "José", "12/24", null);
      Boleto boleto = new Boleto(100.0f, "123456", "12/24");
      Pix pix = new Pix(100.0f, "123456", 10.0f);
  
      cartao.realizarPagamento();
      pix.realizarPagamento();
      boleto.realizarPagamento();
    }
  }