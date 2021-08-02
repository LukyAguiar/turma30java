programa
{
	
	funcao inicio()
	{
		/*
		 * Partes
		 * Receber Valores do usuário 
		 * Preencher uma matriz 3X3
		 * em seguida EXIBA A SOMA DOS VALORES DELA
		 * e a Soma dos valores da primeira Diagonal
		 * 
		 * 
		  */

		  const inteiro LN = 3
		  const inteiro CL = 3
		  inteiro M1[LN][CL]
		  inteiro RM1 = 0
		  inteiro RM2 = 0


		  para (inteiro l=0; l<LN; l++){
			para(inteiro c=0; c<CL; c++){

			 escreva("Digite um valor para Matriz :")
			  leia(M1[l][c])

			   se(M1[l][c] == M1[0][0] ){
		  	
		  		RM1 = M1[0][0] + M1[1][1] + M1[2][2]	
			   }
		 	} 
		  }

		  para (inteiro l=0; l<LN; l++){
			para(inteiro c=0; c<CL; c++){
				//Perdão pela lógica preguiçosa
		  		RM2 = M1[0][0] + M1[1][0] + M1[2][0] + M1[0][1] + M1[1][1] + M1[2][1] + M1[0][2] + M1[1][2] + M1[2][2] 
		 	} 
		  }
		  
		  //Soma dos valores da Diagona
		  escreva("A soma de todos os valores da Matriz é ",RM2,"\n")
		  escreva("A soma dos valores da diagonal principal da Matriz é ",RM1,"\n")
	  }
		 
	 
	}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 445; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */