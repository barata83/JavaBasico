package dio.primeiros_passos;

import com.google.gson.Gson;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private final Gson gson;

    public PessoaService(Gson gson) {
        this.gson = gson;
    }

    public String obterPessoaComoJson() {
        Mensagem msg = new Mensagem("MEU nome é Leandro Barata e tenho 42 anos");
        return gson.toJson(msg);
}
}

