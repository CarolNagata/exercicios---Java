package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		
		boolean primo = false;
		for (int i = 2; i < num; i++) {
			if (num % 2 == 0) {
				System.out.println("Não é primo, divisível por: " + i);
				primo = false;
				break;
			} else {
				System.out.println("É primo");
			}
		}		
	}

}
