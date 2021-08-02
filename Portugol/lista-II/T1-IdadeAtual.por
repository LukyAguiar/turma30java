programa
{
	
	funcao inicio()
	{
		//variaveis - fortemente tipada // fracamente tipada
		cadeia nome 
		inteiro anoNascimento // camelCase PascalCase
		inteiro idade
		inteiro anoAtual = 2021

		escreva("Digite o nome :")
		leia(nome)
		escreva("Digite o ano de nascimento : ")
		leia(anoNascimento)
		idade = anoAtual - anoNascimento

		escreva("Olá ",nome," você tem ", idade," de idade e ")
		
		se(idade >= 45){
			escreva("você tem história pra contar") 
		}
		senao{
			escreva("ainda tem muito a viver")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */