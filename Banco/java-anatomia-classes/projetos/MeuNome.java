public class MeuNome {

  public static void main(String[] args) {
      
    String primeiroNome = "Leandro";
    String segundoNome = "Barata";

    String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

      System.out.println(nomeCompleto);
  }

  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return primeiroNome + (" ") + (segundoNome);
    //return acima pode ser tambe " return primeiroNome.concat(" ").concat(segundoNome);
  }


  
}
