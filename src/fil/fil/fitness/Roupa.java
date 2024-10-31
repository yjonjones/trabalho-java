package fil.fil.fitness;
public abstract class Roupa {
    
    private int numRoupa;
    private String tamanho;
    private String cor;
    private float preço;
    private int quantidadeDisponivel;
    private String statusEstoque;
    private boolean disponibilidade ;


public Roupa(int numRoupa, String tamanho, String cor, float preço, int quantidadeDisponivel, String statusEstoque){
    
    this.numRoupa = numRoupa;
    this.tamanho = tamanho;
    this.cor = cor;
    this.preço = preço;
    this.quantidadeDisponivel = quantidadeDisponivel;
    this.statusEstoque = statusEstoque;
   }

public String getDetalhes(){
    return "Número da Roupa: " + numRoupa +
            "\nTamanho: " + tamanho +
            "\nCor: " + cor +
            "\nPreço: " + preço +
            "\nQuantidade Disponível: " + quantidadeDisponivel +
            "\nStatus do Estoque: " + statusEstoque;
}
public int getNumRoupa() {
        return numRoupa;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    public float getPreço() {
        return preço;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public boolean Disponibilidade(){
          if (quantidadeDisponivel > 0 ) {
              disponibilidade = true;
          }
          else{
              disponibilidade = false;
          }
          return disponibilidade;
         }
    
    public String getStatusEstoque() {
        if (disponibilidade == true){
            statusEstoque = "disponivel";
        }
        else{
        statusEstoque = "não disponivel";
        }
        return statusEstoque;
    }
}