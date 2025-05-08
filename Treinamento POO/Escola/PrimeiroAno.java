public class PrimeiroAno {
  private String nome;
  private String matricula;
  private int nota1;
  private int nota2;

  public PrimeiroAno(String nome, String matricula, int nota1, int nota2) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota1 = nota1;
    this.nota2 = nota2;
  }

    PrimeiroAno(String nome, String matricula) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
  public String getNome() {
    return nome;
  }
  public String getMatricula() {
    return matricula;
  }
  public int getNota1() {
    return nota1;
  }
  public int getNota2() {
    return nota2;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
  public void setNota1(int nota1) {
    this.nota1 = nota1;
  }
  public void setNota2(int nota2) {
    this.nota2 = nota2;
  }
  public double calcularMedia() {
    return (nota1 + nota2) / 2.0;
  }
  public void aprovação(){
    if(calcularMedia() >= 7){
      System.out.println("Aprovado");
    } else if(calcularMedia() >= 5) {
      System.out.println("Recuperação");
    } else {
      System.out.println("Reprovado");
    }
  }
}
