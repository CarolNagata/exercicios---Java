package br.com.curso.aula13;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanto voc� ganha por hora trabalhada? ");
		float horaTrabalho = scan.nextFloat();
		System.out.print("Quantas horas voc� trabalhou esse m�s? ");
		float horaMes = scan.nextFloat();
		
		float salarioMes = horaTrabalho * horaMes;
		System.out.println("Seu sal�rio bruto esse m�s ser� de R$ " + salarioMes);
		float inss = salarioMes*11/100;
		System.out.println("Valor pago ao INSS: R$ " + inss);
		float salarioLiq = salarioMes - inss;
		System.out.println("Valor do seu sal�rio l�quido ser� de R$ " + salarioLiq);
		
		

	}

}
