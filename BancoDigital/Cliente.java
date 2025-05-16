package BancoDigital;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private String nome;
    private String cpf;
    private List<Conta> contas = new ArrayList();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }
}
