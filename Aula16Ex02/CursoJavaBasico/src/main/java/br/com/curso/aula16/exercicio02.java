package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValida = false;
		String usuario;
		String senha;

		do {
			System.out.println("Entre com usuário:");
			usuario = scan.next();
			System.out.println("Entre com sua senha:");
			senha = scan.next();

			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual ao nome do usuário, digite uma nova senha.");
			} else {
				infoValida = true;
				System.out.println("Seu cadastro foi efetuado com sucesso!");
			}

		} while (!infoValida);

	}

}
