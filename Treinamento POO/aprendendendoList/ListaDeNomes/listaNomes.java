public class listaNomes {
  public static void main(String[] args) {

    Lista lista = new Lista();
    System.out.println("Bem-vindo ao sistema de gerenciamento de nomes!");
    lista.adicionarNome();
    lista.adicionarNome();
    lista.adicionarNome();

    lista.listarNomes();

    lista.removerNome();

    lista.adicionarNome();

    lista.listarNomes();

}
}