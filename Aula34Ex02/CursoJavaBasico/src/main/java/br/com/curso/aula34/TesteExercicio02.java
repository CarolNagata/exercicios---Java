package br.com.curso.aula34;

public class TesteExercicio02 {

	public static void main(String[] args) {
		
		imprimirTela(CalculadoraEx02.somar(1, 2));
		imprimirTela(CalculadoraEx02.subrair(2, 1));
		imprimirTela(CalculadoraEx02.multiplicar(2, 2));
		imprimirTela(CalculadoraEx02.dividir(4, 2));
		imprimirTela(CalculadoraEx02.potencia(2, 3));
	}
	
	static void imprimirTela(double num) {
		System.out.println(num);
	}
}
