package br.com.curso.aula52;

public class Contato {

	private int contador;
	
	private int id;
	private String nome;
	private String telefone;
	private String email;

	public Contato() {
		contador++;
		id = contador;	
	}
	
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String s= " Id:" + id;
			s += ", Nome:" + nome;
			s += ", telefone:" + telefone;
			s += ", email: " + email;
		return s;
	}
	
	
}
