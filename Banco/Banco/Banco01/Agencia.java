
import java.util.Scanner;

public class Agencia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Deposito inicial: R$ ");
    float depositoInicial = scanner.nextFloat();

    var conta = new ContaCorrente(depositoInicial);

    conta.abrirConta();

   
    while (true) {
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Ver cheque especial");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Saldo atual: R$ " + conta.getSaldo());
        } else if (opcao == 2) {
            System.out.print("Informe o valor do saque: ");
            float valor = scanner.nextFloat();
            conta.sacar(valor);
        } else if (opcao == 3) {
            System.out.println("Cheque especial disponível: R$ " + conta.getChequeEspecial());
        } else if (opcao == 0) {
            System.out.println("Encerrando programa...");
            break;
        } else {
            System.out.println("Opção inválida.");
        }
    }

    scanner.close();
}
}






