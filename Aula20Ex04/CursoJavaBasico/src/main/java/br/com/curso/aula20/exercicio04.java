package br.com.curso.aula20;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String [][] compromissos = new String [31][24];

		boolean sair = false;
		byte opcao;
		while (!sair) {
			System.out.println();
			System.out.println("Digite 1 para adicionar um compromisso");
			System.out.println("Digite 2 para verificar um compromisso");
			System.out.println("Digite 0 para sair");

			opcao = scan.nextByte();

			if (opcao == 1) {

				boolean diaValido = false;
				int dia=0;
				while (!diaValido) {
					System.out.println("Digite o dia do mês");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido. Digite novamente");
					}
				}
				boolean horaValido = false;
				int hora=0;
				while (!horaValido) {
					System.out.println("Digite o horário do compromisso");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Horário inválido. Digite novamente");
					}
				}
			
				dia--;
				System.out.print("Digite o compromisso: ");
				compromissos [dia][hora] = scan.next();

			} else if (opcao == 2) {
				boolean diaValido = false;
				int dia=0;
				while (!diaValido) {
					System.out.println("Digite o dia do mês");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido. Digite novamente");
					}
				}
				boolean horaValido = false;
				int hora=0;
				while (!horaValido) {
					System.out.println("Digite o horário do compromisso");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Horário inválido. Digite novamente");
					}
				}
				
				dia--;
				System.out.println("O comprommisso é: ");
				System.out.println(compromissos[dia][hora]);
				
			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opção inválida, digite novamente");
			}
		}
	}
}
