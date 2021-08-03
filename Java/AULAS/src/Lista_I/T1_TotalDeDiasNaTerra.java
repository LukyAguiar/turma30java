package Lista_I;

import java.util.Scanner;

public class T1_TotalDeDiasNaTerra {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Váriaveis
		int anos = 0;
		int meses = 0;
		int dias = 0;
		int totalDias;
		Scanner gravar = new Scanner(System.in);
		
		
		System.out.println("Digite o numero de anos: ");
		anos = gravar.nextInt();
		System.out.println("Digite o numero de meses: ");
		meses = gravar.nextInt();
		System.out.println("Digite o numero de dias: ");
		dias = gravar.nextInt();
		totalDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Você viveu extamente " + totalDias + " dias nessa terra");
	}

}
