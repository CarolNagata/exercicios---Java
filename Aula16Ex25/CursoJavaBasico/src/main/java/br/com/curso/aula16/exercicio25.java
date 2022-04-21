package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco, total, valorPago, troco;
		String output;		
		
		do {
			System.out.println("Deseja informar uma nova compra? (S/N)");
			continuarCompra = scan.next();
			
			if(continuarCompra.equalsIgnoreCase("s")) {
				
				output = "Lojas Tabajara\n";
				
				System.out.println("Digite a quantidade de produtos: ");
				qtdProdutos = scan.nextInt();
				
				total = 0;
				
				for (int i = 1; i <= qtdProdutos; i++) {
					System.out.println("Informe preço do produto" + i);
					preco = scan.nextDouble();
					
					total += preco;
					output += "Produto " + i + " : R$ " + preco + "\n";
					
				}
				
				output += "Total: R$ " + total;
				
				System.out.println("Total: R$ " + total);
				
				System.out.println("Entre com valor pago R$ ");
				valorPago = scan.nextDouble();
				
				output += "Dinheiro: R$ " + valorPago + "\n";
				
				troco = valorPago - total;
				
				output += "Troco: R$ " + troco;
				
				System.out.println(output);
				
			} else {
				sair = true;
			}
			
		} while (!sair);

	}

}
