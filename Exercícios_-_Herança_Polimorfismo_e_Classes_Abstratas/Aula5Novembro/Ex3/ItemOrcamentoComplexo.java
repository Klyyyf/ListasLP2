package Aula5Novembro.Ex3;

public class ItemOrcamentoComplexo extends ItemOrcamento {
    protected ItemOrcamento v[];
  
    public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento v[]) {
      super(historico, valor);
      this.v = v;
    }
  
    @Override
    public float getValor() {
      float soma = 0;
      for(int i = 0; i < v.length; i++) {
        soma += v[i].getValor();
      }
      return soma;
    }
  
      public String encontraItem(String historico) {
      if(v.length > 0) {
        for(int i = 0; i < v.length; i++) {
          if(historico == v[i].getHistorico()) {
            return v[i].getHistorico();
          } 
        }
      }
      return null;
    }
  }
