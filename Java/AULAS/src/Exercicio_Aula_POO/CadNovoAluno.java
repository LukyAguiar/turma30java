package Exercicio_Aula_POO;

public class CadNovoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciar um aluno
		
		 Aluno exemplo1 = new Aluno();
		 Aluno exemplo2 = new Aluno();
		 
		 exemplo1.nome = "KRATOS";
		 exemplo1.nota = 9;
		 exemplo1.matricula = "M-01";
		 exemplo1.status = true;
		 exemplo1.anoNascimento = 2007;
		 
		 exemplo2.nome = "ZEUS";
		 exemplo2.nota = 5;
		 exemplo2.matricula = "M-02";
		 exemplo2.status = true;
		 exemplo2.anoNascimento = 2002;
		 
		 //exemplo2.mostraIdade(2021);
		 //exemplo1.mostraIdade(2021);
		 
		 exemplo2.mostraIdade(2021,exemplo2.anoNascimento);
		
		 
		/* System.out.println(exemplo1.nome+" "+exemplo1.nota);
		 if(exemplo1.nota >= 5) {
			 System.out.println("Ta Aprovado");
		 }else {
			 System.out.println("Reprovado");
		 }
		  */
	} 

}
