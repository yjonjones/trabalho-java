package fil.fil.fitness;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import banco.ClienteControle;
import banco.ModaAcademiaControle;

public class FilFilFitness {
  public static void main(String[] args) throws IOException {

  ModaAcademiaControle controleACD = new ModaAcademiaControle();
 do{
  controleACD.obterTodos().forEach((moda) -> {
    System.out.println(moda.numRoupa+" :: "+moda.tamanho+
    " :: "+moda.cor+" :: "+moda.preço+" :: "+moda.quantidadeDisponivel+
    " :: "+moda.statusEstoque+" :: "+moda.tipoRoupa+" :: "+moda.material);
  });
  System.out.println("1-Incluir 2-Excluir 0-Sair");
  opcao = Integer.parseInt(teclado.readLine());
  if(opcao==1){
    ModaAcademia moda = new ModaAcademia();
    System.out.println("NumRoupa:");
    moda.numRoupa = Integer.parseInt(teclado.readLine());
    System.out.println("Tamanho:");
    moda.tamanho = teclado.readLine();
    System.out.println("Cor:");
    moda.cor = teclado.readLine();
    System.out.println("Preço:");
    moda.preço = Float.parseFloat(teclado.readLine());
    System.out.println("Quantidade Disponivel:");
    moda.quantidadeDisponivel = Integer.parseInt(teclado.readLine());
    System.out.println("Status Estoque:");
    moda.statusEstoque = teclado.readLine();
    System.out.println("Tipo Roupa:");
    moda.tipoRoupa = teclado.readLine();
    System.out.println("Material:");
    moda.material = teclado.readLine();
    controleACD.incluir(moda);
  }
  if(opcao==2){
    System.out.println("NumRoupa:");
    controleACD.excluir(Integer.parseInt(teclado.readLine()));
  }
 }while(opcao!=0);
 
 ClienteControle controle = new ClienteControle();
 BufferedReader teclado = new BufferedReader(
 new InputStreamReader(System.in));
 int opcao;
 do{
 controle.obterTodos().forEach((cliente) -> {
 System.out.println(cliente.numCliente+" :: "+cliente.nome+
 " :: "+cliente.cpf+" :: "+cliente.telefone);
 });
 System.out.println("1-Incluir 2-Excluir 0-Sair");
 opcao = Integer.parseInt(teclado.readLine());
 if(opcao==1){
 Cliente cliente = new Cliente();
 System.out.println("Cliente de numero:");
 cliente.numCliente = Integer.parseInt(teclado.readLine());
 System.out.println("Nome:");
 cliente.nome = teclado.readLine();
 System.out.println("CPF:");
 cliente.cpf = Integer.parseInt(teclado.readLine());
 System.out.println("Telefone:");
 cliente.telefone = Integer.parseInt(teclado.readLine());
 controle.incluir(cliente);
 }
 if(opcao==2){
 System.out.println("Numero:");
 controle.excluir(Integer.parseInt(teclado.readLine()));
 }
 }while(opcao!=0);
 }
}
