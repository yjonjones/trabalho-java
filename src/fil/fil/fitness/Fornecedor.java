package fil.fil.fitness;
public class Fornecedor {
    public static int numFornecedor;
    public static String nome;
    public static String status;
    public static int telefone;
    
    public Fornecedor(int numFornecedor, String nome, String status, int telefone){
    Fornecedor.numFornecedor = numFornecedor;
    Fornecedor.nome = nome;
    Fornecedor.status = status;  
    Fornecedor.telefone = telefone;
    }
    
    public int getNumeroFornecedor(){
        return numFornecedor;
    }
    
        public String getnome(){
        return nome;
    }
        
            public String getstatus(){
        return status;
    }
            
                public int gettelefone(){
        return telefone;
    }
}