package com.program.ciphers;

public class CipherException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String INVALID_CIPHER_CHARACTER = "Invalid cipher character!";
	public static final String INVALID_KEY = "Invalid key!";
	public static final String INVALID_SHIFT = "Invalid key shift!";
	
	public CipherException(String message) {
		
		super(message);
	}
	
	public CipherException(String message, Throwable cause) {
		
		super(message,cause);
	}

	
	
}
