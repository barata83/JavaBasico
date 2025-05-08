public class Livro{

  private String titulo;
  private String autor;
  private int anoPublicaçao;

  

  public Livro(String titulo, String autor, int anoPublicaçao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicaçao = anoPublicaçao;


  }



  public String getTitulo() {
    return titulo;
  }



  public String getAutor() {
    return autor;
  }



  public int getAnoPublicaçao() {
    return anoPublicaçao;
  }
  public void catalogo(){
    System.out.println("O Titulo é " + titulo);
   System.out.println("O autor é " +  autor);
    System.out.println("Foi publicado em " + anoPublicaçao);}

  
}