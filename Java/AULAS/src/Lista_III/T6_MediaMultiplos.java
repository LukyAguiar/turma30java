package Lista_III;

import java.util.Scanner;

public class T6_MediaMultiplos {

		  public static void main(String[] args) {
		    
			  int numero, soma=0, media=0, contador=0;
			  Scanner leia = new Scanner(System.in);

			  do{
				  System.out.printf("Digite um número: ");
				  numero = leia.nextInt();

				  if(numero%3==0){
					  contador++;
					  soma = soma+numero;
					  media = soma /contador;
				  }
			  }while(numero!=0); 
			  System.out.printf("A média dos números múltiplos de 3 foi: %d", media);
		  }
		  
}
