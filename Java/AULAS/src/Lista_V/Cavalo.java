package Lista_V;

public class Cavalo extends Animal{
	
	//Atributos
	private boolean somCavalo;
	
	//Construtor
	public Cavalo(String nome, int anoNascimento, boolean somCavalo) {
		super(nome, anoNascimento);
		this.somCavalo = somCavalo;
	}
	//Encapsulamento

	public boolean isSomCavalo() {
		return somCavalo;
	}

	public void setSomCavalo(boolean somCavalo) {
		this.somCavalo = somCavalo;
	}
	//Metodos com Polimorfismo
	@Override //Anotação ;; Polimorfismo
	public void emitirSom() {
		if(somCavalo) {
			System.out.println("HIIN IN IN HINNIR!!");
		}
		else
		{
			System.out.println("pruprupruuuu");
		}
		
	}

}
