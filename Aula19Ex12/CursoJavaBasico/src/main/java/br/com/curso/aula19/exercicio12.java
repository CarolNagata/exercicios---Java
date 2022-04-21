package br.com.curso.aula19;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com os múmeros do vetor " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int soma = 0;
		for (int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];
		}
		System.out.println("O valor da soma é " + soma);

	}

}
