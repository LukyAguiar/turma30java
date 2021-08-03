package Lista_I;

import java.util.Scanner;

public class T8_CustoDeFabrica {

	
	public static void main(String[] args) {
		
		Scanner gravar = new Scanner(System.in);
		double custoFabrica;
		double custoDistribuidora = 0.28;
		double custoImposto = 0.45;
		
		System.out.print("Digite o custo de fábrica: ");
		custoFabrica = gravar.nextDouble();
		
		System.out.print("O Custo total do automóvel é de: " + ((custoFabrica * custoDistribuidora) + (custoFabrica * custoImposto) + custoFabrica));
		
	}
	
}
