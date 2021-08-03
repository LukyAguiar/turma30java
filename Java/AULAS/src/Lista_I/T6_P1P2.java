package Lista_I;

import java.util.Scanner;
import java.lang.Math;

public class T6_P1P2 {

	public static void main(String[] args) {
		
		Scanner gravar = new Scanner(System.in);
		
		double x1,x2;
		double y1,y2;
		double p1,p2;
		double d;
		
		System.out.println("Digite o valor de X1: ");
		x1 = gravar.nextDouble();
		System.out.println("Digite o valor de X2: ");
		x2 = gravar.nextDouble();
		System.out.println("Digite o valor de Y1: ");
		y1 = gravar.nextDouble();
		System.out.println("Digite o valor de Y2: ");
		y2 = gravar.nextDouble();
		
		p1 = Math.pow((x2-x1),2);
		p2 = Math.pow((y1-y2),2);
		d  = Math.sqrt(p1+p2);
		
		System.out.printf("\nA tal da distância é %.2f ",d);
		
	}
}
