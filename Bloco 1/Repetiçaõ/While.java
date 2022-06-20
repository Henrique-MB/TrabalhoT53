package Repetiçaõ;

mportar  java . útil . Scanner ;

classe  pública ExemploWhile {

	public  static  void  main ( String [] args ) {mportar  java . útil . Scanner ;

	 classe  pública ExemploWhile {

		public  static  void  main ( String [] args ) {
			Scanner  ler = new  Scanner ( System . in );
			
			int  n , soma = 0 ;
			
			Sistema . fora . print ( "Digite um numero para ser somado: " );
			n = ler . nextInt ();
			
			enquanto ( n >= 0 )
			{
				se ( n % 2 == 0 )
					soma = soma + n ;
				Sistema . fora . print ( "Digite um numero para ser somado: " );
				n = ler . nextInt ();
			}
			Sistema . fora . println ( "A soma dos valores pares foi: " + soma );

			Sistema . fora . println ( "Escola uma tabuado do 1 ao 10: " );
			n = ler . nextInt ();
			
			enquanto ( n > 0 && n <= 10 )
			{
				for ( int  x = 1 ; x <= 10 ; x ++)
					Sistema . fora . println ( n + "X" + x + " = " + n * x );
				Sistema . fora . print ( "\nEscola uma tabuada: " );
				n = ler . nextInt ();
			}
			Sistema . fora . println ( "Valor inválido Fim do programa!!!" );
		}

	}
		Scanner  ler = new  Scanner ( System . in );
		
		int  n , soma = 0 ;
		
		Sistema . fora . print ( "Digite um numero para ser somado: " );
		n = ler . nextInt ();
		
		enquanto ( n >= 0 )
		{
			se ( n % 2 == 0 )
				soma = soma + n ;
			Sistema . fora . print ( "Digite um numero para ser somado: " );
			n = ler . nextInt ();
		}
		Sistema . fora . println ( "A soma dos valores pares foi: " + soma );

		Sistema . fora . println ( "Escola uma tabuado do 1 ao 10: " );
		n = ler . nextInt ();
		
		enquanto ( n > 0 && n <= 10 )
		{
			for ( int  x = 1 ; x <= 10 ; x ++)
				Sistema . fora . println ( n + "X" + x + " = " + n * x );
			Sistema . fora . print ( "\nEscola uma tabuada: " );
			n = ler . nextInt ();
		}
		Sistema . fora . println ( "Valor inválido Fim do programa!!!" );
	}

}
