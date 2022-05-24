programa
{
	
	funcao inicio()
	
	{inteiro maior =0
	inteiro vetor[5]
	para(inteiro i=0;i<5;i++){
	escreva("Ola,informe um valor:")
	leia(vetor[i])
	se(vetor[i]> maior){
		maior = vetor[i]
		
	}
	}
		para(inteiro i=0;i<5;i++){
			escreva(vetor[i]," ")
	
		se(vetor[i]> maior){
		maior = vetor[i]
		
	}} 
		
		escreva("maior pontuacao",maior)
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