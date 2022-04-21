package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número de temperatura: ");
		int numTemp = scan.nextInt();
		
		double temperatura, media;
		double soma = 0;
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;

		for (int i = 1; i <= numTemp; i++) {

			System.out.println("Digite as temperaturas: " + i);
			temperatura = scan.nextDouble();

			soma += temperatura;

			if (temperatura > max) {
				max = temperatura;
			}
			if (temperatura < min) {
				min = temperatura;
			}
		}
		
		System.out.println("Média = " + (soma / numTemp));
		System.out.println("Menor temperatura: " + min);
		System.out.println("Maior temperatura: " + max);
	}
}
