public class ContaCorrente {
  
  private float saldo=0;
  private float chequeEspecial;
  private float deposito;
  private float valorSaque;

  public ContaCorrente(float depositoInicial){
    this.deposito = depositoInicial;
    this.saldo += depositoInicial; 
  }
  

  public void abrirConta(){
    if(deposito<=500){
      chequeEspecial = 50;
    }else {
      chequeEspecial = deposito * 0.5f;
  }
  System.out.println("O valor do cheque especial é R$ " +  chequeEspecial);
  }
  public void sacar(float valor){
    if(valor <= (saldo + chequeEspecial)){
      saldo -=valor;
      System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
    }else{
      System.out.println("Saldo insuficiente para saque.");
    }
      }
      public float getSaldo() {
        return saldo;
    }
  
    public float getChequeEspecial() {
        return chequeEspecial;
    }
}
