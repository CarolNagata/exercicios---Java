package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos: ");
		int qtddProdutos = scan.nextInt();
		
		for (int i = 1; i<=50; i++) {
			if (qtddProdutos <= 50) {
			double valorTotal = qtddProdutos * 1.99;
			
			System.out.println("Voc� comprou " + qtddProdutos + " produtos o valor total da compra � R$ " + valorTotal);
			} else {
				System.out.println("A quantidade m�xima s�o 50 produtos");
			}
		}

	}

}
