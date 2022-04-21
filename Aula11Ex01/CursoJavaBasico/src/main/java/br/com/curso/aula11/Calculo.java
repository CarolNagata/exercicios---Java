package br.com.curso.aula11;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor para A: ");
		int a = scan.nextInt();
		System.out.println("Digite um valor para B: ");
		int b = scan.nextInt();
		System.out.println("Digite um valor para C: ");
		float c = scan.nextFloat();
		
		double valor1 = a*2 + b/2;
		System.out.println(valor1);
		double valor2 = a*3 + c;
		System.out.println(valor2);
		double valor3 = Math.pow(3, c);
		System.out.println(valor3);

	}

}
