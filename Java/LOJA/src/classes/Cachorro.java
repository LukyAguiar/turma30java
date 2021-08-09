package classes;

import classes.Pet;

public class Cachorro extends Pet implements Sons{
	
		private String pelagem;

		public Cachorro(String especie, String raca, char porte, String pelagem) {
			super(especie, raca, porte);
			this.pelagem = pelagem;
		}
		
		@Override
		public void somAlto(){
			System.out.println("AU AU AU AU AU");
		}
		
		public void somBaixo() {
			System.out.println("au au au");
		}
}
