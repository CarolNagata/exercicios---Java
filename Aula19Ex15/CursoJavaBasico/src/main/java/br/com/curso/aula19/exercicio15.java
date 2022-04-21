package br.com.curso.aula19;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o número do vetor " + i);
			vetorA[i] = scan.nextInt();
		}
		int impares = 0;
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				impares ++;
			}
		}
		
		int par = vetorA.length - impares;
		double porcentPares = (par * 100)/ vetorA.length;
		double porcentImpares = 100 - porcentPares;
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Porcentagem pares: " + porcentPares);
		System.out.println("Porcentagem impares: " + porcentImpares);
	}
}
