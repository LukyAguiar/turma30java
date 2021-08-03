package Lista_II;

import java.util.Scanner;

public class T2_OrdemCrescente {

	public static void main(String[] args) {
		
		Scanner gravar = new Scanner(System.in);
		int n1,n2,n3;
		int nd1,nd2,nd3;
		
		System.out.println("Digite um valor para N1: ");
		n1 = gravar.nextInt();
		System.out.println("Digite um valor para N2: ");
		n2 = gravar.nextInt();
		System.out.println("Digite um valor para N3: ");
		n3 = gravar.nextInt();
		
		if(n1 > n2 && n1 > n3){
			nd1 = n1;
			if(n2 > n3) {
				nd2 = n2;
				 if(n3 > n2){
					 nd3 = n3;
				 }
			}
		}
		else {
			
		}
	}
	
}
