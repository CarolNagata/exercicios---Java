package br.com.curso.aula43_2;

public class Teste {

	public static void main(String[] args) {

		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("110.298.120-63");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(5000);
		p2.setCnpj("06.707.515/0001-02");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2000);
		p3.setCpf("238.164.180-74");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contribuinte 04");
		p4.setRendaBruta(3000);
		p4.setCnpj("51.210.435/0001-00");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700);
		p5.setCpf("895.833.560-26");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 06");
		p6.setRendaBruta(4000);
		p6.setCnpj("18.739.300/0001-52");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes [0] = p1;
		contribuintes [1] = p2;	
		contribuintes [2] = p3;
		contribuintes [3] = p4;
		contribuintes [4] = p5;
		contribuintes [5] = p6;
		
		for (Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
	}

}





