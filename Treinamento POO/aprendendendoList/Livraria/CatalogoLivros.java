
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros{

  private List<Livro> livrosList;

  public CatalogoLivros() {
    this.livrosList = new ArrayList<>();
  }
  public void adicionarLivro(String livro, String autor, int anoPublicaçao){
    livrosList.add(new Livro(livro, autor, anoPublicaçao));

  }
  public List<Livro> pesquisarPorAutor(String autor){
    List<Livro> LivrosPorAutor = new ArrayList<>();
    if(!livrosList.isEmpty()){
      for(Livro l : livrosList){
        if(l.getAutor().equalsIgnoreCase(autor)){
          LivrosPorAutor.add(l);
        }
      }
    }
    return LivrosPorAutor;
  }
  public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
    List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
    if(!livrosList.isEmpty()){
      for (Livro l : livrosList) {
        if(l.getAnoPublicaçao()>=anoInicial && l.getAnoPublicaçao() <= anoFinal){
          livrosPorIntervaloDeAnos.add(l);
        }
      }
    }
    return livrosPorIntervaloDeAnos;
  }
  
  public Livro pesquisarPorTitulo(String Titulo){
    Livro livroPorTitulo = null;
    if(!livrosList.isEmpty()){
      for(Livro l : livrosList){
        if(l.getTitulo().equalsIgnoreCase(Titulo)){
          livroPorTitulo = l;
          break;
        }
      }
      
    }
  return livroPorTitulo;
}
public void mostrarTodos() {
  for (Livro livro : livrosList) {
    System.out.println("------------------------------");
    livro.catalogo();
    System.out.println("------------------------------\n");
  }
}
}






  



  
  
