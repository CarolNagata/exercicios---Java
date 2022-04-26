package br.com.curso.aula43;

public class Teste {

	public static void main(String[] args) {

		System.out.println("----- Teste ContaBancaria -----");

		ContaBancaria contaSimples = new ContaBancaria();
		System.out.println();
		contaSimples.setNomeCliente("Cliente conta simples");
		contaSimples.setNumConta("11111");

		contaSimples.depositar(100);
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);

		System.out.println(contaSimples);
		
		System.out.println("----- Teste ContaPoupan�a -----");

		ContaPoupan�a contaPoupan�a = new ContaPoupan�a();
		System.out.println();
		contaPoupan�a.setNomeCliente("Cliente conta poupan�a");
		contaPoupan�a.setNumConta("22222");
		contaPoupan�a.setDiaRendimento(27);

		contaPoupan�a.depositar(100);
		realizarSaque(contaPoupan�a, 50);
		realizarSaque(contaPoupan�a, 70);

		if (contaPoupan�a.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo � R$ " + contaPoupan�a.getSaldo());
		} else {
			System.out.println("Hoje n�o � dia de rendimento, saldo n�o calculado");
		}

		System.out.println(contaPoupan�a);
		
		System.out.println("----- Teste ContaEspecial -----");

		ContaEspecial contaEspecial = new ContaEspecial();
		System.out.println();
		contaEspecial.setNomeCliente("Cliente conta especial");
		contaEspecial.setNumConta("33333");
		contaEspecial.setLimite(50);

		contaEspecial.depositar(100);
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		realizarSaque(contaEspecial, 80);

		System.out.println(contaEspecial);

	}

	public static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println(
					"Saque efetuado com sucesso! Valor do saque R$ " + valor + " Novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de " + conta.getSaldo());
		}
	}

}
