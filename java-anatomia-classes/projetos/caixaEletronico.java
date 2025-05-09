import java.util.Scanner;
public class caixaEletronico {

    public static void main(String[] args) throws Exception {

        Scanner movimentacao = new Scanner(System.in);

        double saldo = 25.0;
        double valorSolicitado;
        

        System.out.println("Digite o valor a sacar: ");
        valorSolicitado = movimentacao.nextDouble();



        if(valorSolicitado < saldo)
          saldo = saldo - valorSolicitado;

        System.out.println("seu novo saldo é" + saldo);

    }
}
