package br.com.curso.aula36;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome da agenda: ");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda();
		agenda.setNome(nome);
		
		Contato[] contatos = new Contato[3];
			for (int i=0; i < 3; i++) {
				System.out.println("Digite as informações do contato " + (i+1));
				Contato c = new Contato();
				
				System.out.println("Digite o nome ");
				nome = scan.nextLine();
				c.setNome(nome);
				
				System.out.println("Digite o telefone ");
				String telefone = scan.nextLine();
				c.setTelefone(telefone);
				
				System.out.println("Digite o e-mail ");
				String email = scan.nextLine();
				c.setEmail(email);
				
				contatos[i] = c; // adicionar o objeto adicionado no array
			}
			
			agenda.setContatos(contatos); // depois que á obetve todas as informações
			if (agenda != null) {
				System.out.println(agenda.obterInfo());
			}
	}
}
