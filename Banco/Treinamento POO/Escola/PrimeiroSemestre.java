import java.util.ArrayList;
import java.util.List;

public class PrimeiroSemestre {

  private List<PrimeiroAno> alunos;

  public PrimeiroSemestre() {
    this.alunos = new ArrayList<>();
  }

  public void adicionarAluno(String nome, String matricula) {
    alunos.add(new PrimeiroAno(nome, matricula));
  }

    
  

}
