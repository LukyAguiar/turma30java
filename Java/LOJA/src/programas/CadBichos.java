package programas;

import classes.Animal;
import classes.Cachorro;
import classes.Gato;
import classes.Pet;

public class CadBichos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal bicho1 = new Animal("Canino");
		
		Pet venda1 = new Pet("CANINO","PITBULL",'G');
		Cachorro dog1 = new Cachorro("CANINO","DOBERMAN",'G',"FINA");
		Gato cat1 = new Gato("FELINO","ANGORRA",'M',"ALTA");
		
		dog1.somAlto();
		dog1.somBaixo();
	}

}
