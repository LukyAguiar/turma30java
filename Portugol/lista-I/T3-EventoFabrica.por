programa
{
	
	funcao inicio()
	{
		inteiro horas
		inteiro minutos
		inteiro segundos
		inteiro tempoEvento

		//entradas
		escreva("Informe o tempo do evento na Fábrica: ")
		leia(tempoEvento)

		horas = tempoEvento / 3600
		minutos = (tempoEvento % 3600) / 60
		segundos =  (tempoEvento % 3600) % 60


		escreva("\nHoras: "+horas)
		escreva("\nMinutos: "+minutos)
		escreva("\nSegundos: "+segundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 176; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */