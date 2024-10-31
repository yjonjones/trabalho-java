package fil.fil.fitness;
public class ModaPraia extends Roupa{
    
    private String estampa;
    private String tipoRoupa;
    private String material;
            
    
    
public ModaPraia(int numRoupa, String tamanho, String cor, float preço, int quantidadeDisponivel, String statusEstoque, String estampa, String tipoRoupa, String material){
    super(numRoupa, tamanho, cor, preço, quantidadeDisponivel, statusEstoque);
    this.estampa = estampa;
    this.material = material;
    this.tipoRoupa = tipoRoupa;      
    }


@Override
public String getDetalhes(){
    return super.getDetalhes() +
            "/nEstampa: " + estampa +
            "/nMaterial: " + material +
            "/nTipo: " + tipoRoupa;
}
}

   