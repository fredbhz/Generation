programa
{
	funcao inicio()
	{
		inteiro opcao
		
		escreva("Escreva a sua faixa de idade")
		escreva("1) Entre 16 e 18 anos")
		escreva("2) Entre 18 e 65 anos")
		escreva("3) Maior de 65 anos")
		escreva("4) Manor de 16 anos")

		escreva("Escolha uma opção: ")
		leia(opcao)

		limpa()

		escolha (opcao)	
		{
			caso 1: 
		 		escreva ("Facultativo")
		 		pare   
		 	caso 2: 
		 		escreva ("Obrigatorio")
		 		pare   
		 	caso 3: 
		 		escreva ("Facultativo")
		 		pare
		 	caso 4: 
		 		escreva ("Não apto")
		}

		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 484; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */