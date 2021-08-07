package Exercicio_Aula_POO;

public class CadAlunoTeste {
	

	//variaveis 
	//entradas
	//processamentos
	//saidas

	public static void main(String[] args) {
		
		String nome[] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corrêa de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","Cássia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","Fábio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Flávio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","João Pedro Cruz Gomes","José Paulo de Matos Ferreira Neto","Letícia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Natália Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vinícios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};
		String matricula[] = new String[39];
		int nota[] = new int[39];
		boolean ativo[] = new boolean[39];
		
		System.out.printf("MAT\tSTATUS\tNOTA\tNOME\n");
		
		for (int x=0; x < 39; x++) {
				nota[x] = 0;
				ativo[x] = true;
				matricula[x] = "MAT-0"+(x+1);
				System.out.println(matricula[x]+"\t" + "ATIVO  \t " + nota[x] + "\t" + nome[x]+"");
		}
	}
	
	
}
