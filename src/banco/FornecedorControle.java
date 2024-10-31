package banco;
import java.util.List;
import fil.fil.fitness.Fornecedor;
public class FornecedorControle {
    private final FornecedorDAO dao = new FornecedorDAO();

 public void incluir(Fornecedor fornecedor){
 dao.incluir(fornecedor);
 }
 public void excluir(int numFornecedor){
 dao.excluir(numFornecedor);
 }

 public List<Fornecedor> obterTodos(){
 return dao.listar();
 }

}
