package banco;
import java.util.List;
import fil.fil.fitness.ModaAcademia;
public class ModaAcademiaControle {
    private final ModaAcademiaDAO dao = new ModaAcademiaDAO();

 public void incluir(ModaAcademia modaacademia){
 dao.incluir(modaacademia);
 }
 public void excluir(int numRoupa){
 dao.excluir(numRoupa);
 }

 public List<ModaAcademia> obterTodos(){
 return dao.listar();
 }

}
