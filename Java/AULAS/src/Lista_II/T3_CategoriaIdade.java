package Lista_II;

import java.util.Scanner;

public class T3_CategoriaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner gravar = new Scanner(System.in);
		int idade;
		
		System.out.print("Digite a idade: ");
		idade = gravar.nextInt();
		
		if(idade>=1 && idade <= 14) 
		{
			System.out.printf("Você é da categoria infatil: %d ", idade);
		}
		else if(idade>=15 && idade<=17) {
			System.out.printf("Você é da categoria Juvenil: %d", idade);
		}
		else if(idade>=18  && idade<=25) {
			System.out.printf("Você é da categoria Adulto: %d ", idade);
		}
		else {
			System.out.printf("Digite uma idade válida! %d", idade);
		}
		
		gravar.close();
		
	}

}
