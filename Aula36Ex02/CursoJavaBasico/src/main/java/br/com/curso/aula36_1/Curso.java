package br.com.curso.aula36_1;

public class Curso {

	private String nomeCurso;
	private String horario;
	private Professor professor;
	private Alunos[] alunos;

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Alunos[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Alunos[] alunos) {
		this.alunos = alunos;
	}

	public String obterInfo() {
		String info = "Nome do curso = " + nomeCurso + "\n";

		if (professor != null) {
			info += professor.obterInfo();
		}
		if (alunos != null) {
			System.out.println("------ Alunos ------");
			for (Alunos alunos : alunos) {
				if (alunos != null) {
				info += alunos.obterInfo();
				info += "\n";
				}
			}
			info += "\nMedia da turma: " + obterMediaTurma();
		}
		return info;
	}

	public double obterMediaTurma() {
		double soma = 0;
		for (Alunos alunos : alunos) {
			if (alunos != null) {
				soma += alunos.obterMedia();
			}
		}
		return soma / alunos.length;
	}
}
