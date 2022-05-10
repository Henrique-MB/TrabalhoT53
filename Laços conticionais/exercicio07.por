programa
{/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	
*/
funcao inicio()
	{real base
	real altura
	real harea
		escreva("Por favor,insira a base do triangulo: ")
		leia(base)
		
		se(base>0){
			escreva("Por favor,insira a altura do triangulo: ")
		leia(altura)
		se(altura>0){
		harea=(base*altura)/2
		escreva("Resultado Real"+harea)	
		}senao{
			escreva("valor invalido")
		}
		
			
		}senao{
			escreva("valor negativo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */