
import java.util.ArrayList;
import java.util.List;

public class GestorProduto {

  List<Produto> produtos = new ArrayList<>();

  public void adicionarProduto(Produto produto) {
    produtos.add(produto);

  }
  public void removerProduto(Produto produto){
    produtos.remove(produto);

  }
  public void exibirProdutos() {
    if (produtos.isEmpty()) {
      System.out.println("Nenhum produto cadastrado.");
    } else {
      System.out.println("Produtos cadastrados:");
      for (Produto produto : produtos) {
        System.out.println(produto);
      }
    }
  }
}
