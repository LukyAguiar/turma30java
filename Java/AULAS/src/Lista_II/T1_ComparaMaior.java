package Lista_II;

import java.util.Scanner;

public class T1_ComparaMaior {

	public static void main(String[] args){
		
		Scanner gravar = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.print("Digite um valor para N1: ");
		n1 = gravar.nextInt();
		System.out.print("Digite um valor para N2: ");
		n2 = gravar.nextInt();
		System.out.print("Digite um valor para N3: ");
		n3 = gravar.nextInt();
		
		
		if( n1 > n2 && n1 > n3) {
			System.out.printf("O maior número entre eles é N1 - Sendo os números: |N1:%d|N2:%d|N3:%d|",n1,n2,n3);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.printf("O maior número entre eles é N2 - Sendo os números: |N1:%d|N2:%d|N3:%d|",n1,n2,n3);
		}
		else if(n3 > n1 && n3 > n2){
			System.out.printf("O maior número entre eles é N3 - Sendo os números: |N1:%d|N2:%d|N3:%d|",n1,n2,n3);
		}
		else if(n1 < 0 && n2 < 0 && n3 < 0){
			System.out.printf("Todos os números são NEGATIVOS - Sendo os números: N1:%d|N2:%d|N3:%d|",n1,n2,n3);
		}
		else {
			System.out.printf("O Numeros são iguais - Sendo os números: |N1:%d|N2:%d|N3:%d|",n1,n2,n3);
		}
	}
}
