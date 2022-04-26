package br.com.curso.aula43;

import java.util.Calendar;

public class ContaPoupan�a extends ContaBancaria {
	
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "Conta Poupan�a";
		s += "Dia de rendimento: " + diaRendimento;
		s += "; " + super.toString();
		return s;
	}
	
	public boolean calcularNovoSaldo (double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			return true;
		}
		return false;
	}

}





