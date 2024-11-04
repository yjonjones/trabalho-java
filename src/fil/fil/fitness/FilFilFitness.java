package fil.fil.fitness;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import banco.ClienteControle;
import banco.FornecedorControle;
import banco.ModaAcademiaControle;
import banco.ModaPraiaControle;
public class FilFilFitness {
   public static void main(String[] args) throws IOException {

 ClienteControle controlec = new ClienteControle();
 FornecedorControle controlef = new FornecedorControle();
 ModaAcademiaControle controlea = new ModaAcademiaControle();
 ModaPraiaControle controlep = new ModaPraiaControle();
 BufferedReader teclado = new BufferedReader(
 new InputStreamReader(System.in));
 String opcao = null;
System.out.println("1-Digite cliente para adcionar ou alterar cliente// Digite fornecedor para adcionar ou alterar cliente// Digite roupa Praia para adcionar ou alterar Uma roupa de praia// Digite roupa academia para adcionar ou alterar uma roupa de academia");
 opcao = teclado.readLine();
 //cliente
 if(opcao.equals("cliente")){
 do{
 controlec.obterTodos().forEach((cliente) -> {
 System.out.println(cliente.numCliente+" :: "+cliente.nome+
 " :: "+cliente.cpf+" :: "+cliente.telefone);
 });
 System.out.println("1-Incluir 2-Excluir 0-Sair");
 opcao = teclado.readLine();
 if(opcao.equals("1")){
 Cliente cliente = new Cliente();
 System.out.println("Cliente de numero:");
 cliente.numCliente = Integer.parseInt(teclado.readLine());
 System.out.println("Nome:");
 cliente.nome = teclado.readLine();
 System.out.println("CPF:");
 cliente.cpf = teclado.readLine();
 System.out.println("Telefone:");
 cliente.telefone = Integer.parseInt(teclado.readLine());
 controlec.incluir(cliente);
 }
 if(opcao.equals("2")){
 System.out.println("Numero do cliente que deseja excluir:");
 controlec.excluir(Integer.parseInt(teclado.readLine()));
 }
 }while(!opcao.equals("0"));
 }
 //Fornecedor 
 if(opcao.equals("fornecedor")){
    do{
 controlef.obterTodos().forEach((Fornecedor fornecedor) -> {
     System.out.println(Fornecedor.numFornecedor+" :: "+Fornecedor.nome+
             " :: "+Fornecedor.status+" :: "+Fornecedor.telefone);
 });
 System.out.println("1-Incluir 2-Excluir 0-Sair");
 opcao = teclado.readLine();
 if(opcao.equals("1")){
Fornecedor fornecedor = new Fornecedor();
 System.out.println("Fornecedor de numero:");
 Fornecedor.numFornecedor = Integer.parseInt(teclado.readLine());
 System.out.println("Nome:");
 Fornecedor.nome = teclado.readLine();
 System.out.println("Status:");
 Fornecedor.status = teclado.readLine();
 System.out.println("Telefone:");
 Fornecedor.telefone = Integer.parseInt(teclado.readLine());
 controlef.incluir(fornecedor);
 }
 if(opcao.equals("2")){
 System.out.println("Numero do Fornecedor que deseja excluir:");
 controlef.excluir(Integer.parseInt(teclado.readLine()));
 }
 }while(!opcao.equals("0")); 
 }
 //Moda Academia
 if(opcao.equals("roupa academia")){
    do{
 controlea.obterTodos().forEach((var modaacademia) -> {
     System.out.println(ModaAcademia.numRoupa+" :: "+ModaAcademia.tamanho+
             " :: "+ModaAcademia.cor+" :: "+ModaAcademia.preco+ "::"+ModaAcademia.quantidadeDisponivel+"::"+ModaAcademia.statusEstoque+
             "::"+ModaAcademia.tipoRoupa+"::"+ModaAcademia.material);
 });
 System.out.println("1-Incluir 2-Excluir 0-Sair");
 opcao = teclado.readLine();
 if(opcao.equals("1")){
ModaAcademia modaacademia = new ModaAcademia();
 System.out.println("Roupa de numero:");
 ModaAcademia.numRoupa = Integer.parseInt(teclado.readLine());
 System.out.println("Tamanho:");
 ModaAcademia.tamanho = teclado.readLine();
 System.out.println("Cor:");
 ModaAcademia.cor = teclado.readLine();
 System.out.println("Preço:");
 ModaAcademia.preco = Float.parseFloat(teclado.readLine());
 System.out.println("Quantidade Disponivel:");
 ModaAcademia.quantidadeDiponivel = Integer.parseInt(teclado.readLine());
  System.out.println("Estatus do Estoque On ou Off:");
 ModaAcademia.statusEstoque = teclado.readLine();
  System.out.println("Tipo da roupa:");
 ModaAcademia.tipoRoupa = teclado.readLine();
  System.out.println("Material:");
 ModaAcademia.material = teclado.readLine();
 controlea.incluir(modaacademia);
 }
 if(opcao.equals("2")){
 System.out.println("Numero da roupa de academia que deseja excluir:");
 controlef.excluir(Integer.parseInt(teclado.readLine()));
 }
 }while(!opcao.equals("0")); 
 }
 //moda Praia
 if(opcao.equals("roupa praia")){
    do{
 controlep.obterTodos().forEach((ModaPraia modapraia) -> {
     System.out.println(ModaPraia.numRoupa+" :: "+ModaPraia.tamanho+
             " :: "+ModaPraia.cor+" :: "+ModaPraia.preco+ "::"+ModaPraia.quantidadeDisponivel+"::"+ModaPraia.statusEstoque+
             "::"+ModaPraia.estampa+"::" +ModaPraia.tipoRoupa+"::"+ModaPraia.material);
 });
 System.out.println("1-Incluir 2-Excluir 0-Sair");
 opcao = teclado.readLine();
 if(opcao.equals("1")){
ModaPraia modapraia = new ModaPraia();
 System.out.println("Roupa de numero:");
 ModaPraia.numRoupa = Integer.parseInt(teclado.readLine());
 System.out.println("Tamanho:");
 ModaPraia.tamanho = teclado.readLine();
 System.out.println("Cor:");
 ModaPraia.cor = teclado.readLine();
 System.out.println("Preço:");
 ModaPraia.preco = Float.parseFloat(teclado.readLine());
 System.out.println("Quantidade Disponivel:");
 ModaPraia.quantidadeDiponivel = Integer.parseInt(teclado.readLine());
  System.out.println("Estatus do Estoque On ou Off:");
 ModaPraia.statusEstoque = teclado.readLine();
  System.out.println("Estampa:");
 ModaPraia.estampa = teclado.readLine();
  System.out.println("Material:");
 ModaAcademia.material = teclado.readLine();
  System.out.println("Tipo da Roupa:");
 ModaAcademia.tipoRoupa = teclado.readLine();
 controlep.incluir(modapraia);
 }
 if(opcao.equals("2")){
 System.out.println("Numero da roupa de praia que deseja excluir:");
 controlep.excluir(Integer.parseInt(teclado.readLine()));
 }
 }while(!opcao.equals("0")); 
 }
   }
}
