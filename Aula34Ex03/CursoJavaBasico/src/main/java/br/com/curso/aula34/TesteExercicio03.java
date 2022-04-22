package br.com.curso.aula34;

import java.util.Scanner;

public class TesteExercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("Digite um numero positivo: ");
			num = scan.nextInt();
			if (num < 0) {
				System.out.println("Número inválido, digite novamente. ");
			}
		} while (num < 0);
		System.out.println(CalculadoraEx02.fatorial(num));

	}

}
