package MyFistWebAPI.WebApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WellcomeController {

  @GetMapping
  public String Wellcome() {
      return "Bem vindo ao meu primeiro WebAPI com Spring Boot!";
  }
  
}
