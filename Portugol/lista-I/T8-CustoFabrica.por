programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real custoFabrica
		real custoDistribuidora = 0.28
		real custoImposto = 0.45

		escreva("Digite o custo de fábrica: ")
		leia(custoFabrica)

		escreva("O custo total do automóvel é de: " + ((custoFabrica * custoDistribuidora) + (custoFabrica * custoImposto) + custoFabrica))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */