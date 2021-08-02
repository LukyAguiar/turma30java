programa
{
	
		inclua biblioteca Util

	/*	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		das matrizes N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2. 
	*/	
	funcao inicio()
	{
		//Matrizes N1 E N2 - 4,6 - M1 E M2
		const inteiro LN=4
		const inteiro CL=6
		inteiro N1[LN][CL]
		inteiro N2[LN][CL]
		inteiro M1[LN][CL]
		inteiro M2[LN][CL]
		
		

		
		para (inteiro l=0; l<LN; l++){
			para(inteiro c=0; c<CL; c++){
				
				escreva("Digite um valor para N1 :")
				leia(N1[l][c])
			
				escreva("Digite um valor para N2 :")
				leia(N2[l][c])
						
				M1[l][c] = N1[l][c] + N2[l][c]
				M2[l][c] = N1[l][c] - N2[l][c]
			}
		}
		//ps:DEMORA PRA PREENCHER AS INFORMAÇÕES DAS MATRIZES, NÃO É UM LOOP INFINITO
		escreva("MATRIZ N1\n")
		para (inteiro l=0; l<LN; l++){
			para(inteiro c=0; c<CL; c++){
				escreva(N1[l][c]," ")
			}
			escreva("\n")
		}
		escreva("MATRIZ N2\n")
		para (inteiro l=0; l<LN; l++){
			para(inteiro c=0; c<CL; c++){
				escreva(N2[l][c]," ")
			}
			escreva("\n")
		}
		escreva("MATRIZ M1\n")
		para (inteiro l=0; l<LN; l++){
			para(inteiro c=0; c<CL; c++){
				escreva(M1[l][c]," ")
			}
			escreva("\n")
		}
		escreva("MATRIZ M2\n")
		para (inteiro l=0; l<LN; l++){
			para(inteiro c=0; c<CL; c++){
				escreva(M2[l][c]," ")
			}
			escreva("\n")
		
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1171; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */