programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
		quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula*/

		real x1
		real x2
		real y1
		real y2
		real d
		real p1
		real p2
		
		escreva("Digite o valor de x1 :")
		leia(x1)
		escreva("Digite o valor de x2 :")
		leia(x2)
		escreva("Digite o valor de y1 :")
		leia(y1)
		escreva("Digite o valor de y2 :")
		leia(y2)
		
		
		p1 = Matematica.potencia((x2-x1), 2)
		p2 = Matematica.potencia((y2-y1), 2)
		d = Matematica.raiz((p1+p2), 2)
		
		escreva("A tal da distância é "+d)

		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 500; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */