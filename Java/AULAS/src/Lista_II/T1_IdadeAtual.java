package Lista_II;

import java.util.Scanner;

public class T1_IdadeAtual {

	public static void main(String[] args) {
		
		Scanner gravar = new Scanner(System.in);
		String nome;
		int anoNascimento; 
		int idade;
		int anoAtual = 2021;
		
		System.out.print("DIgite o seu nome: ");
		nome = gravar.next();
		System.out.print("Digite o nao de nascimento: ");
		anoNascimento = gravar.nextInt();
		idade = anoAtual - anoNascimento; 
		
		System.out.println("Olá "+ nome + " você tem "+ idade + " anos de idade");
		
		if(idade >= 45) {
			System.out.print("Você tem história pra contar :3");
		}else {
			System.out.print("Ainda tem muito a viver");
		}
		
		
	}
	
	
}
