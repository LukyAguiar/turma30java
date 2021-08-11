package programa;

import java.util.Scanner;

public class TesteErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int valor;
		int valores[] = new int[4]; //0-3
		/*
		 * try{
		 * 
		 * }cath (erro){
		 * 	tratar de alguma forma esse erro; 
		 * }
		 * 
		 * 
		 */
		
		try {
		System.out.println("Digite a posição denrto do vetor 0-3");
		valor = leia.nextInt();
		System.out.println("Digite um valor inteiro: ");
		valores[valor] = leia.nextInt();
		
		System.out.printf("O valor digitado na posição %d foi %d!!",valor,valores[valor]);
		System.out.println("valor da divisão teste: " + valores[valor]/valor);
		}
		catch(java.lang.ArithmeticException erro){
			System.out.println("Impossivel dividi por zero!!! fui banda mel!!!");
		}
		catch(java.util.InputMismatchException erro){
			System.out.println("Impossivel dividi por zero!!! fui banda mel!!!");
		}
		
		System.out.println("FIM DE PROGRAMA!!");
	}

}
