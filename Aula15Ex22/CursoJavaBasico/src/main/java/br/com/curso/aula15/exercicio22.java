package br.com.curso.aula15;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de Morango (kg):");
		double qtddMorango = scan.nextDouble();
		System.out.println("Digite a quantidade de Maçã (kg):");
		double qtddMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		if (qtddMorango <= 5) {
			precoKgMorango = 2.5;
		} else {
			precoKgMorango = 2.2;
		}
		double precoKgMaca = 0;
		if (qtddMaca <= 5) {
			precoKgMaca = 1.8;
		} else {
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = qtddMorango * precoKgMorango;
		double precoTotalMaca = qtddMaca * precoKgMaca;
		double precoParcial = precoTotalMorango + precoTotalMaca;
		double precoTotal = precoParcial;
		
		if ((qtddMorango + qtddMaca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial/100)*10);
		}
		
		System.out.println("Preço total = R$ " + precoTotal);
	}

}
