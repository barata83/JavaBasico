

public class ContaCorrente {
  int NumeroConte;
  private String dono;
  private float  saldo=0;
  private String tipo;
  private boolean status=false;

  public ContaCorrente() {
   status=false;
   saldo=0;
  }
  public void abrirConta(String tipo){
    setTipo(tipo);
    setStatus(true);
    if(tipo == "cc"){
      saldo = 50;
      }else{
        saldo = 150;
      }
  }
  public void fecharConta(){
if(saldo > 0){
  System.out.println("necessario sacar saldo para fechamento");
}else if(saldo < 0){
  System.out.println("conta em debito ");
}else{
  setStatus(false);
}

  }
  public void depositar(int deposito){
    if(status = true){
  this.saldo += deposito;
}else{
  System.out.println("nao possivel sacar");
}

  }
  public void sacar(int saque){
    if(status =true){
      if(saldo > saque){
        this.saldo -= saque; 
      }
    }else{
      System.out.println("sem valor para saque");
    }
  }
  public void pagarMensalidade(String tipo ){
    int mensalidade;
    if(status = true){
      if(tipo == "cc"){
        mensalidade = 20;
      }else{
        mensalidade = 12;
      }
    }else{
      System.out.println(".(Sem conta corrente ativa)");
    }

  }
  public int getNumeroConte() {
    return NumeroConte;
  }
  public void setNumeroConte(int numeroConte) {
    NumeroConte = numeroConte;
  }
  public String getDono() {
    return dono;
  }
  public void setDono(String dono) {
    this.dono = dono;
  }
  public float getSaldo() {
    return saldo;
  }
  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public boolean isStatus() {
    return status;
  }
  public void setStatus(boolean status) {
    this.status = status;
  }

  public void extrato(){
    System.out.println( "*****************");
    System.out.println( " SEU SALDO É " + saldo);
    System.out.println("O numero da conta é " + NumeroConte);
    System.out.println("Conta de: " + dono);
    System.out.println( "Tipo de conta é " +  tipo); 
    System.out.println("conta esta aberta ? " + status);

  }
  
  }
