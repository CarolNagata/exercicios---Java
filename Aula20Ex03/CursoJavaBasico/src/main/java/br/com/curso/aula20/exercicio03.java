package br.com.curso.aula20;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[][] valores = new int[3][3];

		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.println("Digite os numeros das posi��es [" + i + "," + j + "]");
				valores[i][j] = scan.nextInt();
			}
		}

		int qtdPares = 0;
		int qtdImpares = 0;

		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {

				if (valores[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores.length; j++) {
				System.out.print(valores[i][j] + " ");
			}

			System.out.println();
		}
		System.out.println();
		System.out.println("Pares = " + qtdPares);
		System.out.println("Impares = " + qtdImpares);
	}

}
