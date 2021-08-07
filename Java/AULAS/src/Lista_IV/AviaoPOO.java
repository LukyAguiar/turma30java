package Lista_IV;

public class AviaoPOO {
		
		//Atributo
		public String nomeAviao; 
		public String nomeCapitao;
		public String nomeCoPiloto;
		public String cor;
		public boolean status;
		public int numCadeiras;
		public int numFuncionarios;
		public int numPassageiros;
		public int matriculaAviao;
		public boolean situacao;
		
		
		//Construtor
		
		public void mostrarNomes(String nomeAviao, String nomeCapitao, String nomeCoPiloto) {
			this.nomeAviao = nomeAviao;
			this.nomeCapitao = nomeCapitao;
			this.nomeCoPiloto = nomeCoPiloto;
			
			System.out.println("====AVIÃO===PILOTO==");
			System.out.println("NOME AVIÃO: " + nomeAviao);
			System.out.println("NOME CAPITÃO: " + nomeCapitao);
			System.out.println("NOME CO-PILOTO:" + nomeCoPiloto);
		}
		
		public void mostrarNumeros(int numCadeiras,int numFuncionarios,int numPassageiros, boolean status)
		{
			this.numCadeiras = numCadeiras; 
			this.numFuncionarios = numFuncionarios;
			this.numPassageiros = numPassageiros;
			this.situacao = status;
			
			System.out.println("Aeramoças:" + numFuncionarios);
			System.out.println("Passageiros:" + numPassageiros);
			System.out.println("Cadeiras: " + numCadeiras);
			
			if(situacao == true) {
				System.out.println("Estado do Avião: VOANDO");
			}else{
				System.out.println("Estado do Avião: POUSADO");
			}
		}
		
	
		
		
		
}
