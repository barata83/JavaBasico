
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {

  List<String>nomes = new ArrayList<>();
  Scanner scanner = new Scanner(System.in);

  public void adicionarNome(){
    System.out.println("Digite o nome do aluno:");
    nomes.add(scanner.nextLine());
    
  }

  public void listarNomes(){
    System.out.println("Lista de nomes:");
    for (String nome : nomes) {
      System.out.println(nome);
    }
}
  public void removerNome(){
    System.out.println("Digite o nome do aluno que deseja remover:");
    String nome = scanner.nextLine();
    if (nomes.remove(nome)) {
      System.out.println("Nome removido com sucesso.");
    } else {
      System.out.println("Nome não encontrado na lista.");
    }
  }
  public void pesquisarNome(){
    System.out.println("Digite o nome do aluno que deseja pesquisar:");
    String nome = scanner.nextLine();
    if (nomes.contains(nome)) {
      System.out.println("Nome encontrado na lista.");
    } else {
      System.out.println("Nome não encontrado na lista.");
    }
    
  }
}


