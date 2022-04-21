package br.com.curso.aula15;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int valor2 = scan.nextInt();
		
		if (valor1 > valor2) {
		System.out.println("O maior número é " + valor1);
		} else { 
			System.out.println("O maior número é " + valor2);
		}
	}
}
