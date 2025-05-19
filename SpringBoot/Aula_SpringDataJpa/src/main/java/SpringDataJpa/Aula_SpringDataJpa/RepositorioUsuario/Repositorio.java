package SpringDataJpa.Aula_SpringDataJpa.RepositorioUsuario;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringDataJpa.Aula_SpringDataJpa.Model.Usuario;

public interface  Repositorio extends JpaRepository <Usuario, Integer> {
  
  }

// JpaRepository é uma interface do Spring Data JPA que fornece métodos para realizar operações de CRUD (Create, Read, Update, Delete) em entidades JPA.
// A interface Repositorio estende JpaRepository, o que significa que ela herda todos os métodos da interface JpaRepository.
// Isso permite que você use métodos como save(), findById(), findAll(), deleteById(), entre outros, sem precisar implementá-los manualmente.
// Além disso, você pode definir métodos personalizados na interface Repositorio, como findByNome() e findByUsername(), que serão implementados automaticamente pelo Spring Data JPA.
// Esses métodos personalizados permitem que você busque usuários pelo nome ou pelo nome de usuário, respectivamente.
// O Spring Data JPA irá gerar a implementação desses métodos com base nos nomes dos métodos e nos parâmetros que você definiu.
// Isso significa que você não precisa escrever consultas SQL ou JPQL manualmente para essas operações.
// O Spring Data JPA irá gerar as consultas necessárias para você com base nos nomes dos métodos.
