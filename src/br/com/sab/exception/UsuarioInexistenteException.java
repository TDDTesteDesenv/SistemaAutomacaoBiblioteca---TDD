package br.com.sab.exception;
@SuppressWarnings("serial")
public class UsuarioInexistenteException extends Exception {
	public UsuarioInexistenteException(String message)
    {
       super(message);
    }
}