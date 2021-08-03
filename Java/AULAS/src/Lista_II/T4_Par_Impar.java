package Lista_II;

import java.util.Scanner;

public class T4_Par_Impar {
	

	    public static void main(String[] args) {
			
	    	Scanner gravar = new Scanner(System.in);
			int num;
			int resto;
			
			System.out.print("Digite um número: ");
			num = gravar.nextInt();
			
			//Fazendo divisão para saber se é Par ou Impar
			resto = (num % 2);
			
			
			if(num < 0) {
				System.out.println("Números negativos não Passarão!! - (Negativo)");
			}
			if(num == 0){
				System.out.println("O Número informado é neutro - (Neutro)");
			}
			else if(resto == 0){
				System.out.println("O Número informado é par. (Positivo)");
				System.out.print("O NUMERO " + num + ", É PAR! E SUA RAIZ É: " + Math.sqrt(num));
			}
			else {
				System.out.println("O Número informado é ímpar. (Positivo)");
				System.out.print("O NUMERO " + num + ", É ÍMPAR! E ELEVADO AO QUADRADO É: " + Math.pow(num,2));
			}
			
			
			
			
	    }
}
