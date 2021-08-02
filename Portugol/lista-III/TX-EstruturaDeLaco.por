programa
{
	
	funcao inicio()
	{
		escreva("Quantas linhas você que?")
		inteiro x//10 vezes
		para (x=0;x<=10; x=x+1){
			escreva(x," - Bom dia, o SOL JA NASCEU LA NA FAZENDINHAAA\n")
		}
		linha(40)//chamando a função
		linha(70)
		para(inteiro y=10;y>=1; y--){
			escreva(y," ATÉ LOGO\n")
		}
	}

	funcao linha(inteiro tamanho)
	{
		para(inteiro x=1; x <=tamanho; x++){
			escreva("-")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 73; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */