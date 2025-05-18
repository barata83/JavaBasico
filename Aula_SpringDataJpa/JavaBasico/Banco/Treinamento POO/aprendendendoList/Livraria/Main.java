public class Main {

  public static void main(String[] args) {
    CatalogoLivros catalogo = new CatalogoLivros();
    
    catalogo.adicionarLivro("O Corpo", "Marcelo", 1983);
    catalogo.adicionarLivro("Java Básico", "João", 2020);
    catalogo.adicionarLivro("Estrutura de Dados", "Ana", 2019);
    catalogo.adicionarLivro("Clean Code", "Robert C. Martin", 2008);
    catalogo.adicionarLivro("Design Patterns", "Erich Gamma", 1994);
    catalogo.adicionarLivro("Refatoração", "Martin Fowler", 1999);
    catalogo.adicionarLivro("Spring Boot em Ação", "Craig Walls", 2016);
    catalogo.adicionarLivro("Algoritmos", "Thomas Cormen", 2009);
    catalogo.adicionarLivro("Effective Java", "Joshua Bloch", 2018);
    

  catalogo.mostrarTodos();
}}
