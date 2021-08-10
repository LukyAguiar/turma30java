package classes;

public class Cachorro extends Pet{

	//Atributos
	private boolean latidoAlto;
	

	//Construtores

	public Cachorro(String raca, boolean latidoAlto) {
		super(raca);
		this.latidoAlto = latidoAlto;
	}
	
	//SobreCarga

	public Cachorro(String raca, int anoNascimento, boolean latidoAlto) {
		super(raca, anoNascimento);
		this.latidoAlto = latidoAlto;
	}
	
	 //Encapsulamento
	
	public boolean isLatidoAlto() {
		return latidoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}

	
	
	//Metodos
	@Override //Anotação ;; Polimorfismo
	public void emiteSom() {
		if(latidoAlto) {
			System.out.println("AU! AU! AU! AU!");
		}
		else
		{
			System.out.println("au au au au");
		}
		
	}



	
	
}
