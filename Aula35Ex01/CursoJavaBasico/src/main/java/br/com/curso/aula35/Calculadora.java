package br.com.curso.aula35;

public class Calculadora {

	public static int fibonacci(int num) {
		
		if (num < 2) {
			return 1;
		}
		
		return fibonacci(num - 1) + fibonacci(num -2);
	}
}
