package br.com.projeto.kakau.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Não Localizamos um usuário com a id " + id);
		
	}
		
}
