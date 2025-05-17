
package BancoDigital;



public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int numeroConta;
    protected double saldo = (double)0.0F;
    private boolean ativa;
    private int agencia;
    protected Cliente cliente;
   
    

    public Conta(Cliente cliente) {
        this.numeroConta = SEQUENCIAL++;
        this.ativa = true;
        this.cliente=cliente;
        
    }
    

    @Override
    public void consultarSaldo() {
     
      
    }
    @Override
    public void depositar(double  valor) {
        this.saldo += valor;
        System.out.println("Saldo com valor depositado: " + this.saldo);
      
    }
    @Override
    public void sacar(double  valor) {
        if (this.saldo > valor) {
        this.saldo -= valor ;
        System.out.println("Valor se saque " + valor + "Saldo atual: " + this.saldo);
    } else {
        System.out.println("Saldo insuficiente");
    }
      
    }


    @Override
    public void transferir(double  valor, Conta ContaDestino) {
        this.sacar(valor);
        ContaDestino.depositar(valor);
        System.out.println("Valor transferido: " + valor);
    }


    public int getAgencia() {
        return this.agencia;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean isAtiva() {
        return this.ativa;
    }

   
  
    protected void imprimirInfoComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.getSaldo()));
    }
 

    


  
    
}


