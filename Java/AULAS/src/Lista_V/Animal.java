package Lista_V;

public class Animal {
	
	//Atributos
	private String nome;
	private int anoNascimento;
	
	//Construtores 
	public Animal(String nome, int anoNascimento) {
		super();
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}
	
	
	//Polimorfismo
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	
	//Metodos
	public void emitirSom() {
		System.out.println("Emitindo o som do bicho;");
	}
	
	public int idade() {
		return (2021 - anoNascimento);
	}
	
	
}
