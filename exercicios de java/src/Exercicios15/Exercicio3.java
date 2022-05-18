package Exercicios15;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	int idade;
	Scanner Leia = new Scanner(System.in );
	System.out.println("insira sua idade");
	idade = Leia.nextInt();
	if (idade>=10&& idade<=14) {
		System.out.println("Infantil");
		
	}
if (idade>=15&& idade<=17) {
	System.out.println("Juvenil");
		
	}
if (idade>=18&& idade<=25) {
	System.out.println("Adulto");
	
}
}
}
