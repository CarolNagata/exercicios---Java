package br.com.curso.aula27;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;


	boolean realizarSaque (double valorSaque) {

		if (saldo >= valorSaque) {
			saldo -= valorSaque;
			return true;
		} else {
			if (especial) {
				double limite = limiteEspecial + saldo;
				if (limite >= valorSaque) {
					saldo -= valorSaque;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
		
		}
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultaSaldo () {
		System.out.println("Saldo atual da sua conta é " + saldo);
	}
	
	boolean verificarChequeEspecial () {
		return saldo < 0;
	}
}










