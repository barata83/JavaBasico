package iphone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
  private int volume = 50;

  // Reprodutor Musical
  public void tocarMusica() {
    System.out.println("A tocar música...");
  }

  public void pararMusica() {
    System.out.println("Música parada.");
  }

  public void aumentarVolume() {
    if (volume < 100) {
      volume++;
      System.out.println("Volume: " + volume);
    }
  }

  public void baixarVolume() {
    if (volume > 0) {
      volume--;
      System.out.println("Volume: " + volume);
    }
  }

  // Aparelho Telefónico
  public void ligar(String numero) {
    System.out.println("A ligar para " + numero);
  }

  public void atender() {
    System.out.println("Chamada atendida.");
  }

  public void iniciarCorreioVoz() {
    System.out.println("A iniciar correio de voz...");
  }

  // Navegador Internet
  public void exibirPagina(String url) {
    System.out.println("A abrir página: " + url);
  }

  public void adicionarNovaAba() {
    System.out.println("Nova aba aberta.");
  }

  public void atualizarPagina() {
    System.out.println("Página atualizada.");
  }
}
