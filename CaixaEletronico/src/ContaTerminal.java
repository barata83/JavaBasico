import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
            Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o numero de sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite seu saldo: ");
        Float saldo = scanner.nextFloat();

        System.out.printf("\n Olá %s obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque ", nomeCliente, agencia, numeroConta, saldo);   }
}
