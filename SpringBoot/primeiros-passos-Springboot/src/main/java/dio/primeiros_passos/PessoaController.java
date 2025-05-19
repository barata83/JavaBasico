// src/main/java/dio/primeiros_passos/PessoaController.java
package dio.primeiros_passos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @GetMapping("/pessoa")
    public String getPessoa() {
        return service.obterPessoaComoJson();
    }
}

