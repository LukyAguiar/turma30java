package Lista_V;

public class Preguica extends Animal{
	
	//Atributos
		private boolean somPreguica;
		
		//Construtor
		public Preguica(String nome, int anoNascimento, boolean somPreguica) {
			super(nome, anoNascimento);
			this.somPreguica = somPreguica;
		}
		//Encapsulamento

		public boolean isSomPreguica() {
			return somPreguica;
		}

		public void setSomPreguica(boolean somPreguica) {
			this.somPreguica = somPreguica;
		}
		//Metodos com Polimorfismo
		@Override //Anotação ;; Polimorfismo
		public void emitirSom() {
			if(somPreguica) {
				System.out.println("....A!...E!...MEEEE");
			}
			else
			{
				System.out.println(".....................");
			}
			
		}

}
