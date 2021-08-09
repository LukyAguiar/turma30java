package contas;

import banco.Conta;

public class ContaEspecial extends Conta{

	//Atributos 
	public double limite = -1000; 
	
	//Metodo
	public void usarLimite(double saldo) {
		saldo = saldo + limite;
	}

	//Construtor
	public ContaEspecial(int numero, String nomeCliente, double saldo, double limite) {
		super(numero, nomeCliente);
		this.limite = limite;
	}

	
	
	
	
	
}
