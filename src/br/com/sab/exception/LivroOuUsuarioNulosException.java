package br.com.sab.exception;
@SuppressWarnings("serial")
public class LivroOuUsuarioNulosException extends Exception {
	public LivroOuUsuarioNulosException(String message)
    {
       super(message);
    }
}