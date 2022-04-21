package br.com.curso.aula33;

public class ContaCorrenteEx02 {

	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double valorEspecialUsado;
	private double saldo;
	
	public ContaCorrenteEx02() {}
	
	public ContaCorrenteEx02(String numero, String agencia, boolean especial, double limiteEspecial,
			double valorEspecialUsado, double saldo) {
		
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.valorEspecialUsado = valorEspecialUsado;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getValorEspecialUsado() {
		return valorEspecialUsado;
	}

	public void setValorEspecialUsado(double valorEspecialUsado) {
		this.valorEspecialUsado = valorEspecialUsado;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean realizarSaque (double valorSaque) {

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
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	public void consultaSaldo () {
		System.out.println("Saldo atual da sua conta é " + saldo);
	}
	
	public boolean verificarChequeEspecial () {
		return saldo < 0;
	}
}
