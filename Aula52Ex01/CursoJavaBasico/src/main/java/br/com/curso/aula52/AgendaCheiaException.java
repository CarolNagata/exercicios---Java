package br.com.curso.aula52;

public class AgendaCheiaException extends Exception {

	@Override
	public String getMessage() {
		return "Agenda j� est� cheia";
	}
}
