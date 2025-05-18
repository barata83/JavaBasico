
package agenda;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

  private Map<String, Integer> agendaContatoMap;


public AgendaContatos(){
  this.agendaContatoMap = new HashMap<>();
}
public void adicionarContato(String nome, int telefone) {
  agendaContatoMap.put(nome, telefone);
}
public void removerContato(String nome) {
  
  if(!agendaContatoMap.isEmpty()){
    agendaContatoMap.remove(nome);
  }else{
    System.out.println("A lista de contatos está vazia.");
  }
}
public void exibirContatos() {
  
      System.out.println(agendaContatoMap);
}
public Integer pesquisarPorNome(String nome) {
  Integer numeroPorNome = null;
  if(!agendaContatoMap.isEmpty()){
    numeroPorNome = agendaContatoMap.get(nome);  
  }
  return  numeroPorNome;
}
}
