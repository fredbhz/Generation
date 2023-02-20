programa{
funcao inicio()
{
	

	inteiro M1 [3][3],C,L,cont = 0 ,somaTotal = 0 ,diagonal 

	para (L=0;L<3;L++){
		para(C=0;C<3;C++){
		cont++
		escreva("\n DIGITE UM NUMERO : ")
		leia(M1[L][C])
		somaTotal += M1[L][C] 
	}
		}

		diagonal = M1[0][0] + M1[1][1] + M1[2][2] 
		escreva("\n a SOMA da matriz M1 com M2 é:",somaTotal)
		escreva("\n O valor da diagonal  é :",diagonal)




}	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */