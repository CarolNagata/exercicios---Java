package br.com.curso.aula43_3;

public class Peixe extends Animal{

	private String caracteristicas;
	
	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("mar");
		this.setCor("cinzenta");
		this.caracteristicas = "barbatanas e cauda";
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracteristicas = " + caracteristicas;
		return s;
	}
	
	

	
}
