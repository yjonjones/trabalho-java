package fil.fil.fitness;
public class ModaPraia extends Roupa{
    
    public static String estampa;
    public static String tipoRoupa;
    public static String material;
    public static float preco;
    public static int quantidadeDiponivel;
            
    
    
public ModaPraia(int numRoupa, String tamanho, String cor, float preço, int quantidadeDisponivel
        , String statusEstoque, String estampa, String tipoRoupa, String material){
    super(numRoupa, tamanho, cor, preço, quantidadeDisponivel, statusEstoque);
    ModaPraia.estampa = estampa;
    ModaPraia.material = material;
    ModaPraia.tipoRoupa = tipoRoupa;      
    }

 ModaPraia() {
    }


@Override
public String getDetalhes(){
    return super.getDetalhes() +
            "/nEstampa: " + estampa +
            "/nMaterial: " + material +
            "/nTipo: " + tipoRoupa;
}
}

   