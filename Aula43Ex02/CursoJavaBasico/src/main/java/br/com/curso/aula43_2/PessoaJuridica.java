package br.com.curso.aula43_2;

public class PessoaJuridica extends Contribuinte{

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
	}

	@Override
	public String toString() {
		String s = "----- PESSOA JURÍDICA -----";
		s += super.toString();
		s += "; PessoaJuridica CNPJ =" + cnpj ;
		s += "; Imposto a se pago R$ " + calcularImposto();
		return s;
	}
	
	
	
	
}
