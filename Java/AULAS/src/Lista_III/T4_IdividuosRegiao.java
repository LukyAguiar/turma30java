package Lista_III;

import java.util.Scanner;

public class T4_IdividuosRegiao {

	public static void main(String[] args) {
		
		//Variaveis 
		Scanner leia = new Scanner(System.in);
		int idade;
		char sexo; //(1- woman / 2-man / 3- Others)
		char opcoes; 
		int contadorPessoas = 0; 
		final int LIMITE_PESSOAS_ENTREVISTADAS=3;
		
		//Entradas
		
		while(contadorPessoas <= LIMITE_PESSOAS_ENTREVISTADAS ){
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite |- 1 - Feminino |- 2 - Masculino | - 3 - Outros");
			sexo = leia.next().charAt(0);
			System.out.println("");
			opcoes = leia.next().charAt(0);
			contadorPessoas ++;
		}
		
		//Processamentos 
		
		//Saidas
	}
}
