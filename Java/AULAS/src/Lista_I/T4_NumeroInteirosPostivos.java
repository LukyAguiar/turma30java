package Lista_I;

import java.util.Scanner;

public class T4_NumeroInteirosPostivos {

	public static void main(String[] args) {
		
		//três números inteiros e positivos ()
		int A;
		int B;
		int C;
		
		//Formula 
		int D;
		int R;
		int S;
		
		//Leitor;
		Scanner gravar = new Scanner(System.in);
		
		System.out.print("Escolha um valor pro A: ");
		A = gravar.nextInt();
		System.out.print("Escolha um valor pro B: ");
		B = gravar.nextInt();
		System.out.print("Escolha um valor pro C: ");
		C = gravar.nextInt();
		
		S = ((A+B)*(A+B));
		R = ((B+C)*(B+C));
		
		D = (R + S)/2; 
		
		System.out.println("A seguinte expressão terá o seguinte resultado: " + D);
	}
	
}
