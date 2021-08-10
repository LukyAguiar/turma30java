package classes;

public class Ave extends Pet{
	
	//atributo
	private boolean voa;
	
	//Construtor 
	public Ave(String raca,boolean voa) {
		super(raca);
		this.voa = voa;
	}
	
	
	//Sobrecarga
	public Ave(String raca, int anoNascimento, boolean voa) {
		super(raca, anoNascimento);
		this.voa = voa;
	}

	//Encapsulamento
	
	public boolean isVoa() {
		return voa;
	}


	public void setVoa(boolean voa) {
		this.voa = voa;
	} 
	
	//Metodos
	
	
	
}
