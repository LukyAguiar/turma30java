package Lista_I;

import java.util.Scanner;
import java.lang.Math;

public class T7_Coeficientes {

	public static void main(String[] args) {
		
		//Váriaveis
		Scanner gravar = new Scanner(System.in);
		
		Double A,B,C,D,E,F,X,Y; 
		
		
		System.out.print("Digite um valor para BD: ");
		A = gravar.nextDouble();
		System.out.print("Digite um valor para BF: ");
		B = gravar.nextDouble();
		System.out.print("Digite um valor para AE: ");
		C = gravar.nextDouble();
		System.out.print("Digite um valor para AF: ");
		D = gravar.nextDouble();
		System.out.print("Digite um valor para CE: ");
		E = gravar.nextDouble();
		System.out.print("Digite um valor para CD: ");
		F = gravar.nextDouble();
		
		
		X = ((C*E - B*F)/(A*E -B*D));
		Y = ((A*F - C*D)/(A*E -B*D));
		
		
		
		System.out.printf("O valor de X é %.2f e o Y é %.2f ",X,Y);
	}
}
