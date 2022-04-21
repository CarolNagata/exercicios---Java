package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;
		double media;
		int soma = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com um número: ");
			num = scan.nextInt();

			soma += num;
		}
		media = soma/5;
		System.out.println("A média é: " + media);
		System.out.println("A soma é: " + media);
	}
}
