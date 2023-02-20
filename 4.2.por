programa {

funcao inicio()
{

	inteiro pontuacao[10],x,Maior = 0, repeticao = 0
	real MEDIA = 0.0, somaTotal = 0.0
	para (x=0;x<10;x++){
		escreva("coloque uma pontuação:  ")
		leia(pontuacao[x])
		somaTotal += pontuacao[x]
			se (Maior<pontuacao[x]){			
			Maior = pontuacao[x]
			}
	}
		para (x=0;x<10;x++){
			se (Maior==pontuacao[x]){			
			repeticao++
			}
		}
		MEDIA = somaTotal/10
		escreva("\n a média é :  ",MEDIA)
		escreva("\n A quantidade de vezes que o maior numero foi repetido é :  ", repeticao)
		escreva("\n A maior pontuação é:  ", Maior )
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 561; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */