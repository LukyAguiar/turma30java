programa
{
	
	funcao inicio()
	{
		real v1, v2, v3, v4
		real q1, q2, q3, q4
		// v = Valor 
		// q = Quadrado

		escreva("Digite o valor 1 :")
		leia(v1)
		escreva("Digite o valor 2 :")
		leia(v2)
		escreva("Digite o valor 3 :")
		leia(v3)
		escreva("Digite o valor 4 :")
		leia(v4)

		q1 = v1 * v1
		q2 = v2 * v2
		q3 = v3 * v3
		q4 = v4 * v4

		se (q3 >= 1000){
			escreva("\nValor 3 foi ",v3," e seu quadrado é ",q3)
		} 
		senao {
			escreva("\nValor 1 foi ",v1," e seu quadrado é ", q1)
			escreva("\nValor 2 foi ",v2," e seu quadrado é ", q2)
			escreva("\nValor 3 foi ",v3," e seu quadrado é ", q3)
			escreva("\nValor 4 foi ",v4," e seu quadrado é ", q4)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */