package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio24 {

	public static void main(String[] args) {
		
		System.out.println("Panificadora Pão de Ontem - Tabela de Preços");
		
		for (int i = 0; i <= 50; i++) {
			System.out.println(i + "-- R$ " + (0.18*i));
		}
	}
}
