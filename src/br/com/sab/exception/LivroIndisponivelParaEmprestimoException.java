package br.com.sab.exception;
@SuppressWarnings("serial")
public class LivroIndisponivelParaEmprestimoException extends Exception {
	public LivroIndisponivelParaEmprestimoException(String message)
    {
       super(message);
    }
}