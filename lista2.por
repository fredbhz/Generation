programa
{
	/* Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.  */
	funcao inicio()
	{
	
    inteiro ano, mes, dia, dias
    
    dia = 14099
    ano = (dia / 365)
    mes = (dia % 365)/30
    dias = (dia % 365)%30

    escreva ("Ano:  ", ano)
    
    escreva ("Meses:  ",mes)
    
    escreva ("dias:  ",dias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */