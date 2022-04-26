package br.com.curso.aula43_3;

public class Mamifero extends Animal {

	private String alimento;
	
	public Mamifero() {
		super();
		this.setCor("Castanho");
		this.setAlimento("Mel");
		this.setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAlimento = " + alimento;
		return s;
	}

	
	
}
