package br.com.curso.aula13;

import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanto você ganha por hora trabalhada? ");
		float horaTrabalho = scan.nextFloat();
		System.out.print("Quantas horas você trabalhou esse mês? ");
		float horaMes = scan.nextFloat();
		
		float salarioMes = horaTrabalho * horaMes;
		System.out.println("Seu salário bruto esse mês será de R$ " + salarioMes);
		float inss = salarioMes*11/100;
		System.out.println("Valor pago ao INSS: R$ " + inss);
		float salarioLiq = salarioMes - inss;
		System.out.println("Valor do seu salário líquido será de R$ " + salarioLiq);
		
		

	}

}
