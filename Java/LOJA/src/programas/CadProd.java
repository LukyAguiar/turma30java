package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import classes.Produto;
import classes.Revista;

public class CadProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		List<Produto> lista = new ArrayList<>();
		Revista rev1 = new Revista("001","Exame",50.00,10,"ABRIL");
		
		
		lista.add(new Revista("001","EXAME",50.00,10,"ABRIL"));
	}
}
