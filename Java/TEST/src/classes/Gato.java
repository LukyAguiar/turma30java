package classes;

public class Gato extends Pet{
	
		//Atributos
	
		private boolean miadoAlto;
	
		//Construtores
		
		public Gato(String raca, boolean miadoAlto) {
			super(raca);
			this.miadoAlto = miadoAlto;
		}
	
		//Sobrecarga
		
		public Gato(String raca, int anoNascimento, boolean miadoAlto) {
			super(raca, anoNascimento);
			this.miadoAlto = miadoAlto;
		}
		
		//encapsulameto
		public boolean isMiadoAlto() {
			return miadoAlto;
		}

		public void setMiadoAlto(boolean miadoAlto) {
			this.miadoAlto = miadoAlto;
		}
		

		//Metodos
		@Override
		public void emiteSom() {
			System.out.println("MIAU! MIAU! MIAU! MIAU!");
		}

		
}
