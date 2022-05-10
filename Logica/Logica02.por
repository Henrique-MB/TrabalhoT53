programa
{
/*
 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
 */
	
	funcao inicio(){
	inteiro xDias,Anos, Meses,Dias

     escreva("Qual a sua idade em dias: ")
     leia(xDias)

     Anos=xDias/365
      Meses=(xDias%365)/30
     Dias=(xDias%365)%30
     
     escreva(" sua idade em Anos " + Anos+" Em Meses " + Meses + " Total de Dias " + Dias )
     
     

	
	/*xDias=(365)*4
	Anos=xDias/365
	Meses=(xDias%365)/30
	
	escreva ("xDias é igual a"Anos,"Anos é igual a Meses"Meses "igual a Dias"){
		leia ( Dias)*/
			
		}
		
		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */