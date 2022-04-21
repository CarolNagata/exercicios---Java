package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de CDs comprados: ");
		int cd = scan.nextInt();
		
		double valor = 0;
		double media;
		double soma = 0;
		
		for (int i = 0; i < cd; i++) {
			System.out.println("Entre com o valor dos CDs comprados " + i);
			valor = scan.nextDouble();
			
			soma += valor;
		}
		
		media = soma / cd;
		System.out.println("A média de valor de cada CD é de R$ " + media);

	}

}
