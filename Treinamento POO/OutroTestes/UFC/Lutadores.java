package NovaAula;

import java.util.Scanner;

public class Lutadores {
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  Lutador lutador[] = new Lutador[6];

  lutador[0]= new Lutador("PutScript", "frances", 31, 1.78f, 20f, 11, 2 ,1);
  lutador[1]=new Lutador("Pretty", "frances", 29, 1.68f, 57.8f, 14,2,1);
  lutador[2]=new Lutador("oscar","brasileiro",25 ,1.97f ,80.9f ,15 ,5, 4);
  lutador[3]=new Lutador("AndersonSpider", "argentino", 18, 1.75f, 81.6f, 14,5,5);
  lutador[4]=new Lutador("krigor","romeno",45, 1.77f, 105.5f ,5,8,0);
  lutador[5]=new Lutador ("Flex","colombiano",35, 1.98f, 119.8f,15,5,0);


  lutador[0].status();
 lutador[0].apresentar();

 
}
}
