programa
{
	
	funcao inicio()
	{	
		const inteiro turma_escola = 4
		inteiro nomeAlune[turma_escola]
		cadeia status[] = {"Aprovador","Reprovado","Reforço"}
		inteiro notaAlune[turma_escola]

		para(inteiro i=0; i < turma_escola; i++){
			escreva("Digite o nome do alune : ")
			leia(nomeAlune[i])
			escreva("Digite a nota do alune: ")
			leia(notaAlune[i])
		}
			
		para(inteiro i=0; i < turma_escola; i++){
			se(notaAlune[i] == 5)
			{
				escreva("O nome do alune é ",nomeAlune[i],"\n e sua nota atual é ", notaAlune[i],"o Alune precisa melhorar seu aprendizado - STATUS:", status[3])	
			}
			senao se(notaAlune[i] < 5)
			{
				escreva("O nome do alune é ",nomeAlune[i],"\n e sua nota atual é ", notaAlune[i],"o Alune precisa melhorar seu aprendizado - STATUS:", status[2])
			}
			senao
			{
				escreva("O nome do alune é ",nomeAlune[i],"\n e sua nota atual é ", notaAlune[i],"o Alune precisa melhorar seu aprendizado - STATUS:", status[1])
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */