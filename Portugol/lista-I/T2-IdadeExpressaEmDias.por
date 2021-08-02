programa
{
	
	funcao inicio()
	{
		inteiro anos
		inteiro meses
		inteiro dias
		inteiro totalDias

		//entradas
		escreva("Digite a sua idade no total de dias ")
		leia(totalDias)

		anos = totalDias / 365
		meses = (totalDias % 365) / 30
		dias =  (totalDias % 365) % 30


		escreva("\nAnos de vida : "+anos)
		escreva("\nMeses de vida : "+meses)
		escreva("\nDias de vida  : "+dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */