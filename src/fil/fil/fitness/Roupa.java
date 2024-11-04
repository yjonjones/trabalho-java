package fil.fil.fitness;
public abstract class Roupa {
    
   public static int numRoupa;
    public static String tamanho;
    public static String cor;
    public static float preço;
    public static int quantidadeDisponivel;
    public static String statusEstoque;


public Roupa(int numRoupa, String tamanho, String cor, float preço, int quantidadeDisponivel, String statusEstoque){
    
    Roupa.numRoupa = numRoupa;
    Roupa.tamanho = tamanho;
    Roupa.cor = cor;
    Roupa.preço = preço;
    Roupa.quantidadeDisponivel = quantidadeDisponivel;
    Roupa.statusEstoque = statusEstoque;
   }
 Roupa() {
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
}
