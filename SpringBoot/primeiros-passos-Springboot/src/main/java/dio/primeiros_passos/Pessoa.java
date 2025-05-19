package dio.primeiros_passos;

import lombok.Data;

@Data
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters
    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    
}
