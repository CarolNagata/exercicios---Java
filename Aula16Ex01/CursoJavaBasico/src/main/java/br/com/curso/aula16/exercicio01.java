package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
			
		System.out.println("Digite uma nota: ");
		double nota = scan.nextDouble();
		
		if (nota >= 0 && nota <= 10) {
			notaValida = true;
		System.out.println("Voc� digitou a nota " + nota);
		} else {
			System.out.println("Nota inv�lida, digite novamente");
			}	
		} while (!notaValida);
	}
}
