package br.com.curso.aula15;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Digite o primeiro n�mero: ");
			int valor1 = scan.nextInt();
			
			if (valor1 >= 0) {
			System.out.println("Esse n�mero � positivo");
			} else { 
				System.out.println("Esse n�mero � negativo");
			}

	}

}
