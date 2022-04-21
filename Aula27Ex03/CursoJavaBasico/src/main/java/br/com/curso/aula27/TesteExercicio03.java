package br.com.curso.aula27;

import java.util.Scanner;

public class TesteExercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		AlunoEx03 aluno = new AlunoEx03();
		
		System.out.print("Entre com o nome do aluno: ");
		aluno.nome = scan.next();
		System.out.print("Entre com o nome do curso: ");
		aluno.nomeCurso = scan.next();
		System.out.print("Entre com a matrícula: ");
		aluno.matricula = scan.next();
		
		
		aluno.nomeDisciplinas = new String [3];
		for (int i=0; i<aluno.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina " + (i+1));
			aluno.nomeDisciplinas[i] = scan.next();
		}
		
		aluno.notasDisciplina = new double [3][4];
		for (int i=0; i<aluno.notasDisciplina.length; i++) {
			System.out.println("Obtendo as notas das disciplina: " + aluno.nomeDisciplinas[i]);
			
			for (int j=0; j<aluno.notasDisciplina[i].length; j++) {
				System.out.println("Entre com a nota " + (j+1));
				aluno.notasDisciplina[i][j] = scan.nextDouble();
				
			}
		}
		
		aluno.mostrarInfoAluno();
		
		for (int i=0; i<aluno.nomeDisciplinas.length; i++) {
			if (aluno.verficarAprovado(i)) {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " foi APROVADO");
			} else {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " foi REPROVADO");
			}
		}

	}

}
