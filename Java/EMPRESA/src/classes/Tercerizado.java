package classes;

public class Tercerizado extends Funcionario{
	
	//Atributos
	private double adicional;

	//Construtor 
	public Tercerizado(String matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}
	//polimorfismo
	public double getAdicional() {
		return adicional;
	}
	
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//Metodos 

	@Override
	public void salario(){	
		
		return super.getValorPorHora()* super.getHorasTrabalhadas() + adicional;
		
	}




	
}
