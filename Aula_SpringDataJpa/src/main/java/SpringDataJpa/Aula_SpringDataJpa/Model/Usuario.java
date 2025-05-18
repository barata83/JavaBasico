package SpringDataJpa.Aula_SpringDataJpa.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  @Column(name = "use_id")
  private Integer id;
  @Column(length=50, nullable = false)
   private String nome;
  @Column(length=50, nullable = false)
  private String username;
  @Column(length=50, nullable = false)
  private String password;
  @Column(length=100, nullable = false)
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  @Override
  public String toString() {
    return "Usuario [id=" +     id + 
    ", nome=" + nome + 
    ", username=" + username +
     ", password=" +
      password + "]";
  }
  
  
}
//Column é uma anotação que indica que o campo username é uma coluna na tabela do banco de dados.
  //length=50 indica que o campo username pode ter no máximo 50 caracteres.
  //nullable = false indica que o campo username não pode ser nulo.
  //Isso significa que o campo username é obrigatório e deve ter um valor.

//GeneratedValue é uma anotação que indica que o valor do campo id será gerado automaticamente pelo banco de dados.
  //GenerationType.IDENTITY é uma estratégia de geração de chave primária que utiliza a identidade do banco de dados.
  //Isso significa que o banco de dados irá gerar um valor único para o campo id sempre que um novo registro for inserido.
  //Isso é útil para garantir que cada registro tenha um identificador exclusivo.
  //A anotação @Id indica que o campo id é a chave primária da entidade Usuario.
