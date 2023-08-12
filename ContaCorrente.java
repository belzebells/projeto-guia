package conta.model;

public class ContaCorrente extends Conta {
	// TODO Auto-generated constructor stub

	private float limite;
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
		
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
		
	public boolean sacar(float valor) {
		
		if(this.getSaldo() + this.getLimite() < valor) { 
			System.out.println("\nsaldo insuficiente.");
			return false; 
	}
		this.setSaldo(this.getSaldo()- valor); { 
			return true; }
	} 
		
	public void visualizar() {
		
		super.visualizar();
		System.out.println("limite de crédito: "+this.limite);
	}
	
	
	
	
	} 
	


		
	
	


