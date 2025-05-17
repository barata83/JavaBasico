package agenda;
public class Contatos {
public static void main(String[] args) {
    AgendaContatos agenda = new AgendaContatos();
    agenda.adicionarContato("João", 123456789);
    agenda.adicionarContato("Maria", 987654321);
    agenda.adicionarContato("Pedro", 456789123);
    agenda.adicionarContato("Ana", 321654987);
    agenda.adicionarContato("Lucas", 789123456);
    
    System.out.println("Lista de contatos:");
    agenda.exibirContatos();
    
    System.out.println("\nPesquisando por 'Maria':");
    Integer numero = agenda.pesquisarPorNome("Maria");
    if (numero != null) {
        System.out.println("Número encontrado: " + numero);
    } else {
        System.out.println("Número não encontrado.");
    }
    
    System.out.println("\nRemovendo 'Pedro':");
    agenda.removerContato("Pedro");
    
    System.out.println("\nLista de contatos após remoção:");
    agenda.exibirContatos();
}

}
