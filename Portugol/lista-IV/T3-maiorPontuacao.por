programa
{
	inclua biblioteca Matematica --> Mat
	/*
	1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
	*/

	
	funcao inicio()
	{
		const inteiro valor = 5 
		real valores[valor]
		real maiorValor = 0.00
		real menorValor = 10.00
				
		para(inteiro i=0; i < valor; i++){
			escreva("Digite valores para uma tabela de pontuações: ")
			leia(valores[i])

			se(valores[i] > maiorValor){
				maiorValor = Mat.maior_numero(valores[i],maiorValor)
			}
			senao
			{
				menorValor = Mat.menor_numero(valores[i],menorValor)
			}
			
		}
			escreva("O maior valor entre as 5 pontuações é ",maiorValor,"\n")
			escreva("O menor valor entre as 5 pontuações é ", menorValor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 525; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */