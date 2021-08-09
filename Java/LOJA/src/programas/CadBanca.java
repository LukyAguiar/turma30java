package programas;

import classes.Doces;
import classes.Revista;

public class CadBanca {

		public static void main(String[] args)
		{
			Revista rev1 = new Revista("004","MARVEL",68.30,20);
			
			Doces sugar1 = new Doces("010","BALA YOGURTE",0.15,1000,"D");
			
			Livro book1 = new Livro("050","50 TONS DE CINZA",50.00,40);
			
			book1.retiraEstoque(30);
			sugar1.retirarEstoque(1000);
			rev1.incluirEstoque(-10);
			
			System.out.println(book1.getNome()+" estoque " + book.getEstoque);
		}
}
