package br.com.sab.exception;
@SuppressWarnings("serial")
public class TituloOuAutorNuloException extends Exception {
	public TituloOuAutorNuloException(String message)
    {
       super(message);
    }
}