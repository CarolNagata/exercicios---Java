package br.com.curso.aula34;

public class TesteExercicio01 {
	
	static void imprimirValor() {
		System.out.println(ContadorEx01.obterValor());
	}

	public static void main(String[] args) {
		
		imprimirValor();
		ContadorEx01.incrementar();
		
		imprimirValor();
		ContadorEx01.zerar();
		
		imprimirValor();	
	}

}
