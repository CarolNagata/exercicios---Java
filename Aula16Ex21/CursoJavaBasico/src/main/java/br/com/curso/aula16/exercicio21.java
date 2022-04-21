package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a quantidade de turmas: ");
		int turmas = scan.nextInt();

		double media;
		int alunos = 0;
		int soma = 0;
		boolean invalido = true;

		for (int i = 1; i < turmas; i++) {
			do {
				System.out.println("Entre com a quantidade de alunos por turma: " + i);
				alunos = scan.nextInt();
				
				if (alunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Número de alunos inválido");
				}
			} while (invalido);
			
			soma += alunos;		
		}
		media = soma/turmas;
		System.out.println("Média: " + media);
	}
}
