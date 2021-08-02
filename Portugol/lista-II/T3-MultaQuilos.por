programa
{
	
	funcao inicio()
	{
		inteiro P //peso
		inteiro E //excesso 
		inteiro M = 4 //multa 
		inteiro Q //Quilos

		escreva("Informe aqui, a quantidade de quilos que você trouxe para o estabelecimento: ")
		leia(P)

		se(P > 50){
			E = P - 50
			Q  = E * M			
			escreva("A quantidade de quilos ultrapassou o limite de São Paulo, sua multa será de ", Q)		
		}
		
		senao{
		     M = M - 4		
			escreva("A quantidade de quilos está aprovada no limete de São Paulo, valor da sua multa é igual a ", M)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 516; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */