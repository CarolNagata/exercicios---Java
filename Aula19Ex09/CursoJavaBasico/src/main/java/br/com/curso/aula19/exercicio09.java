package br.com.curso.aula19;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int vetorA[] = new int[10];
		double vetorB[] = new double[vetorA.length];
		double vetorC[] = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o n�mero do vetor A ");
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com o n�mero do vetor B ");
			vetorB[i] = scan.nextDouble();

			vetorC[i] = vetorA[i] / vetorB[i];
		}
		System.out.println();

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
			
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
			
		}
		System.out.println();

		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
			
		}
		System.out.println();
	}
}
