programa
{
	funcao inicio()
	{
		inteiro opcao, salario, imposto
		
		escreva("Digite sua faixa salarial")
		escreva("1) de R$ 0 a 2000")
		escreva("2) de 2000.01 a R$3000.00")
		escreva("3) de 3000.01 a 4500")
		escreva("4) Maior de 4500")

		escreva("Escolha uma opção: ")
		leia(opcao)

		limpa()

		escolha (opcao)	
		{
			caso 1: 
			escreva("Digite o seu salario:  ")
			leia(salario)

			escreva ("Isento")
		 		pare  
		 	caso 2: 
		 	escreva("Digite o seu salario:  ")
			leia(salario)

			imposto = (8/100)*salario

			escreva ("IMPOSTO:    ",imposto)
		 		pare 
		 	caso 3: 
		 	escreva("Digite o seu salario:  ")
			leia(salario)

			imposto = (18/100)*salario

			escreva ("IMPOSTO:    ",imposto)
		 		pare 
		 	caso 4: 
		 	escreva("Digite o seu salario:  ")
			leia(salario)

			imposto = (28/100)*salario

			escreva ("IMPOSTO:    ",imposto)
		 		pare 
		}

		escreva("\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 813; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */