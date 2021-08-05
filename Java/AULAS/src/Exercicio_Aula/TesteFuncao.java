package Exercicio_Aula;

import java.util.Scanner;

public class TesteFuncao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento;
		String nome;
		
		//linha(1);
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento");
		anoNascimento = leia.nextInt();
		linhaBasica();
		System.out.printf("%s sua idade  %d ",nome,anoNascimento);
		linhaBasica();
		System.out.println("olha tu é "+tue(anoNascimento));
	}
	
	public static void linhaBasica() {
		System.out.println("=================================================================");
	}
	
	public static void linha(int tamanho) {
		for(int x=1; x<=tamanho; x++) {
			System.out.println("====================================================");
		}
		System.out.println();
	}
	
	public static String tue(int ano) {
		
		int idade;
		idade = 2021-ano;
		String resposta;
		
		if(idade < 13)
		{
			resposta = "criança";
		}
		else if(idade <18)
		{
			resposta = "Adolecente";
		}
		else if(idade <30)
		{
			resposta = "Jovem";
		}
		else if(idade <45)
		{
			resposta = "Adulto";
		} else {
			resposta = "Cringe";
		}
		
		return resposta;
		
		
	}
}
