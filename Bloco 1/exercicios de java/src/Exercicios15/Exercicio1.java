package Exercicios15;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int NumeroUM;
		int NumeroDois;
		int NumeroTrez;
		Scanner Leia = new Scanner(System.in );
		System.out.println("insira um numero");
		NumeroUM = Leia.nextInt();
		
		System.out.println("insira um numero");
		NumeroDois = Leia.nextInt();
		
		System.out.println("insira um numero");
		NumeroTrez = Leia.nextInt();
		 if(NumeroUM >NumeroDois &&NumeroUM>NumeroTrez ) {
			 System.out.println(NumeroUM);
			 
		 } else if (NumeroDois>NumeroTrez) {
			 System.out.println(NumeroDois);
			 
		 }else {
			 System.out.println(NumeroTrez);
		 }
	
	}


}
