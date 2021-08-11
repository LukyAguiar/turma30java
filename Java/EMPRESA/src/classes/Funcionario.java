package classes;

public class Funcionario {
	
	//Atributos - Caracteristicas do Funcionario
	private String matricula;
	protected int horasTrabalhadas;
	protected double valorPorHora;
	
	//Construtor
	
	public Funcionario(String matricula, int horasTrabalhadas, double valorPorHora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	
	//Polimorfismo
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	//Metodo
	public double salario() {	
		double salario;
		return salario = horasTrabalhadas * valorPorHora;
	}

}
