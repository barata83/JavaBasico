
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
  public static void main(String[] args) {
    
  

    System.out.println("Processo seletivo\n");
    imprimirSelecionados();
    selecaoCandidatos();

    String [] candidatos = {"Leandro","Tiago","Marcelle","Fran","Gabriel"};
    for(String candidato: candidatos){
      entrandoEmContato(candidato); 
    }
  }
static void entrandoEmContato(String candidato){
   int tentativasRealizadas = 1;
   boolean continuarTentando =true;
   boolean atendeu=false;
   do { 
       atendeu = atender();
       continuarTentando = !atendeu;
       if(continuarTentando)
       tentativasRealizadas++;
       else
       System.out.println("Contato realizado com sucesso ");
  }while(continuarTentando && tentativasRealizadas<3);

  if(atendeu)
  System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
  else
    System.out.println("Não Conseguimos contato com "  + candidato + " numero maxim de tentativa " + tentativasRealizadas + " realizada");
  
}

    static boolean atender(){
      return new Random().nextInt(3)==1;   
    
  }

  static void imprimirSelecionados(){
    String [] candidatos = {"Leandro","Tiago","Marcelle","Fran","Gabriel"}; 

    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
    
    for(int indice=0; indice < candidatos.length; indice++){
      System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);

    }
    System.out.println("\n Forma abreviada de interação for each");

    for(String candidato: candidatos){
      System.out.println(" \n o candidato selecionado foi "  + candidato);
    }
  }

  
   static void selecaoCandidatos(){

    String [] candidatos = {"Leandro","Tiago","Marcelle","Fran","Gabriel"};

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;


    while(candidatosSelecionados < 5  &&  candidatoAtual < candidatos.length){
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("\n O candidato "+ candidato + " solicitou esta valor de salario"  + salarioPretendido );
      if(salarioBase >= salarioPretendido){
        System.out.println("O candidato "+ candidato + " foi selecionado para vaga ");
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }
    System.out.println("------------------------------");
    System.out.println("Total de candidatos selecionados: " + candidatosSelecionados);
   }
   static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800, 2200);

   }


  static void analisarCandidatos( double salarioPretendido){
  double salarioBase = 2000.0;

  if(salarioBase > salarioPretendido){
    System.out.println("Ligar para candidato");
      }else if(salarioBase ==salarioPretendido){
        System.out.println("Ligar para candidato com contraproposta");
         }else
         {System.out.println("Aguardar resultado dos demais candidatos");
        }
      }
    }
