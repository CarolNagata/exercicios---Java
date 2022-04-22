package br.com.curso.aula33;

import java.util.Scanner;

public class TesteExercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		JogoVelhaEx04 jogoVelha = new JogoVelhaEx04();
		
		System.out.println("Jogador 1 = x");
		System.out.println("Jogador 2 = o");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		while (!ganhou) {
			
			if (jogoVelha.vezJogador1()) {
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'x';
			} else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'o';
			}
			
			linha = valor ("Linha", scan);
			coluna = valor ("Coluna", scan);
			
			if (!jogoVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posição já usada. Tente novamente.");
			}
			jogoVelha.imprimirTabuleiro();
			
			if (jogoVelha.verificarGanhador('x')) {
				ganhou = true;
				System.out.println("Parabéns ! Jogador 1 ganhou! ");
			} else if (jogoVelha.verificarGanhador('o')) {
				ganhou = true;
				System.out.println("Parabéns ! Jogador 2 ganhou! ");
			} else if (jogoVelha.getJogada() > 9) {
				ganhou = true;
				System.out.println("Ninguém ganhou essa partida ");
			}
	}
}

	static int valor (String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a " + tipoValor + "(1, 2 ou 3)");
			valor = scan.nextInt();
			if (valor >=1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada inválida, tente novamente");
			}
		}
		valor --;
		return valor;
		
	}
		
}
