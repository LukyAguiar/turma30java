package Lista_IV;

public class ClientePOO {

	public static void main(String[] args) {
		
			Cliente cliente1 = new Cliente();
			
			cliente1.nome = "Lucas";
			cliente1.cpf = "457.387.489.50";
			cliente1.email = "Lucas.nune@outlook.com.br";
			cliente1.anoNascimento = 2001;
			cliente1.telefone = 119125649;
			cliente1.genero = 'M';
			
			cliente1.mostraNome();
			cliente1.mostraCpf();
			cliente1.mostraEmail();
			cliente1.mostraAnoNascimento();
			cliente1.mostraTelefone();
			cliente1.mostraGenero();
			
	}

}
