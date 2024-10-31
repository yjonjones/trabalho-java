package fil.fil.fitness;
public class Cliente {
    public int numCliente;
    public String nome;
    public int cpf;
    public int telefone;
    
    public Cliente(int numCliente, String nome, int cpf, int telefone){
    this.numCliente = numCliente;
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
}

    Cliente() {
    }
    public int getNumeroCliente(){
        return numCliente;
    }
    
        public String getnome(){
        return nome;
    }
        
            public int getcpf(){
        return cpf;
    }
            
                public int gettelefone(){
        return telefone;
    }
    
}
