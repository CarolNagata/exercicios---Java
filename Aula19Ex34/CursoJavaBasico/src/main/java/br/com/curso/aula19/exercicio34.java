package br.com.curso.aula19;

import java.util.Scanner;

public class exercicio34 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os n�meros " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analisando o n�mero " + vetorA[i]);

			for (int j = 2; j < vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println(j + " � par");
				}
			}

			System.out.println();
		}

	}

}
