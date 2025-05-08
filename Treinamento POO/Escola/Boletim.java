public class Boletim {

  public static void main(String[] args) {
    PrimeiroAno aluno1 = new PrimeiroAno("João", "12345", 8, 9);    
    PrimeiroAno aluno2 = new PrimeiroAno("Maria", "67890", 6, 7);
    PrimeiroAno aluno3 = new PrimeiroAno("Pedro", "54321", 4, 5);

    System.out.println("Nome: " + aluno1.getNome());
    System.out.println("Matrícula: " + aluno1.getMatricula());
    System.out.println("Nota 1: " + aluno1.getNota1());
    System.out.println("Nota 2: " + aluno1.getNota2());
    System.out.println("Média: " + aluno1.calcularMedia());
    aluno1.aprovação();

    System.out.println("\nNome: " + aluno2.getNome());
    System.out.println("Matrícula: " + aluno2.getMatricula());
    System.out.println("Nota 1: " + aluno2.getNota1());
    System.out.println("Nota 2: " + aluno2.getNota2());
    System.out.println("Média: " + aluno2.calcularMedia());
    aluno2.aprovação();

    System.out.println("\nNome: " + aluno3.getNome());
    System.out.println("Matrícula: " + aluno3.getMatricula());
    System.out.println("Nota 1: " + aluno3.getNota1());
    System.out.println("Nota 2: " + aluno3.getNota2());
    System.out.println("Média: " + aluno3.calcularMedia());
    aluno3.aprovação();
  }

}
