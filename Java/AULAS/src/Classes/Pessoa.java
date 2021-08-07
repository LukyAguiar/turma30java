package Classes;

public class Pessoa {
	
		//ATRIBUTOS

		public String nome;
		public int anoNascimento;
		public String cpf;
		public char proNome; //M = Masculino // F = Feminimo // E = Elos //
		public boolean ativo;
		
		//METODO 
		
		public void mostrarIdade() {
			System.out.println(2021-this.anoNascimento);
		}
		
		public int calcIdade(int anoAtual, int anoNascimento) {
			int valor;
 			valor = anoAtual - anoNascimento;		
			return  valor;	
		}
		
		//Construtores
		public Pessoa(String nome) {
			this.nome = nome;
		}
		
		
		
}
