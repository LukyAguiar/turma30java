package programa;

import classes.Cachorro;
import classes.Pet;
import classes.Gato;
import classes.Ave;
import classes.Porco;

public class TestePet {

	public static void main(String[] args) {
		
		//Estanciando
		Cachorro pet1 = new Cachorro("PITBULL", true);
		Gato pet2 = new Gato("SIAMES",2014,false);
		Porco pig5 = new Porco(true);
		Ave pet3 = new Ave("PAPAGAIO",true);
		
		pet1.setAnoNascimento(2010);
		
		
		System.out.println(pet1.getRaca()+ " " + pet1.idade() + " Anos");
		pet1.emiteSom();
		System.out.println(pet2.getRaca()+ " " + pet2.idade() + " Anos");
		pet2.emiteSom();
		
		pig5.somAlto();		
		
	}	

}
