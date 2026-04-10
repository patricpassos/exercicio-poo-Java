package model.exceptions;

public class DomainException extends Exception {

	private static final long serialVersionUID = 1L;

	//a criação do construtor, permite instanciar a exceção personalizada
	public DomainException(String msg) {
		super(msg);
	}
}
