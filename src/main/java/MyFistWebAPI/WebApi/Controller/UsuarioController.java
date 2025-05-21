package MyFistWebAPI.WebApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import MyFistWebAPI.WebApi.Model.Usuario;
import MyFistWebAPI.WebApi.repository.Repositorio;

@RestController
public class UsuarioController {
  @Autowired
  private Repositorio repositorio;
  @GetMapping("/usuario")
  public List<Usuario> getUsuario(){
    return repositorio.findAll();

}
}
