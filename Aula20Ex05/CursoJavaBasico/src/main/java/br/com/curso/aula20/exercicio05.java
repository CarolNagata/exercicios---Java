package br.com.curso.aula20;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][8];

		boolean sair = false;
		byte opcao;
		while (!sair) {

			System.out.println();
			System.out.println("Digite 1 para adicionar um compromisso");
			System.out.println("Digite 2 para verificar um compromisso");
			System.out.println("Digite 0 para sair");

			opcao = scan.nextByte();

			if (opcao == 1) {
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("Digite o m�s");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("M�s inv�lido. Digite novamente");
					}
				}
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Digite o dia do m�s");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido. Digite novamente");
					}
				}
				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println("Digite o hor�rio do compromisso");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 8) {
						horaValido = true;
					} else {
						System.out.println("Hor�rio inv�lido. Digite novamente");
					}
				}
				mes--;
				dia--;
				System.out.print("Digite o compromisso: ");
				compromissos[mes][dia][hora] = scan.next();

			} else if (opcao == 2) {
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("Digite o m�s");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("M�s inv�lido. Digite novamente");
					}
				}
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Digite o dia do m�s");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido. Digite novamente");
					}
				}
				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println("Digite o hor�rio do compromisso");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 8) {
						horaValido = true;
					} else {
						System.out.println("Hor�rio inv�lido. Digite novamente");
					}
				}

				dia--;
				System.out.print("O comprommisso �: ");
				System.out.println(compromissos[mes][dia][hora]);

			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Op��o inv�lida, digite novamente");
			}
		}
	}
}
