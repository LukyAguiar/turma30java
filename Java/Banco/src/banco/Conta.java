package banco;

public abstract class Conta {

	//Atributos
	private int numero; 
	private String nomeCliente; 
	private double saldo; 
	
	
	//Metodos 
	public void debito(double valor){
		if(valor > saldo) {
			System.out.println("Impossivel realizar");
		}else {
			saldo = saldo - valor;
		}
	}
		
	
	public void credito(double valor){
		if(valor < saldo) {
			System.out.println("Impossivel realizar");
		}else {
			saldo = saldo + valor;
		}
	}

	//Construtor
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}
	
	//Encapsulamento
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	/*
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	*/
}
