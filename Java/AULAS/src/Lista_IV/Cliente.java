package Lista_IV;

public class Cliente {
	
	//Atributos
	public String nome; 
	public String cpf;
	public String email; 
	public int anoNascimento;
	public int telefone;
	public char genero;
	
	
	
	//Métodos
	public void mostraNome()
	{
		System.out.println("Nome: " + nome);
	}

	public void mostraCpf()
	{
		System.out.println("CPF: " + cpf);
	}

	public void mostraEmail()
	{
		System.out.println("Email: " + email);
	}
	public void mostraTelefone()
	{
		System.out.println("\nTelefone: " + telefone);
	}

	public void mostraAnoNascimento() 
	{
		System.out.printf("Seu Ano de Nascimento: " + anoNascimento);
	}
	
	public void mostraGenero()
	{
		if(genero == 'M') {
			System.out.println("Bioligicamente: Seu gênero é Masculino");
		}else if(genero == 'F'){
			System.out.println("Bioligicamente: Seu gênero é Feminino");
		}else {
			System.out.println("Bioligicamente: Seu gênero é Amor");
		}
	}
	
	//Construtores - Carga
	
}


