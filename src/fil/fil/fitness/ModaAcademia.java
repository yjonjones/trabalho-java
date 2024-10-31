package fil.fil.fitness;
public class ModaAcademia extends Roupa{
    
    private String tipoRoupa;
    private String material;
            
    
    
public ModaAcademia(int numRoupa, String tamanho, String cor, float preço, int quantidadeDisponivel, String statusEstoque, String tipoRoupa, String material){
    super(numRoupa, tamanho, cor, preço, quantidadeDisponivel, statusEstoque);
    this.material = material;
    this.tipoRoupa = tipoRoupa;      
    }


@Override
public String getDetalhes(){
    return super.getDetalhes() +
            "/nMaterial: " + material +
            "/nTipo: " + tipoRoupa;
}

}

