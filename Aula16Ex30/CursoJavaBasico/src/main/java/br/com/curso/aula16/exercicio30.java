package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número da tabuada: ");
		int num = scan.nextInt();
		
		boolean invalido = true;
		int inicio, fim;
		
		do {
			System.out.println("Entre com o número de início: ");
			inicio = scan.nextInt();
			System.out.println("Entre com o número de fim: ");
			fim = scan.nextInt();
			
			if (fim > inicio) {
				invalido = false;
			}
			
		} while (invalido);
		
		System.out.println("Começar por: " + inicio);
		System.out.println("Terminar em: " + fim);
		System.out.println("Tabuada de " + num + " começando em " + inicio + " terminando em " + fim);

		for (int i = inicio; i <= fim; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));
		} 
	}
}
