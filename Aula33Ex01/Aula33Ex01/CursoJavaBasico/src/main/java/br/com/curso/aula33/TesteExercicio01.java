package br.com.curso.aula33;

public class TesteExercicio01 {

	public static void main(String[] args) {
		
		LampadaEx01 lampada = new LampadaEx01();
		
		lampada.ligar();
		lampada.mostrarEstado();
		
		lampada.desligar();
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		lampada.mostrarEstado();

	}

}
