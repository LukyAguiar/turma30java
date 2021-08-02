programa
{
	
	funcao inicio()
	{
		cadeia times[4]

		times[1] = "SPFC"
		times[2] = "CORINTHIANS"
		times[3] = "PALMEIRAS"
		times[4] = "SANTOS"

		//varrer o vetor
		para(inteiro indice=0; indice<4; indice++){
			escreva(times[indice]+"\n")
		}

		escreva("PONTOS DOS TIMES \n")
		para(inteiro indice=0; indice<4; indice++){
			escreva(pontos[indice]+"\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 361; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {times, 6, 9, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */