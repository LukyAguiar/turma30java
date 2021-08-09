package classes;

import classes.Animal;

public class Pet extends Animal{
	//Heranças
	private String raca; 
	private char porte; // P - G - M 
	
	public Pet(String especie, String raca, char porte) {
		super(especie);
		this.raca = raca;
		this.porte = porte;
	}
}
