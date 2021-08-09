package classes;

public class Gato extends Pet implements Sons{

	
	private String pelagem;
	private String Pedigree;
	public Gato(String especie, String raca, char porte, String pedigree) {
		super(especie, raca, porte);
		Pedigree = pedigree;
	}
	@Override
	public void somAlto() {
		// TODO Auto-generated method stub
		System.out.println("MIAU MIAU MIAU");
	}
	@Override
	public void somBaixo() {
		// TODO Auto-generated method stub
		System.out.println("miau miau miau");
	}
	
	
	
}
