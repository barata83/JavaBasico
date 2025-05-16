import java.util.ArrayList;
import java.util.Scanner;

public class contatos {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String resposta = "sim"; // inicializa para entrar no loop

        while (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Digite um nome:");
            String name = scanner.nextLine();
            names.add(name); // adiciona o nome à lista

            System.out.println("Deseja continuar? (sim/nao)");
            resposta = scanner.nextLine(); // lê a nova resposta
        }

        System.out.println("Lista final de contatos:");
        for (String n : names) {
            System.out.println(n);
        }

        scanner.close();
    }
}
