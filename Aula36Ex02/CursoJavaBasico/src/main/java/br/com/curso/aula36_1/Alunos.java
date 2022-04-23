package br.com.curso.aula36_1;

public class Alunos {

	private String nomeAluno;
	private String matricula;
	private double[] notas;
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String obterInfo() {
		String info = "Nome do aluno = " + nomeAluno + "; ";
		info += "Matricula = " + matricula + "; ";
		info += "Notas: ";
		
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
			info += nota + " ";
		}
		double media = soma / 4;
		info += "\n" + "Média = " + media + " - ";
		
		if (media >= 7) {
			info += "Aprovado!";
		} else {
			info += "Reprovado!";
		}
		return info;
	}
	
	public double obterMedia() {
		double soma = 0;
		for ( double nota : notas) {
			soma += nota;
		}
		return soma/4;
	}
}



