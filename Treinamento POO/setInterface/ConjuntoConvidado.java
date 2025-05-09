
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

  private Set<Convidado> convidadosSet;

  public ConjuntoConvidado(){
    convidadosSet = new HashSet<>();
  }

  public void adicionadConvidado(String nome, int codifoConvite){
    convidadosSet.add(new Convidado(nome, codifoConvite));
  }

  public void removerConvidadio(int codigoConvite){
    Convidado convidadoParaRemover = null;
    for (Convidado convidado : convidadosSet) {
      if (convidado.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = convidado;
        break;
      }
      convidadosSet.remove(convidadoParaRemover);
    }
  }

    
  
  public void contarConvidado(){  
    System.out.println("Total de convidados: " + convidadosSet.size());
  }

  public void exibirConvidados(){
    for (Convidado convidado : convidadosSet) {
      System.out.println(convidado);
    }
  }
          
        
      
    }
  

 

