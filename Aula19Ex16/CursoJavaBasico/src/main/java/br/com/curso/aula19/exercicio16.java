package br.com.curso.aula19;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o numero do vetor " + i);
			vetorA[i] = scan.nextInt();
		}
		int iguais15 = 0;
		int qtdMaior15 = 0;
		int somaMenor15 = 0;
		int somaMaoir15 = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] == 15) {
				iguais15++;
			} else if (vetorA[i] < 15) {
				somaMenor15 += vetorA[i];
			} else {
				qtdMaior15 ++;
				somaMaoir15 += vetorA[i];
			}
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("Soma = " + somaMenor15);
		System.out.println("Média = " + (somaMaoir15/qtdMaior15));
		System.out.println("Iguais = " + iguais15);
	}
}
