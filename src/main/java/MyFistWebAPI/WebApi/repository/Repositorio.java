package MyFistWebAPI.WebApi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import MyFistWebAPI.WebApi.Model.Usuario;

@Repository
public class Repositorio {
  public void save(Usuario usuario) {
    if(usuario.getId() == null) {
      System.out.println("Usuario " + usuario.getLogin() + " adicionado com sucesso!");
    } else {
      System.out.println("Usuario " + usuario.getLogin() + " atualizado com sucesso!");
    }
  }
  public void deleteById(Integer id) {
    System.out.println(String.format("Usuario %d removido com sucesso!", id));
    System.out.println(id);  
  }
  public List<Usuario> findAll() {
    System.out.println("Listando todos os usuarios");
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("Leandro","123456"));
    usuarios.add(new Usuario("Lucas","456"));
    
    return usuarios;
    }
      public Usuario findById(Integer id) {
        System.out.println(String.format("Buscando usuario %d", id));
        return new Usuario("Leandro", "123456");    
  }
  
  public Usuario findByUsername(String username) {
    System.out.println(String.format("Buscando usuario %s", username));
    return new Usuario("Leandro", "123456");
    

}
}