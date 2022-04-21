package br.com.curso.aula15;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int nota1 = scan.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota2 = scan.nextInt();
		
		double media = (nota1 + nota2)/2;
		if (media >= 7 && media < 10) {
			System.out.println("Aprovado");
		} else if (media == 10) {
			System.out.println("Aprovado com Distinção");
		} else {
			System.out.println("Reprovado");
		}
	}
}
