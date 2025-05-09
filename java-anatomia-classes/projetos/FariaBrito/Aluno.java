package FariaBrito;

public class Aluno{

  private String nome;
  private int idade;
  private String matricula;

  Aluno(String nome, int idade, String matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
  
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public int getIdade(){
    return idade;
  }
  public void setIdade(int idade){
  this.idade = idade;
}

public String getMatricula(){
  return matricula;
}

public void setMatricula(String matricula){
  this.matricula = matricula;
}

public void exibirInformacoes() {
  System.out.println("Nome: " + nome);
  System.out.println("Idade: " + idade);
  System.out.println("Matrícula: " + matricula);
  System.out.println("------------------------");
}
}