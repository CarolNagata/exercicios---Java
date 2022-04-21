package br.com.curso.aula15;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para vítima? S ou N");
		String resp1 = scan.next();
	
		System.out.println("Esteve no local do crime? S ou N");
		String resp2 = scan.next();	
		
		System.out.println("Mora perto da vítima? S ou N");
		String resp3 = scan.next();
		
		System.out.println("Já trabalhou com vítima? S ou N");
		String resp4 = scan.next();
		
		System.out.println("Devia para vítima? S ou N");
		String resp5 = scan.next();
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("s")) {
			cont++;
			}
		if (resp2.equalsIgnoreCase("s")) {
			cont++;
			}
		if (resp3.equalsIgnoreCase("s")) {
			cont++;
			}
		if (resp4.equalsIgnoreCase("s")) {
			cont++;
			}
		if (resp5.equalsIgnoreCase("s")) {
			cont++;
			}
		
		if (cont == 2) {
			System.out.println("Suspeito");
		}
		if (cont == 3 || cont == 4) {
			System.out.println("Cúmplice");
		}
		if (cont == 5) {
			System.out.println("Assassino");
		}else if (cont == 0){
			System.out.println("Inocente");
		}

	}

}
