package br.com.curso.aula15;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Seu carro é Álccol ou Gasolina? Digite A ou G:");
		String combustivel = scan.next();
		System.out.println("Quantos litros você deseja abastecer?");
		double litros = scan.nextDouble();
		
		double precoGas = 2.50;
		double precoAlcool = 1.90;
		int desconto = 0;
		double total = 0;
		double totalDesc = 0;
		
		if (combustivel.equalsIgnoreCase("a")) {			
			if (litros <= 20) {
				 desconto = 3;
			} else {
				 desconto = 5;
			}
			
			total = litros*precoAlcool;
			
		} else if (combustivel.equalsIgnoreCase("g")) {
			if (litros <= 20) {
				 desconto = 4;
			} else {
				 desconto = 6;
			}
			
			total = litros*precoGas;
		}
		
		totalDesc = (total/100) * desconto;
		double valorPago = total - totalDesc;
		System.out.println("O valor a ser pago: " + valorPago);
	}
}
