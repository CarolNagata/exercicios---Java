package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.println("Digite o primeiro n?mero:");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo n?mero:");
		int num2 = scan.nextInt();
		
		for(int i = num1; i <= num2; i++) {
			soma += i;
		}
		System.out.println("a soma deu " + soma);
	}
}
