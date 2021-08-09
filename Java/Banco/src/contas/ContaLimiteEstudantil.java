package contas;

import banco.Conta;
								//Herança
public class ContaLimiteEstudantil extends Conta{
	//Atributos
	private double limiteEstudantil;

	//Construtor
	public ContaLimiteEstudantil(int numero, String nomeCliente, double limiteEstudantil) {
		super(numero, nomeCliente);
		this.limiteEstudantil = limiteEstudantil;
	}

	//Polimorfismo
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	//Metodo
	public void limiteEstudantil(double valor) 
	{
		double auxvalor = 0.00;
		if (valor>(super.getSaldo()+this.limiteEstudantil))
		{
			System.out.println("Impossivel Realizar");		
		}
		else if(valor>super.getSaldo()) 
		{
			auxvalor = valor - super.getSaldo();
			super.credito(auxvalor);
			this.limiteEstudantil = this.limiteEstudantil - auxvalor;
			System.out.println("Novo limite estudantil :" + limiteEstudantil);
		}
	}
	
	
	
}
