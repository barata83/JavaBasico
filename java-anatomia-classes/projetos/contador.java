import java.util.InputMismatchException;
import java.util.Scanner;

public class contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;

        try {
            System.out.println("Digite o primeiro parâmetro:");
            parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro:");
            parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois); // Chama o método contar

        } catch (InputMismatchException e) {
            System.err.println("Erro: Entrada inválida. Por favor, digite números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        } finally {
            terminal.close();
            System.out.println("Fim do programa.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Erro: O primeiro parâmetro deve ser menor ou igual ao segundo.");
        }

        int contagem = parametroDois - parametroUm;
        System.out.println("Contagem:");
        for (int i = 0; i <= contagem; i++) {
            System.out.print((parametroUm + i) + " ");
        }
        System.out.println();
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}