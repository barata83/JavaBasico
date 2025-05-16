
import java.util.Scanner;

public class calculadoraDeMedia {  public static void main(String[] args) {    
    Scanner scanner = new Scanner(System.in);
    String[] alunos = { "Leandro", "Tiago","Marcelle","Fran"};

    Double media = calculadoraDaTurma(alunos, scanner);

    System.out.printf("Media da turma  %f", media);
  }

    public static double calculadoraDaTurma(String[] alunos, Scanner scanner){
    
    double soma = 0;
    for (String aluno : alunos) {
      System.out.printf("Nota do aluno %s ", aluno);
      Double nota = scanner.nextDouble();
      soma+=nota;
        
    }
return soma / alunos.length;
  }}
