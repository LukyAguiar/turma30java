package programas;

import classes.Produto;

public class CadLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Produto prod1 = new Produto("001","CAMISA",50.00,10);
		Produto prod2 = new Produto("002","Meia",10.00,10);
		
		//Alterando
		prod1.setNome("CAMISETA");
		prod1.setValor(200);
		prod1.setEstoque(500);
		
		prod1.incluirEstoque(20);
		prod2.retirarEstoque(5);
		System.out.println(prod1.getNome()+ " qtde " + prod1);
		
		
		//Pegando o valor
		System.out.println(prod1.getValor()*2);
		System.out.println(prod1.getEstoque());
	}

}
