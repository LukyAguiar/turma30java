package Lista_III;

import java.util.Scanner;

public class T3_Idade {
	
	public static void main(String[] args) {

	    int idade=0, idadeMenor21=0, idadeMaior50=0;
	    Scanner leia = new Scanner(System.in);

	    while(idade!=-99){
	      System.out.printf("Digite a idade: ");
	      idade = leia.nextInt();

	      if(idade<21){
	        idadeMenor21++;
	      }
	      if(idade>50){
	        idadeMaior50++;
	      }
	      if(idade==-99){
	        idadeMenor21--;
	      }
	    }

	    System.out.printf("\nTotal de pessoas com menos de 21 anos: %d", idadeMenor21);
	    System.out.printf("\nTotal de pessoas com mais de 50 anos: %d", idadeMaior50);
	  }
}
