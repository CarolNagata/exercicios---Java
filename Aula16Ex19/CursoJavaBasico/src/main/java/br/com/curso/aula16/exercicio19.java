package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com as notas: ");
		int notas = scan.nextInt();
		
		double nota;
		double soma = 0;
		double media = 0;
		
		for (int i = 0; i<notas; i++) {
			System.out.println("Entre com a nota" + (i+1));
			nota = scan.nextDouble();
			
			soma += nota;
		}
		media = soma/notas;
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}
}
