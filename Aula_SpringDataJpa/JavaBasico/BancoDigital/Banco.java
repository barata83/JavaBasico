package BancoDigital;

public class Banco {
  public static void main(String[] args) {
    Cliente Leandro = new Cliente();
    Leandro.setNome("Leandro");
  

    Conta cc = new ContaCorrente(Leandro);
    Conta cp= new ContaPoupanca(Leandro);

    Leandro.addConta(cc);

    cc.depositar(200);
		cc.transferir(150,cp);

    cc.imprimirInfoComuns();
    cp.imprimirInfoComuns();
    cc.toString();
    
  }

}
