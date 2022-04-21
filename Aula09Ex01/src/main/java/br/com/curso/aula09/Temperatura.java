package br.com.curso.aula09;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os graus em Farenheit: ");
		double farenheit = scan.nextDouble();
		
		double c;
		c = (5*(farenheit - 32)/9);
		System.out.println("C = " + c);
	}
}

