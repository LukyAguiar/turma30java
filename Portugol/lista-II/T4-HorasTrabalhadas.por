programa
{
	
	funcao inicio()
	{
		cadeia C //Código do funcionario
		inteiro NH // número de horas trabalhadas
		inteiro E // execesso de pagamentoi
		real salarioTo = 0.00
		real salarioExe = 0.00


		escreva("Digite seu Código de Registro: ")
		leia(C)
		escreva("Digite a quantidade de horas trabalhadas: ")
		leia(NH)		

		se(NH <= 50){
			salarioTo = NH * 10.00
		}
		senao{
			E = NH -50
			salarioExe = E * 20.00
			salarioTo = salarioExe + 500.00
		}
		escreva("Salario total : R$ ",salarioTo, " || Salario execendente: R$ ", salarioExe)


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 554; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */