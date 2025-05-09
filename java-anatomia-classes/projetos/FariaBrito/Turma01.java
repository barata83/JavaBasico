
package FariaBrito;

import java.util.Scanner;

public class Turma01 {
  public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);

      // Criar 3 alunos
      Aluno aluno1 = new Aluno(sc.nextLine(), sc.nextInt(), sc.next());
        sc.nextLine();

        Aluno aluno2 = new Aluno(sc.nextLine(), sc.nextInt(), sc.next());
        sc.nextLine();
      

        Aluno aluno3 = new Aluno(sc.nextLine(), sc.nextInt(), sc.next());
        sc.nextLine();
      
   
      System.out.println("Digite um novo nome para o segundo aluno:");
      String novoNome = sc.nextLine();
      aluno2.setNome(novoNome);

      // Exibir informações dos 3 alunos
      System.out.println("\n--- Informações dos Alunos ---");
      aluno1.exibirInformacoes();
      aluno2.exibirInformacoes();
      aluno3.exibirInformacoes();

      sc.close();
  }
}
