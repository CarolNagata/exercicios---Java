package br.com.curso.aula27;

public class TesteExercicio02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456" ;
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta " + conta.numero + " = R$ " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		if (saqueEfetuado) {
			System.out.println("Saque realizado com sucesso");
			conta.consultaSaldo();
		} else {
			System.out.println("N?o foi poss?vel realizar saque. Saldo insuficiente.");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if (saqueEfetuado) {
			System.out.println("Saque realizado com sucesso");
			conta.consultaSaldo();
		} else {
			System.out.println("N?o foi poss?vel realizar saque. Saldo insuficiente.");
		}
		System.out.println("Dep?sito de 500 reais");
		conta.depositar(500);
		conta.consultaSaldo();
		
		if (conta.verificarChequeEspecial()) {
			System.out.println("Est? usando cheque especial");
		} else {
			System.out.println("N?o est? usando cheque especial");
		}
		
		saqueEfetuado = conta.realizarSaque(600);
		conta.consultaSaldo();
		if (conta.verificarChequeEspecial()) {
			System.out.println("Est? usando cheque especial");
		} else {
			System.out.println("N?o est? usando cheque especial");
		}
	}

}
