public class Lista {

  public static void main(String[] args) {
    
    ConjuntoConvidado ListaConvidado = new ConjuntoConvidado();

    ListaConvidado.adicionadConvidado("Marcos Paulo", 254);
    ListaConvidado.adicionadConvidado("Maria", 2);
    ListaConvidado.adicionadConvidado("Pedro", 3);
    ListaConvidado.adicionadConvidado("Ana", 4);
    ListaConvidado.adicionadConvidado("Lucas", 5);

    ListaConvidado.contarConvidado();

    ListaConvidado.exibirConvidados();


  }

}
