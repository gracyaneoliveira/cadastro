/*
 * Copyright 2013-2014 J7 Soluções Inteligentes.
 *
 * by Edivando Alves 
 * Contact: edivando@j7.eti.br
 * 
 */
package br.edu.ifce.exception;

/**
 * 
 * 
 * 
 * @author Edivando Alves
 *
 */
public class DAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DAOException() {
		super();
	}
	
	public DAOException(String message){
		super(message);
	}
	
	public DAOException(Throwable e){
		super(e);
	}
	
	public DAOException(String message, Throwable e){
		super(message, e);
	}
}
