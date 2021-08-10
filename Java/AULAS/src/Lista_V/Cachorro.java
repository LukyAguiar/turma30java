package Lista_V;

public class Cachorro extends Animal{
			
	//Atributo
	private boolean somCachorro;
	
	//Construtor
	public Cachorro(String nome, int anoNascimento, boolean somCachorro) {
		super(nome, anoNascimento);
		this.somCachorro = somCachorro;
	}
	//Encapsulamento

	public boolean isSomCachorro() {
		return somCachorro;
	}

	public void setSomCachorro(boolean somCachorro) {
		this.somCachorro = somCachorro;
	}
	
	//Metodo - Polimorfimos
	
	@Override //Anotação ;; Polimorfismo
	public void emitirSom() {
		if(somCachorro) {
			System.out.println("Cachorro nervoso: AU! AU! AU! AU!");
		}
		else
		{
			System.out.println("Cachorro na Paz de Jah: au au au au");
		}
		
	}
	
}
