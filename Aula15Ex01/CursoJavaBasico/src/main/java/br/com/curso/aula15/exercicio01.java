package br.com.curso.aula15;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int valor2 = scan.nextInt();
		
		if (valor1 > valor2) {
		System.out.println("O maior n�mero � " + valor1);
		} else { 
			System.out.println("O maior n�mero � " + valor2);
		}
	}
}
