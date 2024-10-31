package banco;
import java.util.List;
import fil.fil.fitness.ModaPraia;
public class ModaPraiaControle {
    private final ModaPraiaDao dao = new ModaPraiaDao();

 public void incluir(ModaPraia modapraia){
 dao.incluir(modapraia);
 }
 public void excluir(int numRoupa){
 dao.excluir(numRoupa);
 }

 public List<ModaPraia> obterTodos(){
 return dao.listar();
 }

}
