package conta.model;

public abstract class Conta {

	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("\nsaldo insuficiente.");
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	// o método depositar do tipo void foi criado contendo o parâmetro float valor,
	// que receberá o valor a ser depositado na conta. 
	// Para atualizar o saldo, foi utilizado o método setSaldo(float saldo).
	

	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	// O Método visualizar, do tipo void, foi criado sem parâmetros. O Método
	// visualizar foi definido como void
	// porquê ele não precisa retornar uma confirmação, apenas exibir os dados de um
	// Objeto conta no console.
	
	public void visualizar() {
		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "conta corrente";
			break;

		case 2:
			tipo = "conta poupança";
			break;
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("dados da conta: ");
		System.out.println("------------------------------------------------");
		System.out.println("número da conta: " + this.getNumero());
		System.out.println("agência: " + this.getAgencia());
		System.out.println("tipo de conta: " + tipo);
		System.out.println("titular: " + this.getTitular());
		System.out.println("agência: " + this.getSaldo());

	}
}
