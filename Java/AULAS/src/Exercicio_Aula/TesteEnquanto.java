package Exercicio_Aula;

import java.util.Scanner;

public class TesteEnquanto {

	public static void main(String[] args) {
		
		
		//precisa do nome e do salario
		//informar o nome e salario da pessoa que tem o maior salario 
		//o programa termina quando for digitado m valor negativo ou zero
		
		//variaveis
		Scanner leia = new Scanner(System.in); //Instancia Criar
		String nome="";
		int salario=0; 
		int maiorSalario=0;
		String nomeMaiorSalario="";
		
		//entradas
		
		
		
		
			System.out.println("Digite o salario: ");
			
			
			while (salario>0); {
				if(salario > maiorSalario) {
					maiorSalario = salario; 
					nomeMaiorSalario = nome;
				}
			System.out.println("Digite o nome: ");
			nome = leia.next();
			System.out.println("Digite seu Salario: ");
			salario = leia.nextInt();
			
			}
			System.out.println();
			if(maiorSalario>0) {
				System.out.printf("O maior salario é %d da pessoa %s", maiorSalario,nome);
			}
			
			System.out.println("Ate breve !!!");
	}	
	
	public static void linha(int tamanho) {
		for(int x=1; x<=tamanho; x++) {
			System.out.println("=");
		}
		System.out.println();
	}
}
