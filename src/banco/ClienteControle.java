package banco;
import java.util.List;
import fil.fil.fitness.Cliente;
public class ClienteControle {
    private final ClienteDAO_1 dao = new ClienteDAO_1();

 public void incluir(Cliente cliente){
 dao.incluir(cliente);
 }
 public void excluir(int cpf){
 dao.excluir(cpf);
 }

 public List<Cliente> obterTodos(){
 return dao.listar();
 }

}
