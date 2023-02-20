programa{
  
  funcao inicio(){
    inteiro a, b, c
    
    escreva("Digite os valores para A, B e C: ")
    leia(a, b, c)

    se(a + b > c)
      escreva("A soma de A+B é maior que C ")
      se(a + b < c)
        escreva("A Soma de A + B é Menor do que C")
      senao{
        se(a +b == c)
          escreva("A Soma de A + B é Igual a C")
      }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 289; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */