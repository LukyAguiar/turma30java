package Exercicio_Aula;

import java.util.Scanner;

public class Copinha {
	
	public static void main(String[] args){
	
		Scanner marcar = new Scanner(System.in);
		String time1="Santos",time2="São Paulo",time3="Palmeras", time4="Corinthians";
		int ponto1=0,ponto2=0,ponto3=0,ponto4=0;
		
		char op='X'; // G Ganhou - 3 , P - PERDEU - 0 - EMPATOU - 1
		
		
		for (int x=1;x<2;x++) 
		{
			
			System.out.println(time1 +" G-ganhou, P-perdeu ou E-empatou");
			op = marcar.next().toUpperCase().charAt(0);
			if(op == 'G'){
				ponto1 += 3;
			}
			else if(op == 'E')
			{
				ponto1 += 1;
			}
			else if(op == 'P')
			{
				ponto1 += 0;
			}
			else {
				System.out.println("Digitou errado, vai fica com 0 !!");
			}
		}
		
		System.out.println();
		System.out.println("TABELA");
		System.out.printf("Time: %s pontos atuais : %d ponto(s)!!!",time1,ponto1);
		System.out.printf("Time: %s pontos atuais : %d ponto(s)!!!",time2,ponto2);
		System.out.printf("Time: %s pontos atuais : %d ponto(s)!!!",time3,ponto3);
		System.out.printf("Time: %s pontos atuais : %d ponto(s)!!!",time4,ponto4);
		
	}

}
