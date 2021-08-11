package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Funcionario;
import classes.Tercerizado;

public class CadFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		List<Funcionario> folha = new ArrayList<>();
		char tipo;
		char op;
		do {
			System.out.println("Funcionario F-funcioanrio ou T-terceiro:");
			tipo = leia.next().toUpperCase().charAt(0);
			System.out.println("Digite a matricula : ");
			String matricula = leia.next().toUpperCase();
			System.out.println("Digite as horas trabalhadas :");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Digite o valor por hora : R$ ");
			double valorHora = leia.nextDouble();	
			if (tipo == 'T') {
				System.out.println("Digite o valor do adicional : R$");
				double adicional = leia.nextDouble();
				folha.add(new Tercerizado(matricula,horasTrabalhadas,valorHora,adicional));
			} else if(tipo == 'F') {
				folha.add(new Funcionario(matricula,horasTrabalhadas,valorHora));
			}
			System.out.println("Continua S/N :");
			op = leia.next().toUpperCase().charAt(0);
			
		}while(op=='S');
		
		for (Funcionario func : folha) {
			System.out.printf("%s seu salario é R$ %.2f\n",func.getMatricula(),func.salario());
		}
	}

}
