package br.com.curso.aula27;

public class AlunoEx03 {
	
	String nome;
	String matricula;
	String nomeCurso;
	String [] nomeDisciplinas;
	double [][] notasDisciplina;
	
	void mostrarInfoAluno () {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nome do curso: " + nomeCurso);
		
		for (int i=0; i<notasDisciplina.length; i++) {
			System.out.println("Notas da disciplina " + nomeDisciplinas[i]);
			for (int j=0; j<notasDisciplina[i].length; j++) {
				System.out.print(notasDisciplina[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	boolean verficarAprovado (int indice) {
		
		double soma = 0;
		
		for (int i=0; i<notasDisciplina[indice].length; i++) {
			soma += notasDisciplina[indice][i];
		}
		
		double media = soma / 4;
		if (media >= 7) {
			return true;
		} else {
			return false;
		}
	}

}
