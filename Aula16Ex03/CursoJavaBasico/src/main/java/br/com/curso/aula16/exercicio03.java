package br.com.curso.aula16;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean dadosCadastro = false;
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;

		do {
			System.out.println("Digite seu nome completo:");
			nome = scan.next();
			if (nome.length() >= 3) {
				dadosCadastro = true;
			} else {
				System.out.println("Nome precisa no mínimo de 3 caracteres");
			}
		} while (!dadosCadastro);

		dadosCadastro = false;

		do {
			System.out.println("Digite sua idade:");
			idade = scan.nextInt();
			if (idade >= 0 && idade <= 150) {
				dadosCadastro = true;
			} else {
				System.out.println("A idade deve ser entre 0 e 150 anos");
			}
		} while (!dadosCadastro);

		dadosCadastro = false;

		do {
			System.out.println("Digite seu salário:");
			salario = scan.nextDouble();
			if (salario > 0) {
				dadosCadastro = true;
			} else {
				System.out.println("Salario precisa ser maior que zero");
			}
		} while (!dadosCadastro);
		
		dadosCadastro = false;
		do {
			System.out.println("Digite seu Sexo (F - feminino e M - masculino):");
			sexo = scan.next();
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				dadosCadastro = true;
			} else {
				System.out.println("Sexo precisa ser F ou M");
			}
		} while (!dadosCadastro);
		
		dadosCadastro = false;
		do {
			System.out.println("Digite seu estado civil (S - solteiro | C - casado | V - viúvo | D - divorciado):");
			estadoCivil = scan.next();
			if (estadoCivil.equalsIgnoreCase("s") || 
					estadoCivil.equalsIgnoreCase("c")||
					estadoCivil.equalsIgnoreCase("d")||
					estadoCivil.equalsIgnoreCase("v")) {
				dadosCadastro = true;
			} else {
				System.out.println("Estado civil precisa ser S,C, V ou D");
			}
		} while (!dadosCadastro);
		
		System.out.println("As seguintes informações foram coletadas:");
		System.out.println("Nome" + nome);
		System.out.println("Idade" + idade);
		System.out.println("Salário" + salario);
		System.out.println("Sexo" + sexo);
		System.out.println("Estado Civil" + estadoCivil);
		
	}

}
