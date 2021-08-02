programa
{
	
	inclua biblioteca Util
	inclua biblioteca Matematica --> Mat

	
	funcao inicio()
	{
		const inteiro jogada = 10
		real jogadas[jogada]
		inteiro somaJogadas = 0
		inteiro contMaiorPontuacao = 0
		real maiorPontuacao = 10.00
		real media

		para(inteiro x=0; x<10; x++){
			escreva("informe os lançamentos do dado: ",x+1,"º valor: ")
			leia(jogadas[x])
			somaJogadas += jogadas[x]

			se(jogadas[x] > 10){
				escreva("Não tem lado com 11 pra cima irmão")
				pare
			}

		se(jogadas[x] > maiorPontuacao){
				maiorPontuacao = Mat.maior_numero(jogadas[x],maiorPontuacao)
				para(x=0; x<10; x++){
					contMaiorPontuacao = x+1
				}
			}
		}
		media = somaJogadas/10
		escreva("\nA soma é: ",somaJogadas)
		escreva("\nA média é: ",media)
		escreva("\nA Maior Pontuação é:", contMaiorPontuacao)
		}
}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 812; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */