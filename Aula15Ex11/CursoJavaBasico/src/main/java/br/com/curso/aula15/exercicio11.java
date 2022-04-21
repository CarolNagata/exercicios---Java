package br.com.curso.aula15;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o salário do colaborador R$");
		double salario = scan.nextDouble();
		
		int percentual;
		
		if (salario <= 280) {
			percentual = 20;
		} else if (salario < 280 && salario <= 700) {
			percentual = 15;
		} else if (salario < 700 && salario <= 1500) {
			percentual = 10;
		} else {
			percentual = 5;
		}
		
		double aumento = (salario/100)*percentual;
		double salarioAjustado = salario + aumento;
		
		System.out.println("Salário R$" + salario);
		System.out.println("Percentual" + percentual);
		System.out.println("Aumento" + aumento);
		System.out.println("Salário Ajustado" + salarioAjustado);
	}
}
