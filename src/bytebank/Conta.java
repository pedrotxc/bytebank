package bytebank;

public class Conta {
	private String agencia;
	private String conta;
	private Cliente cliente;
	private double saldo;
	
	public Conta (String agencia, String conta) {
		this.agencia = agencia;
		this.conta = conta;
	}
	
	public boolean depositar(double valorDepositado) {
		this.saldo += valorDepositado;
		return true;
	}
	
	public boolean sacar(double valor) {
		if(!(this.saldo > valor)) {
			System.out.println("Não foi possível sacar!");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public boolean transferir(double valor, Conta conta) {
		
		if(!sacar(valor)) {
			System.out.println("Não foi possível realizar a transferência!");
			return false;			
		} else {
			conta.depositar(valor);
		}
		return true;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Double getSaldo() {
		return saldo;
	}
}
