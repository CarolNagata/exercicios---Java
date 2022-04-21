package br.com.curso.aula33;


public class TesteExercicio02 {

	public static void main(String[] args) {

		ContaCorrenteEx02 conta = new ContaCorrenteEx02();
		
		conta.setNumero("123456");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setValorEspecialUsado(0);
		conta.setSaldo(-10); 
		
		System.out.println("Saldo da conta " + conta.getNumero() + " = R$ " + conta.getSaldo());
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		if (saqueEfetuado) {
			System.out.println("Saque realizado com sucesso");
			conta.consultaSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente.");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if (saqueEfetuado) {
			System.out.println("Saque realizado com sucesso");
			conta.consultaSaldo();
		} else {
			System.out.println("Não foi possível realizar saque. Saldo insuficiente.");
		}
		System.out.println("Depósito de 500 reais");
		conta.depositar(500);
		conta.consultaSaldo();
		
		if (conta.verificarChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
		
		saqueEfetuado = conta.realizarSaque(600);
		conta.consultaSaldo();
		if (conta.verificarChequeEspecial()) {
			System.out.println("Está usando cheque especial");
		} else {
			System.out.println("Não está usando cheque especial");
		}
	}
}
