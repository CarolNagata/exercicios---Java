package br.com.curso.aula19;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com a idade: " + i);
			vetorA[i] = scan.nextInt();
		}
		
		int maior35 = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			if(vetorA[i] > 35) {
				maior35 ++;
			}
		}
		System.out.print("Idade das pessoas: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("A quantidade de pessoas com mais de 35 anos é de " + maior35);
	}

}
