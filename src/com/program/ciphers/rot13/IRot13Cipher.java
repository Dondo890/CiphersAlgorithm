package com.program.ciphers.rot13;

import com.program.ciphers.CipherException;

public interface IRot13Cipher {

	public String rot13Encode(String phrase) throws CipherException;
	
	public String rot13Decode(String phrase) throws CipherException;
	
}
