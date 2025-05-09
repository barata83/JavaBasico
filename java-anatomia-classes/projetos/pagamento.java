
import java.util.Scanner;

public class pagamento {
  public static void main(String[] args) {    
   bruto();   
  }
    static void bruto(){
    Scanner scanner = new Scanner(System.in);
               
    System.out.println("Digite o valor do salario bruto: ");
    float salarioBruto = scanner.nextFloat();

    System.out.println("Digite o valor dos beneficios: ");
    float beneficios = scanner.nextFloat();


    float salario = salarioBruto + beneficios;
    System.out.println("O Salario bruto com beneficos é R$" + salario);

        
    imposto(salarioBruto, beneficios);
  }
 static void imposto(float salarioBruto, float beneficios){
  float salarioComDesconto = 0;

  if(salarioBruto < 1100.00){
    salarioComDesconto = salarioBruto - (salarioBruto * 0.05f);    
  }else if(salarioBruto >= 1100.00 && salarioBruto < 2500.00){
    salarioComDesconto = salarioBruto - (salarioBruto * 0.10f);    
  }  else if (salarioBruto >= 2500.00){
    salarioComDesconto = salarioBruto - (salarioBruto * 0.15f);
  }
 System.out.println("O salario bruto com desconto é de R$" + salarioComDesconto );

 valorDepositado (beneficios, salarioComDesconto);
}
 static void valorDepositado(float beneficios, float salarioComDesconto ){
  
  float valorDepositado = beneficios + salarioComDesconto;
  System.out.println("O valor a ser depositado é de R$" + valorDepositado);
 }

}
  