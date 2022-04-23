package br.com.curso.aula36_1;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o nome do curso: ");
		String nomeCurso = scan.nextLine();
		
		System.out.print("Entre com o horário do curso: ");
		String horario = scan.nextLine();
		
		System.out.print("Entre com o nome do Professor: ");
		String nomeProf = scan.nextLine();
		
		System.out.print("Entre com o departamento do Professor: ");
		String depProf = scan.nextLine();
		
		System.out.print("Entre com o e-mail do Professor: ");
		String emailProf = scan.nextLine();
		
		Curso curso = new Curso();
		curso.setNomeCurso(nomeCurso);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNomeProf(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		curso.setProfessor(professor);
		
		System.out.println("------- Alunos -------");
		
		Alunos[] alunos = new Alunos[5];
		for (int i=0; i<5; i++) {
			
			scan.nextLine();
			
			System.out.println("Entre com o nome do aluno: " + (i+1));
			String nomeAluno = scan.nextLine();
			
			System.out.print("Entre com o numero de matrícula: ");
			String matricula = scan.nextLine();
			
			double notas[] = new double[4];
			for (int j=0; j<4; j++) {
				System.out.println("Entre com as notas: " + (j+1));
				notas[j] = scan.nextDouble();
			}
			
			Alunos aluno = new Alunos();
			aluno.setNomeAluno(nomeAluno);
			aluno.setMatricula(matricula);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos);
		System.out.println(curso.obterInfo());
		
	}

}














