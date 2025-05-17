
import java.util.Scanner;

public class Estoque {
  public static void main(String[] args) {

    GestorProduto gestor = new GestorProduto();
    Scanner scanner = new Scanner(System.in);
    String continuar;

    
     do{
    System.out.print("Digite o nome do produto:");
    String nome = scanner.nextLine();
    System.out.print("Digite o preço do produto:");
    double preco = scanner.nextDouble();
    System.out.print("Digite a quantidade do produto:");
    int quantidade = scanner.nextInt();
    scanner.nextLine(); // Limpa o \n pendente


    gestor.adicionarProduto(new Produto(nome, preco, quantidade));

    System.out.println("Deseja cadastrar outro produto? (s/n)");
      continuar = scanner.nextLine();
     }
     while(continuar.equalsIgnoreCase("s"));
    
    
   
    gestor.exibirProdutos();
    
  }

}
