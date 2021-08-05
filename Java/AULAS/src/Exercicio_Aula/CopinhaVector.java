package Exercicio_Aula;

import java.util.Scanner;

public class CopinhaVector {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		//Times
		
		//"Variaveis"
		String codTimes[] = new String[4];
		String nomesTimes[] = {"SANTOS    ","SPFC     ","PALMEIRAS","CORINTHIANS"};
		int pontosTimes[] = {0,0,0,0};
		char op;
		String auxCod;
		//"CPF-01" 
		/*for (int x=0; x<nomesTimes.length; x++) {
			codTimes[x] = "CPF-0"+(x+1);
			System.out.println("CODIGO: "+codTimes[x]);
		}
		*/
		for (int x=0; x<nomesTimes.length; x++) {
			if(x==9) {
				codTimes[x] = "CPF-1"+(x+1);
			}
			else {
				codTimes[x] = "CPF-0"+(x+1);
			}
		}
		System.out.println();
		System.out.println("Digite o codigo do time que deseja selecional");
		auxCod = leia.next().toUpperCase();
		
		System.out.println();
		System.out.println("COD\tTIME    \tPONTOS");
		for(int x=0;x<codTimes.length;x++) {
			if(auxCod.equals(codTimes[x])) {
			System.out.printf("%s\t%s\t%d\n",codTimes[x],nomesTimes[x],pontosTimes[x]);
			}
		}
		
		System.out.println();
		//laço que roda o numero de rodadas que vc deseja 
		for (int x=0; x<3; x++) {
			System.out.println("Rodada"+(x+1));
			//laço que roda todos os times
			for(int y=0; y<codTimes.length; y++) {
				System.out.println(nomesTimes[y]+"G-ganhou, P-perdeu ou E-Empatou");
				op = leia.next().toUpperCase().charAt(0);
				if(op =='G') {
					pontosTimes[y] = pontosTimes[y]+3;
				}
				else if (op == 'E') {
					pontosTimes[y] += 1; //pontosTimes[y] = pontosTimes[y]+1 --- 
				}
				else {
					System.out.println("Tu perdeu irmão");
				}
			}
		}
		
		
		
	}
}
