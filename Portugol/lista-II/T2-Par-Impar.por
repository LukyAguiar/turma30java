programa
{
	
	funcao inicio()
	{
		inteiro num, resto

		escreva("Digite um número: ")
		leia(num)

		resto = num % 2

		
		se(num < 0){
			escreva("Números negativos não passarão(Negativo)")
		}
		
		se(num == 0){
			escreva("O número informado é neutro.")	
		}
		senao se(resto == 0){
			escreva("O número informado é par.(Positivo)")
		}
		senao{
			escreva("O número informado é ímpar.(Positivo)")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */