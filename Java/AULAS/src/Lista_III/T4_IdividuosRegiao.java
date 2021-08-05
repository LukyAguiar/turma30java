package Lista_III;

import java.util.Scanner;

public class T4_IdividuosRegiao {

	public static void main(String[] args) {
		
		//Variaveis 
		Scanner leia = new Scanner(System.in);
		int idade;
		char sexo; //(1- woman / 2-man / 3- Others)
		char opcoes; 
		char op = 'S';
		int contadorPessoas = 0; 
		final int LIMITE_PESSOAS_ENTREVISTADAS=3;
		
		int numeroPessoasCalma = 0;
		int numeroMulheresNervosas = 0;
		int numeroHomemAgressivos = 0;
		int numeroOutrosCalmos = 0;
		int numeroPessoasNervosas40 = 0;
		int numeroPessoasCalmas18 = 0;
		
		//Entradas
		
		while(contadorPessoas <= LIMITE_PESSOAS_ENTREVISTADAS && op=='S' && op=='s' ){
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			System.out.println("Digite |- 1 - Feminino |- 2 - Masculino | - 3 - Outros");
			sexo = leia.next().charAt(0);
			System.out.println("Digite |- 1 - Pessoa CALMA | - 2 - Pessoa Nervosa | - 3 - Agressivos ");
			opcoes = leia.next().charAt(0);
			contadorPessoas ++;
			System.out.println("Continua S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			
			//Processamentos 
			if(opcoes == '1') {
				numeroPessoasCalma++;
			}
		
			if(sexo == '1' && opcoes =='2')
			{
				numeroMulheresNervosas++;
			}
			
			if(sexo == '2' && opcoes == '3') 
			{
				numeroHomemAgressivos++;
			}
			
			if(sexo == '3' && opcoes == '1') 
			{
				numeroOutrosCalmos++;
			}
			
			if(opcoes == '2' && idade == 40) 
			{
				numeroPessoasNervosas40++;
			}
			
			if(opcoes == '1' && idade == 18) 
			{
				numeroPessoasCalmas18++;
			}
		}
		
		//Saidas
		
		
		
	}
}
