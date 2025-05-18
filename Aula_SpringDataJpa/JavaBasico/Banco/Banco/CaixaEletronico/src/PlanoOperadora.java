
import java.util.Scanner;

public class PlanoOperadora {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    

System.out.println("Digite a letra de seu plano de operadora; ");
String plano = scanner.nextLine();
    

    switch (plano) {      
        case "T":{
          System.out.println("5gb youtube");
        }case "M":{
          System.out.println("What e instagram gratis");
        }case "B":{
          System.out.println("100 MINUTOS DE LIGAÇÃO");
        }
            
            break;
        default:
            throw new AssertionError();
    }

  }
}
