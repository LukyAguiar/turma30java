package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Produto;

public class CadLojaNovo {

	public static void main(String[] args) {
		
		//Variavel
		
		Scanner leia = new Scanner(System.in);
		List<String> cadastro = new ArrayList<>();
		
		cadastro.add("SPFC");
		cadastro.add("SANTOS");
		cadastro.add("PALMERAS");
		cadastro.add("CORINTHIANS");
		cadastro.add("JUVENTUS");
		
		
		//System.out.println(("Tamanho da lista :" + cadastro.size()));
		
		
		cadastro.add(1,"FLAMENGO");
		
		System.out.println(cadastro.get(4));
		
		int x=0;
		for (String time : cadastro) {
			System.out.println(x+" - "+time.toLowerCase());
			x++;
		}
		System.out.println("Digite o codigo do time que deseja :");
		x = leia.nextInt();
		System.out.println("Vc escolheu o time "+ cadastro.get(x));
		
		/*for (String time : cadastro) {
			System.out.println(time);
		}
		*/
		
	}

}
