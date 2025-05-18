package SpringDataJpa.Aula_SpringDataJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import SpringDataJpa.Aula_SpringDataJpa.Model.Usuario;
import SpringDataJpa.Aula_SpringDataJpa.RepositorioUsuario.Repositorio;

@Component
public class StartAPP implements CommandLineRunner {
  
  @Autowired
  private Repositorio repositorio;
  @Override
    public void run(String... args) throws Exception {
      Usuario usuario = new Usuario();
      usuario.setNome("Leandro");
      usuario.setUsername("lucas");
      usuario.setPassword("123456");
      repositorio.save(usuario);

      for(Usuario u : repositorio.findAll()){
        System.out.println(u);
      }}}

//@Component é uma anotação do Spring que indica que a classe é um componente gerenciado pelo Spring.
// Isso significa que o Spring irá criar uma instância dessa classe e gerenciá-la durante o ciclo de vida da aplicação.
//@Autowired é uma anotação do Spring que indica que o Spring deve injetar uma dependência na classe.
// Isso significa que o Spring irá fornecer uma instância da classe Repositorio para a classe StartAPP.
// Isso é útil para que você possa usar a classe Repositorio dentro da classe StartAPP sem precisar criar uma instância dela manualmente.
//@Override é uma anotação do Java que indica que o método está sobrescrevendo um método da superclasse.
// Isso significa que o método run() está sobrescrevendo o método run() da interface CommandLineRunner.
// Isso é útil para que você possa fornecer uma implementação personalizada do método run() na classe StartAPP.