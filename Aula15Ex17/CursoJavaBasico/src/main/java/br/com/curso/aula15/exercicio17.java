package br.com.curso.aula15;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre como ano");

		int ano = scan.nextInt();
		
		if ((ano % 400 == 0 || ano % 4 == 0 && ano %100 != 0)) {
			System.out.println("� bissexto");
		}else {
			System.out.println("n�o � bissexto");
		}
	}

}
