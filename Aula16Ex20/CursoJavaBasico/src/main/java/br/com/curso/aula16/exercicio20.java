package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n�mero de pessoas: ");
		int pessoas = scan.nextInt();

		int idade = 0;
		int soma = 0;
		double media;

		for (int i = 0; i < pessoas; i++) {
			System.out.println("Entre com a idade das pessoas" + (i + 1));
			idade = scan.nextInt();

			soma += idade;
		}
		media = soma / pessoas;
		System.out.println("M�dia da idade " + media);
		
		if (media >= 0 && media <= 25) {
			System.out.println("A turma � jovem");
		} else if (media >= 26 && media <= 60) {
			System.out.println("A turma � adulta");
		} else {
			System.out.println("A turma � idosa");
		}
	}
}
