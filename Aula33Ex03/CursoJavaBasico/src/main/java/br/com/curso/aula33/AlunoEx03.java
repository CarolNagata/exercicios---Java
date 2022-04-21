package br.com.curso.aula33;

public class AlunoEx03 {

	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas;
	double[][] notasDisciplina;

	public AlunoEx03() {
		nomeDisciplinas = new String[3];
		notasDisciplina = new double[3][4];
	}

	public AlunoEx03(String nome, String matricula, String nomeCurso) {

		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplinas = new String[3];
		this.notasDisciplina = new double[3][4];

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public double[][] getNotasDisciplina() {
		return notasDisciplina;
	}

	public void setNotasDisciplina(double[][] notasDisciplina) {
		this.notasDisciplina = notasDisciplina;
	}

	public void mostrarInfoAluno() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);

		for (int i = 0; i < notasDisciplina.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for (int j = 0; j < notasDisciplina[i].length; j++) {
				System.out.print(notasDisciplina[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean verficarAprovado (int indice) {
		if (obterMedia(indice) >= 7) {
			return true;
		} else {
			return false;
		}
	}

	private double obterMedia(int indice) {
		double soma = 0;

		for (int i = 0; i < notasDisciplina[indice].length; i++) {
			soma += notasDisciplina[indice][i];

		}
		
		double media = soma / 4;
		return media;
	}
	
	public void setNomeDisciplinaPos (int pos, String nomeDisciplina) {
		this.nomeDisciplinas[pos] = nomeDisciplina;
	}
	
	public void setNomePosIJ (int posI, int posJ, double nota) {
		this.notasDisciplina[posI][posJ] = nota;
	}
}










