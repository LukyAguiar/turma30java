package Lista_I;

import java.util.Scanner;

public class T2_IdadeExpressaEmDias {

		public static void main(String[] args) {
			
			
			int anos = 0;
			int meses = 0;
			int dias = 0; 
			int totalDias;
			Scanner gravar = new Scanner(System.in);
			
			
			//entrada
			System.out.println("Digite a sua idade no total de dias: ");
			totalDias = gravar.nextInt();
			
			anos = totalDias / 365;
			meses = (totalDias % 365) / 30;
			dias = (totalDias % 365) % 30;
			
			System.out.println("\nAnos de vida : " + anos);
			System.out.println("Meses de vida :" + meses);
			System.out.println("Dias de vida :" + dias);
			
			
		}
}
