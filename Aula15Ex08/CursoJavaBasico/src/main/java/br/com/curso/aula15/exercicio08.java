package br.com.curso.aula15;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o preço do primeiro produto: ");
		double preco1 = scan.nextDouble();
		System.out.println("Digite o preço do segundo produto: ");
		double preco2 = scan.nextDouble();
		System.out.println("Digite o preço do terceiro produto: ");
		double preco3 = scan.nextDouble();
		
		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("R$ " + preco1 + " é o mais barato");
		}else if (preco2 < preco3 && preco2 < preco1) {
			System.out.println("R$ " + preco2 + " é o mais barato");
		}else {
			System.out.println("R$ " + preco3 + " é o mais barato");
		}
	}

}
