
import java.util.Scanner;

public class fatorial {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero= scanner.nextInt();
int fatoria=1;
int i = 1;
    
while(i <= numero){
      fatoria *= i;
    i++;
    }
    System.out.println("O fatorial de " + numero + " é " + fatoria);
  }
  
}
