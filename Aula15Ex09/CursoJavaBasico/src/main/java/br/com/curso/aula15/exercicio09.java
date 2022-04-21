package br.com.curso.aula15;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int valor1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		int valor2 = scan.nextInt();
		System.out.println("Digite o terceiro número: ");
		int valor3 = scan.nextInt();		
		
		if (valor1 <= valor2 && valor2 <= valor3 && valor1 <= valor3) {
			System.out.println("Ordem decrescente:" + " " + valor3 + " " + valor2 + " " + valor1);
		}else if (valor1 <= valor2 && valor1 <= valor3 && valor3 <= valor2) {
			System.out.println("Ordem decrescente:" + " " + valor2 + " " + valor3 + " " + valor1);
		}else if (valor2 <= valor1 && valor2 <= valor3 && valor1 <= valor3){
			System.out.println("Ordem decrescente:" + " " + valor1 + " " + valor3 + " " + valor2);
		}else if (valor3 <= valor1 && valor3 <= valor2 && valor1 <= valor2){
			System.out.println("Ordem decrescente:" + " " + valor2 + " " + valor1 + " " + valor3);
		}else if (valor3 <= valor1 && valor3 <= valor2 && valor2 <= valor1){
			System.out.println("Ordem decrescente:" + " " + valor1 + " " + valor2 + " " + valor3);
		}
	}
}
