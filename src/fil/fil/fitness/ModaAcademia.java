package fil.fil.fitness;
public class ModaAcademia extends Roupa{
    
    public static String tipoRoupa;
    public static String material;
    public static float preco;
    static int quantidadeDiponivel;
   
    
    
public ModaAcademia(int numRoupa, String tamanho, String cor, float preço, int quantidadeDisponivel, String statusEstoque, String tipoRoupa, String material){
    super(numRoupa, tamanho, cor, preço, quantidadeDisponivel, statusEstoque);
    ModaAcademia.material = material;
    ModaAcademia.tipoRoupa = tipoRoupa;      
    }

   ModaAcademia() {
    }


@Override
public String getDetalhes(){
    return super.getDetalhes() +
            "/nMaterial: " + material +
            "/nTipo: " + tipoRoupa;
}
}

  
