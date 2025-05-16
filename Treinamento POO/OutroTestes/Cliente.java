
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaCorrente C4591 = new ContaCorrente();
        
        C4591.setDono("leandro Correa Barata");
        C4591.setNumeroConte(56854);
        C4591.abrirConta("cc");
        C4591.getSaldo();

        System.out.println("Qual valor de deposito ?");    
        C4591.depositar(scanner.nextInt());

        C4591.extrato();
        
        
      
        
  
}}