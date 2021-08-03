package Lista_I;

import java.util.Scanner;

public class T5_MediaPonderada {

	public static void main(String[] args) {
		
		Scanner gravar = new Scanner(System.in);
		double media;
		double mediap;
		double nota1;
		double nota2;
		double nota3;
		
		System.out.print("Digite a primeira nota do alune: ");
		nota1 = gravar.nextDouble();
		System.out.print("Digite a segunda nota do alune: ");
		nota2 = gravar.nextDouble();
		System.out.print("Digite a terceira nota do alune: ");
		nota3 = gravar.nextDouble();
		
		media = ((nota1*2)+(nota2*3 )+(nota3*5))/10;
		
		System.out.println("A média do alune é: " + media);

		
	}
}
